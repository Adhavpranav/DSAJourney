import java.util.Arrays;

public class BinarySearchInTwoD {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };
        int target=10;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int [][]arr,int target){
        int row=0;
        int col=arr.length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            if(arr[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return  new int[]{-1,-1};
    }
}
