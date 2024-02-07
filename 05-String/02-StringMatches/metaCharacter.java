// Meta Character
// \d --> digit
// \D --> Not Digit
// \s --> space
// \S --> Not Space
// \w --> alphabates or digit
// \W -> neither alphabates  nor digit
public class metaCharacter {
    public static void main(String[] args) {
        String str="@";
        System.out.println(str.matches("\\d")); // Digit between 0-9
        System.out.println(str.matches("\\D")); // Non-Digits (Not between 0-9)
        System.out.println(str.matches("\\s")); // Spaces
        System.out.println(str.matches("\\S")); // Non-Spaces
        System.out.println(str.matches("\\w")); // Alphabets and digits
        System.out.println(str.matches("\\W")); // Neither Alphabets nor Digits
    }
}
