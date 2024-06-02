public class Compilador {
    //Compilador de lenguaje Jala a Java para ejecutar
    public static String traductor(String code){
        code = code.replaceAll("main\\{", "public class Ejecutable {\n    public static void main(String[] args) {");
        code = code.replaceAll("imp \\(", "System.out.println(");
        code = code.replaceAll("Nu ", "int ");
        code = code.replaceAll("Txt ", "String ");
        code = code.replaceAll("SI ", "if ");
        code = code.replaceAll("PARA \\(", "for (");
        code = code.replaceAll("Return ", "return ");
        code = code.replaceAll("=>", ">=");
        code = code.replaceAll("==>", "==");
        code = code.replaceAll(":", ";");
        return code + "\n}";
    }
}
