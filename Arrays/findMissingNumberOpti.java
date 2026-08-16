package array;

public class findMissingNumberOpti {
 public int solution(int arr[],int limit){

    int totalSum=limit*(limit+1)/2;
    int actualSum=0;
    for(int i=0;i<arr.length;i++){
        actualSum+=arr[i];
    }
    return totalSum-actualSum;
 }   
}