package patterns;

public class HollowRectangle {
     public void solution(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j==0 || j==col-1||i==0 ||i==row-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }     
}