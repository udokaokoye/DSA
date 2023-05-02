// !Problem: look through an array of numbers and find where the value is equals to a given target
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {

    public static Integer binary_search(ArrayList<Integer> numbers, int target) {
        int first = 0;
        int last = numbers.size() - 1 ;
        while (first <= last) {
             double indextotalividedbytwo = (first + last) / 2;
            int midpoint = (int) Math.floor(indextotalividedbytwo);
            if (target == numbers.get(midpoint)) {
                return midpoint;
            } else if (target > numbers.get(midpoint)) {
                    first = midpoint + 1;
                } else {
                    last = midpoint - 1;
                }
            }
        
        return -1;
    }

    public static void verify(int index) {
        if (index == -1) {
            System.out.println("Target Not Found");
        } else {
            System.out.println("Target Found At Index " + index);
        }
    }
    
    public static void main(String[] args) {
       ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       verify(binary_search(numbers, 25));
    }
    
}

// !Written by Levi.dev__