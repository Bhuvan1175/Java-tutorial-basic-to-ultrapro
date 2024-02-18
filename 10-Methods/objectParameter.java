public class objectParameter {
    static void change(int x[],int index,int value){
        x[index]=value;
    }    
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        change(A,2,100);
        for(int x:A){
            System.out.print(x+" ");
        }
    }
}
