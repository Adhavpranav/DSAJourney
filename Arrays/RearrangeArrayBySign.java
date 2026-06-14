package array;
import java.util.*;

public class RearrangeArrayBySign {
    public int[] solution(int arr[]){
        
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
                negative.add(arr[i]);
            else
                positive.add(arr[i]);
        }
        if(positive.size() > negative.size()){
            for(int i=0;i<negative.size();i++){
                arr[2*i]=positive.get(i);
                arr[2*i+1]=negative.get(i);
            }
            int index=negative.size()*2;
            for(int i=negative.size();i<positive.size();i++){
                arr[index]=positive.get(i);
                index++;
            }
        }else{
              for(int i=0;i<positive.size();i++){
                arr[2*i]=positive.get(i);
                arr[2*i+1]=negative.get(i);
            }
                 int index=positive.size()*2;
            for(int i=positive.size();i<negative.size();i++){
                arr[index]=negative.get(i);
                index++;
            }
        }
        return arr;
    }   
}
