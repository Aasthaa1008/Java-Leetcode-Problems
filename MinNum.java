public class MinNum {
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static int Minimum(int[] arr){
        int min=arr[0];
        int n=arr.length;
        for (int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String [] args){
        int[] arr={3,2,4,7,10,6,5};
        printArray(arr);
        int result=Minimum(arr);
        System.out.println("Minimum Number in the array is = " +result);
    }
}
