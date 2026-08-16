public class InverteRightAlignedHalfPyramid {

    public void solution(int num){
      for(int i=num;i>0;i--){
         for(int k=i;k<num;k++){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
      }
}

}