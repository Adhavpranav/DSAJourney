package array;

public class moveZeroAtLast {
    public int[] Solution(int arr[]){
        int countZero=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==0)
                countZero++;

        int temp[]=new int[arr.length-countZero];

        int index=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
                temp[index++]=arr[i];

        
        for(int i=0;i<temp.length;i++)
            arr[i]=temp[i];

        for(int i=temp.length;i<arr.length;i++)
                arr[i]=0;

        return arr;
    }   
}