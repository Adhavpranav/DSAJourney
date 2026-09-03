package Searching;

public class SearchInRange {

    static boolean search(int [] arr,int target,int startingIndex,int endIndex){
        if(arr.length <startingIndex && arr.length == 0) {
            return false;
        }
        for(int i=startingIndex;i<=endIndex && i<arr.length;i++){
            if(arr[i]==target){
                return  true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int target=20;
        int startingIndex=1;
        int endIndex=3;
        System.out.println(SearchInRange.search(arr,target,startingIndex,endIndex));
    }
}
