package Searching;

public class FindInMountainArray {

    protected static int binarySearch(int[] arr, int top,int bottom, int target){

        boolean isIncreasing=arr[top]<arr[bottom];
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

    protected static int peakOfAnArray(int []arr){
        int top=0;
        int bottom=arr.length-1;
        while(top<bottom){
            int mid=top+(bottom-top)/2;
            if(arr[mid]<arr[mid+1]){
                top=mid+1;
            }else {
                bottom=mid;
            }
        }
        return top;
    }

    protected static int Search(int[] arr, int target){
        int peakIndex=peakOfAnArray(arr);
        int firstHalf=binarySearch(arr,0,peakIndex,target) ;
        int secondHalf=binarySearch(arr,peakIndex+1,arr.length-1,target);
        if(firstHalf==-1){
            return secondHalf;
        }else if(secondHalf==-1){
            return firstHalf;
        }
        return Math.min(firstHalf,secondHalf);
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(Search(arr,target));
    }
}
