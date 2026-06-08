package array;

public class maximumConsicativeOne {
    public int solution(int arr[]){
        int actualMax=0;
        int currentMax=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==1){
                    currentMax++;
                    actualMax=Math.max(currentMax, actualMax);
                }else{
                    currentMax=0;
                }
            }
            return actualMax;
    }   
}