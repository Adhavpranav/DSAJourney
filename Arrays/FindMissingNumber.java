package array;

public class FindMissingNumber {
 public int solution(int arr[],int limit){

    boolean flag=false;
    for(int i=1;i<=limit;i++){
        flag=false;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==i){
                flag=true;
                break;
            }
        }
        if(!flag)
            return i;
    }

    return -1;
 }   
}