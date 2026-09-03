package Searching;
import java.math.*;

public class EvenDigits {
    public int findNumbers(int[] nums) {
        int totalCount=0;
        for(int i=0;i<nums.length;i++){
            int numberOfDigits=0;
            int currentNumber=nums[i];

            numberOfDigits=(int)Math.log10(currentNumber)+1;
//            123 → log10(123) ≈ 2.09
        //     → 2 + 1
        //     → 3 digits
            if(numberOfDigits%2==0)
                totalCount++;
        }
        return totalCount;
    }
}
