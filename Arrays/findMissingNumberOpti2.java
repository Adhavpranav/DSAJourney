package array;

public class findMissingNumberOpti2 {
 public int solution(int arr[],int limit){

    int xor1=0;
    int xor2=0;
    
    for(int i=0;i<limit-1;i++){
        xor1=xor1^arr[i];
        xor2=xor2^(i+1);
    }
    xor2=xor2^limit;

    return xor1^xor2;
 }   
}