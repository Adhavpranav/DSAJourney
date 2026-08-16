package array;

public class secoendLargest {
     public int secondLargestElement(int[] nums) {
        int largest=nums[0];
        int secoendLargest=-1;
        for(int i=1;i<nums.length;i++){
            if(largest<nums[i] ){
                secoendLargest=largest;
                largest=nums[i];
            }else if(nums[i]!=largest &&secoendLargest<nums[i] ){
                secoendLargest=nums[i];
            }
        }
        return secoendLargest;
    }   
}