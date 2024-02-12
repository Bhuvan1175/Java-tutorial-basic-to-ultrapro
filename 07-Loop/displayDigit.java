public class displayDigit {
    public static void main(String[] args) {
        int num=12345;
        while(num>0){
            int r=num%10;
            num=num/10;
            System.out.println(r);
        }
    }
}
