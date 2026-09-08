package Searching;

public class InfinitArray {

    static int ans(int []arr,int target){
        int start=0;
        int end=1;
        while(arr[end]<target){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int []nums,int target,int start,int end){
        if(nums.length==0){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if (nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70, 80,90};// i am Imagine an array is infinite
        int target=20;
        System.out.println(ans(arr,target));
    }
}
