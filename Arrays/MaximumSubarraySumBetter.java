package array;

public class MaximumSubarraySumBetter {
    public int solution(int arr[]){

        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum+=arr[j];
                maxSum=Math.max(maxSum,currentSum);
            }
        }
        return maxSum;
    }   
}
