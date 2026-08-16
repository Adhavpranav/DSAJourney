package array;

import java.util.*;


public class LeadersInArrayBruteforce {
    public ArrayList<Integer> solution(int arr[]){

    ArrayList<Integer> list=new ArrayList<>();
    boolean isLeader;
        for(int i=0;i<arr.length;i++){
            isLeader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    isLeader=false;
                    break;
                }
            }
            if(isLeader){
                list.add(arr[i]);
            }
        }
        return list;
    }   
}