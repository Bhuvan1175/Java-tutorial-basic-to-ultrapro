public class initilization {
    public static void main(String[] args) {
        int A[]=new int[5]; //Declaration and Initialisation of an array with 5 elements.
        int B[]={1,2,3,4,5};//This is also a declaration and initialisation but not the same as above. Here we are assigning
        int C[];
        C=new int[5];
        int[] D= new int[10];//Array without declaration, directly initialised with 10 elements.
        System.out.println(D);
        B[2]=20;
        System.out.println(A.length);
        System.out.println(B.length);
        System.out.println(C.length);
    }    
}
