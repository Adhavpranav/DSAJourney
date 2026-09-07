package Searching;

public class CeilingBinarySearch {
    static protected int binarySearch(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        int top=0;
        int bottom=arr.length-1;
        while(top<=bottom){
            int mid=top+(bottom-top)/2;
            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]<target){
                top=mid+1;
            }else{
                bottom=mid-1;
            }
        }
        return top<=arr.length-1?arr[top]:-1;
    }

    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        System.out.println(binarySearch(arr,31));
    }
}
