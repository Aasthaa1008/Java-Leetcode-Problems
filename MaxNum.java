public class MaxNum {
    static int maxNum(int [] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int[] arr={3,2,4,7,100,6,5};
        printArray(arr);
        int result=maxNum(arr);
        System.out.println("Max Number in the array is = " +result);
    }
}
