package Searching;

public class SmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {

        int top=0;
        int bottom=letters.length-1;

        while(top<=bottom){
            int mid=top+(bottom-top)/2;
            if(letters[mid]<=target){
                top=mid+1;
            }else{
                bottom=mid-1;
            }
        }
        return letters[top % letters.length];
    }
}
