package array;

public class rotateMatrixBy90 {
    public int[][] solution(int arr[][]){
        int result[][]=new int[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                result[j][arr.length-1-i]=arr[i][j];
            }
        }

        return result;
    }
}
