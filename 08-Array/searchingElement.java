import java.util.Scanner;

public class searchingElement {
    public static void main(String[] args) {
        int Array[]={2,3,4,7,12,43,5,6,8,31};
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element you want to search:");
        key =sc.nextInt();
        for(int i=0;i<Array.length;i++){
            if(Array[i]==key){
                System.out.println("Element Found At :"+i);
                System.exit(0);
            }
        }
        System.out.println("Element Not Found");
        sc.close();
    }    
}
