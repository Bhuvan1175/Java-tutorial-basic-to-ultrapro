//Find A number is binary or not
// find a number is hexadecimal or not
// find a data in date format DD/MM/YYYY;

public class studentChallengeII {
    public static void main(String[] args) {
        //Find A number is binary or not.
        int b=11;
        String str=String.valueOf(b);
        System.out.println("Original String is :"+str);
        if(str.matches("[0,1]+")) System.out.println(str+" Its A Binary Number. ");
        else System.out.println(str+ "Its Not A Binary Number.");

        // find a number is hexadecimal or not
        // 0-9 A-F
        String hex="0A37";
        if(hex.matches("[A-Z 0-9]+")) System.out.println(hex +" Is Hexadecimal");
        else System.out.println(hex +" Is Not Hexadecimal");

        // find a data in date format DD/MM/YYYY;
        // [0-3][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]{4}
        String DOB="27/05/2003";
        if(DOB.matches("[0-9][0-9]/[0-9][0-9]/[0-9]{4}")) System.out.println("Valid Date Of Birth ");
        else System.out.println("Invaild Date Of Birth");

    }    
}
