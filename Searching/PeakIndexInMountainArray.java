package Searching;

public class PeakIndexInMountainArray {
   static public int peakIndexInMountainArray(int[] arr) {

//       i can also use linearSearch here

       int top=0;
       int bottom=arr.length-1;
       while(top<bottom){
           int mid=top+(bottom-top)/2;
           if(arr[mid]>arr[mid+1]){
                bottom=mid;
                // here i am not doing mid-1 cause either our mid is peak or it at its left side
           }else{
               top=mid+1;// here we know if mid <mid+1 we just ingnore that left part 
           }
       }
       return top;// top and bottom at same positions

    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 8, 12, 10, 7, 3, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }
}   
