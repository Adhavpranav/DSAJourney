package array;

public class LeftRotateArrayByDUsingReversal {
    public int[] Solution(int arr[],int rotations){
 
    rotations=rotations%arr.length;
    if(rotations==0)
        return arr;

        reverseArray(arr,0,rotations-1);
        reverseArray(arr, rotations, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
        return arr;

    }

    public void reverseArray(int arr[],int start,int end){
        for(int i=start,j=end;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}