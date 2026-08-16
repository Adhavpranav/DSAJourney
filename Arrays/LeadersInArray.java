package array;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public ArrayList<Integer> solution(int arr[]){
        int maxNumber=Integer.MIN_VALUE;
        ArrayList<Integer>list =new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>maxNumber){
                list.add(arr[i]);
            }
            maxNumber=Math.max(maxNumber, arr[i]);
        }
            Collections.reverse(list);
            return list;
    }   
}
