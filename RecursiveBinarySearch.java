// !Problem: look through an array of numbers and find where the value is equals to a given target
import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveBinarySearch {

    public static Boolean recursive_binary_search(ArrayList <Integer> numbers, int target) {
        double indextotalividedbytwo = numbers.size() / 2;
        int midpoint = (int) Math.floor(indextotalividedbytwo);

        if (numbers.size() <= 0) {
             return false;
        } else if (numbers.get(midpoint) == target) {
                return true;
            } else if (target > numbers.get(midpoint)) {
                
                    return recursive_binary_search(new ArrayList<>(numbers.subList(midpoint + 1, numbers.size())), target);
                } else {
                    return recursive_binary_search(new ArrayList<>(numbers.subList(0, midpoint - 1)), target);
                }
            }

            public static void verify(boolean foundTarget) {
                if (foundTarget == false) {
                    System.out.println("Target Not Found");
                } else {
                    System.out.println("Target Found!");
                }
            }
        

    

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        verify(recursive_binary_search(numbers, 6));
    }
}

// !Written by Levi.dev__
