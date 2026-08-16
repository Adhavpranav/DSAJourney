package array;

public class largestNumber {
     public int largestElement(int[] nums) {
        int largestNumber=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largestNumber)
                largestNumber=nums[i];
        }
        return largestNumber;
    } 
}