import com.sun.jdi.OpaqueFrameException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;

import javax.swing.*;
import java.io.*;
import java.nio.charset.Charset;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {
            //Nombre archivo base Jala
            String file = "src/file2.txt";
            //Archivo destino convertido a Java
            String fileTraslate = "src/Ejecutable.java";
            //Utilizar gramatica creada y ejecutarla
            CharStream cs =  fromFileName(file);
            GramaticaLexer lexer = new GramaticaLexer( cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(token);
            ParseTree tree = parser.star();

            // Leer el archivo y traducirlo
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder codeBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                codeBuilder.append(line).append("\n");
            }
            reader.close();
            //Crear compilador para utlizarla
            Compilador compilador = new Compilador();
            String code = codeBuilder.toString();
            String codeTranslate = compilador.traductor(code);

            // Escribir el código traducido en un archivo .java
            FileWriter writer = new FileWriter(fileTraslate);
            writer.write(codeTranslate);
            writer.close();

            // Compilar el archivo .java
            Process compileProcess = Runtime.getRuntime().exec("javac " + fileTraslate);
            compileProcess.waitFor();

            // Ejecutar el archivo compilado
            Process runProcess = Runtime.getRuntime().exec("java -cp src Ejecutable");
            BufferedReader runReader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
            String runLine;
            while ((runLine = runReader.readLine()) != null) {
                System.out.println(runLine);
            }
            runReader.close();

        }catch (Exception e){
            System.err.println(e.toString());

        }
    }
}