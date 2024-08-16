package LinkedList;

import java.util.LinkedList;

public class SecondWayToReverse {

	
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

        // Reversing the list
        reverseLinkedList(nums);

        // Printing reversed list
        System.out.println("Reversed LinkedList: " + nums);
    }

    // Method to reverse a LinkedList
    public static void reverseLinkedList(LinkedList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.get(n - i - 1));
            list.set(n - i - 1, temp);
        }
    }
}
