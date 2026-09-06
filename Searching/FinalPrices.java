package Searching;

public class FinalPrices {
    public int[] finalPrices(int[] prices) {
        int []answer=new int[prices.length];
        for(int i=0;i<prices.length-1;i++){
            int currentDiscount=0;
            int j=i+1;
            while(j<prices.length){
                if(prices[j]<=prices[i]){
                    currentDiscount=prices[j];
                    break;
                }
                j++;
            }
            answer[i]=prices[i]-currentDiscount;
        }
        answer[prices.length-1]=prices[prices.length-1];
        return answer;
    }
}
