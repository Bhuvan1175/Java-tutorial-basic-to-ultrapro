// Regular Expression of string which is used to check pattern and matches.
//String matches
// . ---> Any Character
// [abc] ---> Character Exactly in that Set
// [abc][vz] --> Character Belongs to either set first or second.
// [^abc]---> Expect abc 
// [a-z A-z 0-9]---> Match any character between a to z,A to Z and 0 to 9.
// A|B -->A or B
// XZ --> Exactly xz

public class regularExpression {

    public static void main(String[] args) {
        String str="-";
        // For .
        System.out.println(str.matches("."));
        String str1="aA9";
        System.out.println(str1.matches("[abc]"));
        System.out.println(str1.matches("[abc][vz]"));
        System.out.println(str1.matches("[^abc]"));
        System.out.println(str1.matches("[a-z][A-Z][0-9]"));
        System.out.println(str1.matches("abc"));
        
    }
    
}