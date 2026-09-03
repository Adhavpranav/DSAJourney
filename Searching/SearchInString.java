package Searching;

public class SearchInString {
    public static void main(String[] args) {
        String name="Pranav";
        char ch='r';
        System.out.println(search(name, ch));
    }   

    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }

        for (char ch : str.toCharArray()) {
            //String itself cannot be used directly in a Java for-each loop
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
