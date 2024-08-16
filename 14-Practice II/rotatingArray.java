public class rotatingArray {
    public static void main(String[] args) {
        int arr[]={4,9,5,6,7,2,33,52,98};
        for (int X : arr) {
            System.out.print(X+",");
        }
        System.out.println("");
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        for (int X : arr) {
            System.out.print(X+",");
        }
        System.out.println("");
    }
}
