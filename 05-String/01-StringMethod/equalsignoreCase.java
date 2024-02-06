public class equalsignoreCase {
    public static void main(String[] args) {
        String str="Java";
        String str1="java";
        String str2="python";
        String str3="python";
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str3==str2);
    }    
}
