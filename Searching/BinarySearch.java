package Searching;

public class BinarySearch {
    static int binarySearch(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
          int mid=start+(end-start)/2;
          // it will make Overflow-safe
          if(arr[mid]==target){
              return mid;
          }else if (arr[mid]<target){
              start=mid+1;
          }else{
              end=mid-1;
          }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60};
        int target=30;
        System.out.println(BinarySearch.binarySearch(arr,target));
    }
}
