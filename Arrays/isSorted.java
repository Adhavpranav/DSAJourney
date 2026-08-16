package array;

public class isSorted {
    public boolean isSortedArray(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]< arr[i-1])
                return false;
        }
        return true;
    }   
}