package array;

import java.util.*;

public class twoSumUsingTwoPointer {
    public boolean solution(int arr[],int target){

        Arrays.sort(arr);
         // Sorting is mandatory for the Two Pointer approach.
        // After sorting, the original indices change.
      // Therefore, original indices cannot be returned directly.
    // To return original indices, store them separately before sorting

        int left=0;
        int right=arr.length-1;

        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum == target)
                return true;
            else if(sum<target) left++;
            else right--;
        }
        
        return false;
    }   
}
