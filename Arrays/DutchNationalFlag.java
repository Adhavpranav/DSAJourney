package array;

public class DutchNationalFlag {
   
    public int[] solution(int arr[]){

        if(arr == null || arr.length == 0)
        return arr;

        int low=0,high=arr.length-1,mid=0;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
        return arr;
    }
    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
