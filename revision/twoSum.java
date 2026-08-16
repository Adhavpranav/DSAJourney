package revision;

public class twoSum{
   public int[] solution(int arr[],int target){
        for(int i=0;i<arr.length;i++){//[2, 7, 11, 15]  target = 9
            for(int j=i+1;j<arr.length;j++){
                int currentSum=arr[i]+arr[j];
                if(currentSum==target)
                    return new int[]{arr[i],arr[j]};
            }
        }
        return new int[]{-1,-1};
   }
}