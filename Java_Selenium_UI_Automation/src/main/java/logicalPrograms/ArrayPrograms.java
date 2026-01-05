package logicalPrograms;

import java.util.Arrays;
import java.util.TreeSet;

public class ArrayPrograms {

	public static void main(String[] args) {

		int[] ar1 = { 1, 2, 4, 5, 7, 8, 2, 4 };
		int[] ar2 = { 1, 2, 4, 5, 7, 8, 2, 4 , 3};

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

		
// Array sorting 
		//1. Using inbuilt method
		System.out.println("---- Array before sorting : "+Arrays.toString(ar1));
		Arrays.sort(ar1);
		System.out.println("---- Array after sorting : "+Arrays.toString(ar1));

		//2. Using for loop
		System.out.println("---- Array before sorting : "+Arrays.toString(ar2));
		for(int i=0; i<ar2.length; i++) {
			for(int j=i+1; j<ar2.length;j++) {
				if(ar2[i] > ar2[j]) {
					int temp =ar2[i];
					ar2[i]=ar2[j];
					ar2[j]=temp;
				}
			}
		}
		System.out.println("---- Array after sorting using for loop : "+Arrays.toString(ar2));
		
// get even and odd from array and print them in order
		System.out.println("----- get even and odd from array and print them in order -----");
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int num : ar1) {
			if(num % 2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		
		int [] evenArr = new int[evenCount];
		int [] oddArr = new int[oddCount];
		
		int eIndex=0;
		int oIndex=0;
		
		for(int num : ar1) {
			if(num%2==0) {
				evenArr[eIndex++]=num;
			}
			else {
				oddArr[oIndex++]=num;
			}
		}
		
		Arrays.sort(evenArr);
		Arrays.sort(oddArr);
		System.out.println("Even Array : "+Arrays.toString(evenArr));
		System.out.println("Odd Array : "+Arrays.toString(oddArr));
		
		
// Unique numbers from both arrays and print them in order
		System.out.println("----- Unique numbers from both arrays and print them in order -----");
		
		TreeSet<Integer> result = new TreeSet<>();
		for(int num : ar1) {
			result.add(num);
		}
		
		for(int num : ar2) {
			result.add(num);
		}
		
		System.out.println(tr);
		Object[] result1 = tr.toArray();
		System.out.println(Arrays.toString(result1));
		
		
// Max sum sub array
		System.out.println("----- Max sum sub array -----");
		
		int  [] ar3 = {-2, 1, -3, 4, -1, 2, 1, -5, 4 };
		
		int currSum = 0;
		int maxSum = 0;
		
		for(int i=0; i<ar3.length; i++) {
			currSum = currSum + ar3[i];
			if(maxSum < currSum) {
				maxSum = currSum;
			}
			
			if(currSum < 0) {
				currSum=0;
			}
		}
		System.out.println("Max sum : "+ maxSum);
		
		
// Leader number from array - A number is  greater than all numbers of its right within the array
		System.out.println("----- Leader number from array -----");
		
		int length = ar1.length;
		int maxRight = ar1[length-1];
		System.out.println("maxRight");
		
		for(int i=length-2; i>=0; i--) {
			if(maxRight < ar1[i]) {
				System.out.println(ar1[i]);
				maxRight = ar1[i];
			}
		}
		
		
		
	}

}
