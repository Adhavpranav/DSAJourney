package array;

import java.util.LinkedList;

public class intersectionSortedArray {
    public int[] Solution(int arr1[],int arr2[]){
        LinkedList<Integer> list=new LinkedList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j])
                i++;
            else if(arr1[i]>arr2[j])
                j++;
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        int result[]=new int[list.size()];
        int index=0;
        for(Integer num:list)
            result[index++]=num;
        return result;
    }   
}