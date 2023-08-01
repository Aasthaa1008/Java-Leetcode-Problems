public class MoveZero {
    static int [] moveZero(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int[] arr={3,0,4,0,0,6,5};
        printArray(arr);
        moveZero(arr);
        printArray(arr);
    }
}
