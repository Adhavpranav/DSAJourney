package Searching;

public class OrderAgnosticBs {
    static protected int binarySearch(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        int top=0;
        int bottom=arr.length-1;
        boolean isIncreasing= arr[top]<arr[bottom];

        while(top<=bottom){
            int mid=top+(bottom-top)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isIncreasing){
                if(arr[mid]<target){
                    top=mid+1;
                }else{
                    bottom=mid-1;
                }
            }else{
                if(arr[mid]>target){
                    top=mid+1;
                }else{
                    bottom=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int[] temp = {40, 30, 20, 10};
        System.out.println(binarySearch(arr, 20));
        System.out.println(binarySearch(temp, 20));
    }
}
