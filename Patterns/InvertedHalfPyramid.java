
public class InvertedHalfPyramid {

    public void solution(int num){
        for(int i=num;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
}  

}