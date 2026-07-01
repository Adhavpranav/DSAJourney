package array;

public class SetMatrixZeros {
    public int[][] solution(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    setColZero(arr, j);
                    setRowZero(arr, i);
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }

        return arr;

    }  
    
    public void setColZero(int arr[][],int j){
        for(int i=0;i<arr.length;i++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }

    public void setRowZero(int arr[][],int i){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }

}
