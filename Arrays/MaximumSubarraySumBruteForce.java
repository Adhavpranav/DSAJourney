package array;

public class MaximumSubarraySumBruteForce {

    public int solution(int arr[]){

        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                maxSum=Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }    
}
