package array;

public class findMissingNumberbetter {
 public int solution(int arr[],int limit){

    int hashing[]=new int[limit+1];

    for(int i=0;i<arr.length;i++){
        hashing[arr[i]]=1;
    }

    for(int i=1;i<hashing.length;i++){
        if(hashing[i]==0)
            return i;
    }

    return -1;
 }   
}