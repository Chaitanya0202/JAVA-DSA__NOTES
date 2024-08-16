package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseUseingCollectionsMethods {

	public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        // Adding elements
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        // Printing original list
        System.out.println("Original LinkedList: " + nums);

        // Reversing the list using Collections.reverse()
        Collections.reverse(nums);

        // Printing reversed list
        System.out.println("Reversed LinkedList: " + nums);
    }
}
