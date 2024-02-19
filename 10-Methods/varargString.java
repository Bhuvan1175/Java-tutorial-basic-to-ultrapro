public class varargString {
    static void showList(int start,String... str)
    // You cannot do like ..
    // static void showList(String...str,int start)
    // Beacvuse the variable argument must be last parameter
     {
        for(int i=0;i<str.length;i++){
            System.out.println(start +"."+str[i]);
            start++;
        }
    }
    public static void main(String[] args) {
        showList(1,"Bhuvi","Rahul","Amit","Abhishekh","Harsh");
    }
}
