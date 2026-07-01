package array;

public class SetMatrixZeroBetter {
    public int[][] solution(int arr[][]){

        int rows[]=new int[arr.length];
        int cols[]=new int[arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=0 && (rows[i]==1 || cols[j]==1)){
                    arr[i][j]=0;
                }
            }
        }

        return arr;

    }
}
