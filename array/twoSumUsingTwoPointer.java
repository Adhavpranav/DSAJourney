package array;

import java.util.*;

public class twoSumUsingTwoPointer {
    public boolean solution(int arr[],int target){

        Arrays.sort(arr);

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