public class regularStringCheck {
    public static void main(String[] args) {
        String binary="010101101";
        boolean isBinary=binary.matches("[01]*");
        System.out.println("isBinary : "+isBinary);

        String hexaDecimal="01AFC8";
        System.out.println(hexaDecimal.matches("[0-9A-F]+"));

        String str="  abc   def   ghi  jkl";
        System.out.println(str.replaceAll("\\s+"," ").trim());
        String word[]=str.split("\\s");
        System.out.println(word.length);

    }
}
