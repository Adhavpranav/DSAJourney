package array;

public class BestTimeToBuyAndSellStock {
    public int solution(int arr[]){

        int min=arr[0];
        int maxProfit=0;

        for(int i=1;i<arr.length;i++){
            int cost=arr[i]-min;
            maxProfit=Math.max(maxProfit, cost);
            min=Math.min(min, arr[i]);
        }
        return maxProfit;
    }   
}
