package array;

public class leftRotation {
    public int[] leftRotationByOne(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
}