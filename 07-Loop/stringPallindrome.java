import java.util.Scanner;

public class stringPallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter a String : ");
        String st=sc.nextLine();
        // int str = st.length() - 1;
        // System.out.println(str);
        String rev="";
        for(int i=st.length()-1;i>=0;i--){
            rev=rev+st.charAt(i);
        }
        System.out.println("Reverse  of the given word is : "+rev);
        if(st.equals(rev)){
            System.out.println("The Given Word Is Palindrome");
        }else{
            System.out.println( "The Given Word Is Not Palindrome");
        }
        sc.close();
    }
}
