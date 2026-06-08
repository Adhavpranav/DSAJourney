package array;

public class LeftRotateArrayByDUsingTempArray {

 public int[] Solution(int arr[],int rotations){

        rotations =rotations % arr.length;
        if(rotations==0)
            return arr;
        int temp[]=new int[rotations];

        for(int i=0;i<rotations;i++){
            temp[i]=arr[i];
        }

        for(int i=rotations;i<arr.length;i++){
            arr[i-rotations]=arr[i];
        }

        int index=0;
        for(int i=arr.length-rotations;i<arr.length;i++){
            arr[i]=temp[index];
            index++;
        }
        return arr;
    }   
}