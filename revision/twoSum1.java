package revision;


import java.util.*;
public class twoSum1 {
    public int[] solution(int arr[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int requiredSum=target-arr[i];
                if(map.containsKey(requiredSum)){
                    return new int[]{map.get()}
                }
            map.put(arr[i],i);
        }
         return new int[]{-1,-1};
    }   
}