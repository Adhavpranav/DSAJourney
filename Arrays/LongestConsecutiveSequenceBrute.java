package array;

public class LongestConsecutiveSequenceBrute {
    public int solution(int arr[]){ 
        if(arr.length==0)
            return 0;
        int longest=1;
        
        for(int i=0;i<arr.length;i++){
            int currentNumber=arr[i];
            int count=1;
            while(true){
                boolean found=false;
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==currentNumber+1){
                        currentNumber++;
                        count++;
                        found=true;
                        break;
                    }
                }
                if(!found){
                    break;
                }
            }
            longest=Math.max(count, longest);
        }
        return longest;
    }
}
