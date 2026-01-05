package logicalPrograms;

import java.util.Arrays;
import java.util.TreeSet;

public class ArrayPrograms {

	public static void main(String[] args) {

		int[] ar1 = { 1, 2, 4, 5, 7, 8, 2, 4 };
		int[] ar2 = { 1, 2, 3, 4, 5, 6, 7, 8 };

		// Check array equals
		System.out.println("----- Check array equals -----");
		// 1. using in built method
		boolean status1 = Arrays.equals(ar1, ar2);
		if (status1 == true) {
			System.out.println("Arrays are equals");
		} else {
			System.out.println("Arrays are not equal");
		}

		// 2. without using in built method
		boolean status2 = true;
		if (ar1.length == ar2.length) {
			for (int i = 0; i < ar1.length; i++) {
				if (ar1[i] != ar2[i]) {
					status2 = false;
					break;
				}
			}
		} else {
			status2 = false;
		}
		if (status2 == true) {
			System.out.println("Arrays are equals");
		} else {
			System.out.println("Arrays are not equal");
		}

		// Remove duplicate and add missing number in array
		System.out.println("----- Remove duplicate and add missing number in array -----");
		TreeSet<Integer> tr = new TreeSet<>();

		for (int num : ar1) {
			tr.add(num);
		}

		int min = ar1[0];
		int max = ar1[0];

		for (int num : ar1) {
			if (num < min) {
				min = num;
			} else if (num > max) {
				max = num;
			}
		}

		for (int i = min; i <= max; i++) {
			tr.add(i);
		}
		System.out.println(tr.toString());

	}

}
