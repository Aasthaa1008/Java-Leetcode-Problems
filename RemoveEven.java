public class RemoveEven{
    static int [] removeEven(int[] arr){
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] res=new int[oddCount];
        int idx=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                res[idx]=arr[i];
                idx++;
            }
        }
        return res;
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int[] arr={3,2,4,7,10,6,5};
        //printArray(arr);
        int[] result=removeEven(arr);
        printArray(result);
        
    }
}