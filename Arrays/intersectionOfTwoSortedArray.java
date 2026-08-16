package array;
import java.util.*;
public class intersectionOfTwoSortedArray {
    public int[] Solution(int arr1[],int arr2[]){
    int isVisited[] = new int[arr2.length];
    LinkedList<Integer> list=new LinkedList<>();

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j] && isVisited[j]!=1){
                    list.add(arr1[i]);
                    isVisited[j]=1;
                    break;
                }
                if(arr2[j]>arr1[i])
                    break;
            }
        }
        int result[]=new int[list.size()];
        int index=0;
        for(Integer num:list){
            result[index++]=num;
        }
        return result;
    }   
}