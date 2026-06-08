package array;

public class LinearSearch {
    public boolean Solution(int arr[],int key){
        for(int i=0;i<arr.length;i++)
            if(arr[i]==key)
                return true;
        return false;
    }   
}