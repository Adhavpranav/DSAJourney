package array;
import java.util.*;
public class LongestConsicativeBetter {
    public int solution(int arr[]){
            if(arr.length==0)
                return 0;

            Arrays.sort(arr);

            int longest=1;
              int count=1;
            for(int i=1;i<arr.length;i++){
              
                if((arr[i]-arr[i-1])==1){
                    count++;
                }else if((arr[i]-arr[i-1])==0){
                    continue;
                }else{
                    count=1;
                }
                longest=Math.max(longest, count);
            }
            return longest;
    }   
}
