public class RemoveDuplicatesFromSortedArray{
    static  int removeDuplicates(int[] arr,int n){
        if (n==0 || n==1){  
            return n;  
        }  
        int j=0;
        int temp[]=new int [n];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
                
            }
        }
        temp[j++]=arr[n-1];
        //changing original array
        for(int i=0;i<j;i++){
            arr[i]=temp[i];
        }
        return j;
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int [] arr={3,4,4,5,5,6,7,8,8,9};//provide a sorted array
        int length =arr.length;
        length=removeDuplicates(arr,length);
        for(int i=0;i<length;i++){
            System.out.println(arr[i]+" ");
        }
        
    }
}