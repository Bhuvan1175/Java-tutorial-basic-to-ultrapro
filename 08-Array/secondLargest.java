public class secondLargest {
    public static void main(String[] args) {
        int arr[] = {2, 45, 67, 39};
        int max1=arr[0];
        int max2=arr[0];
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("The second largest element is "+max2);
    }    
}
