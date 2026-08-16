package array;

public class SortColors {
    public int[] solution(int arr[]){
       int zeroCount=0;
       int oneCount=0;
       int twoCount=0;

       for(int i=0;i<arr.length;i++){
        if(arr[i]==0)
            zeroCount++;
        else if(arr[i]==1)
            oneCount++;
        else
            twoCount++;
       }

       int i=0;
       while(zeroCount>0){
            arr[i++]=0;
            zeroCount--;
       }

       while(oneCount>0){
            arr[i++]=1;
            oneCount--;
       }

       while(twoCount>0){
            arr[i++]=2;
            twoCount--;
       }

       return arr;
    }   
}
