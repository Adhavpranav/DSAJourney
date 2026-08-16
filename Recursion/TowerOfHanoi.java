package Recursion;

public class TowerOfHanoi {

    public void solution(int numberOfDisk, char source, char helper, char destination) {

        if (numberOfDisk == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solution(numberOfDisk - 1, source, destination, helper);

        System.out.println("Move disk " + numberOfDisk + " from " + source + " to " + destination);

        solution(numberOfDisk - 1, helper, source, destination);
    }
}
