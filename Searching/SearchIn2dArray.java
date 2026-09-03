package Searching;

public class SearchIn2dArray {

    static int [] search(int [][] arr,int target){
        if(arr.length==0)
            return new int[]{-1,-1};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i, j};                }
            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [][] arr={
                {10,20,50},
                {1,2,3},
                {40,60,80}
        };

        int target=60;
        int result[]=SearchIn2dArray.search(arr,target);
        System.out.println("Number found at :"+result[0]+" "+result[1]);
    }
}
