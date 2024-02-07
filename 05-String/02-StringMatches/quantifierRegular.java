//Quantifiers
// * --> zero or more time
// + -->  one or more times
// ? --> zero or one time
// {n} --> exactly n times
// {n,m} --> minimum n , max m
public class quantifierRegular {
    public static void main(String[] args) {
        String str="abcdakdskdsks";
        System.out.println(str.matches(".*"));
        String str1="--9d";
        System.out.println(str1.matches("[abc]*"));
        System.out.println(str1.matches("[abc]+"));
        System.out.println(str1.matches(".{3}"));
        System.out.println(str1.matches(".{3,4}"));
        String email="--@gmail.com";
        System.out.println(email.matches("\\w*@gmail.*"));
    }    
}
