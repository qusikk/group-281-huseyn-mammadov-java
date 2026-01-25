package homework_1;

import java.util.Arrays;

public class Homework_3 {
	public static void main(String[] args) {
		
		int[] num1 = {10, 20, 30, 40, 50};

		int[] num2 = Arrays.copyOfRange(num1, 1, 4);

		System.out.println(Arrays.toString(num2));
		
		
		int[] num3 = {1, 2, 3};
		int[] num4 = Arrays.copyOf(num3, 5);
		System.out.println(Arrays.toString(num4));
		
		
		int[] nums = {1, 3, 5, 7, 9};
		System.out.println(Arrays.binarySearch(nums, 5));
		
		
		String[] a = {"A", "B"};
		String[] b = {"A", "B"};
		System.out.println(Arrays.equals(a, b));
		
		
		int[] с = {1, 2, 3};
		int[] м = с.clone();
		System.out.println(Arrays.toString(м));
		
		
		int[] nums3 = new int[4];

		Arrays.fill(nums3, 5);

		System.out.println(Arrays.toString(nums3));





		
		

		
	}
}
