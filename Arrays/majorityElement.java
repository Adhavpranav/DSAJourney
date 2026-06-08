package array;

public class majorityElement {
    public int solution(int arr[]){
        int majorityCount=1;
        int majorityElement=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]==majorityElement){
                majorityCount++;
            }else{
                majorityCount--;
                if(majorityCount==0){
                    majorityCount=1;
                    majorityElement=arr[i];
                }
            }
        }
        return majorityElement;

    }
}