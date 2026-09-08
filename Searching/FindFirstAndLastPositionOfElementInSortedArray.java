package Searching;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int []result={-1,-1};
        int first=search(nums,target,true);
        int last=search(nums,target,false);
        result[0]=first;
        result[1]=last;
        return result;
    }

    int search(int []arr,int target,boolean isFirstPosition){
        int top=0;
        int bottom=arr.length-1;
        int currentIndex=-1;
        while(top<=bottom){
            int mid=top+(bottom-top)/2;
            if(arr[mid]==target){
                currentIndex=mid;
                if(isFirstPosition){
                    bottom=mid-1;
                }else{
                    top=mid+1;
                }
            }else if(arr[mid]<target){
                top=mid+1;
            }else{
                bottom=mid-1;
            }
        }
        return currentIndex;
    }
}
