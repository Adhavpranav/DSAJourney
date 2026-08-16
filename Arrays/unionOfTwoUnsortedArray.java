package array;
import java.util.*;
public class unionOfTwoUnsortedArray {
    public int[] Solution(int arr1[],int arr2[]){

        Set<Integer> set = new TreeSet<>();

        for(int i=0;i<arr1.length;i++)
            set.add(arr1[i]);
        for(int i=0;i<arr2.length;i++)
            set.add(arr2[i]);

        int union[]=new int[set.size()];
        int index=0;
        for(Integer num: set){
            union[index++]=num;
        }
        return union;
    }    
}   