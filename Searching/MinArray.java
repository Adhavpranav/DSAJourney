package Searching;

public class MinArray {
    static int findMinimum(int []arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int []arr={20,10,30,40,50};
        System.out.println(MinArray.findMinimum(arr));
    }
}
