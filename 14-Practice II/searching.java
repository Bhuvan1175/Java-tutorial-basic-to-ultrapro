public class searching {
    public static void main(String[] args) {
        int A[]={3,44,55,2,5,10,47,9,8,1};
        int target = 5;     
        for (int X : A) {
            if(X==target){
                System.out.println(+target +" Found at "+X);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }    
}
