package array;
import java.util.*;
public class unionOfTwoSortedArray {
       public int[] Solution(int arr1[],int arr2[]){
        
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;

        while(i<arr1.length && j<arr2.length){
           if(arr1[i]<=arr2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
           }
           else{
             if(list.size()==0 || list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
           }
        }

        while(i<arr1.length){
             if(list.size()==0 || list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
        }
         while(j<arr2.length){
             if(list.size()==0 || list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
        }

        int union[]=new int[list.size()];
        int index=0;
        for(Integer num:list){
            union[index++]=num;
        }
        return union;
            
       }
}