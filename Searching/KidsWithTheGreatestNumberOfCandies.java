package Searching;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNoOfCandies=0;
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
            maxNoOfCandies=Math.max(maxNoOfCandies,candies[i]);
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>= maxNoOfCandies)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}
