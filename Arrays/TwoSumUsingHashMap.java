package array;
import java.util.*;

public class twoSumUsingMap {
    public int[] solution(int arr[],int sum){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int requiredNumber=sum -arr[i];
            if(map.containsKey(requiredNumber)){
                return new int[]{map.get(requiredNumber),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1, -1};
    }
}
