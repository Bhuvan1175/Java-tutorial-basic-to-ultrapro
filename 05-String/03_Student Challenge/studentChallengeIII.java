//Remove special character from string.
//Remove extra spaces from string.
//find number of words in string.
public class studentChallengeIII {
    public static void main(String[] args) {
        //Remove special character from string.
        String str="a@Z!c#9^";
        System.out.println("Original String  : "+str);
        String str1=str.replaceAll("[^a-z 0-9 A-Z]","");
        System.out.println( "Remove Special Character : "+str1 );
        //Remove extra spaces from string
        String str2="abc def ghi jkl";
        System.out.println("Before Remove Spaces :"+str2);
        String str3=str2.replaceAll("\\s","");
        System.out.println("After Remove Spaces   :"+str3);
        //Find the number of words in a given string.
        String word= "Hello World How Are You?";
        String  []words =word.split(" ");
        System.out.println( "Number Of Words In The Given Sentence : "+words.length);
    }    
}
