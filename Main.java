package com.gmail.oastro36;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int[] array = generateArray(100_000_000);
		Map<Integer, Integer> numbers = count(array);
		Set<Integer> keys = numbers.keySet();
		for (Integer key : keys) {
			System.out.println(key + " = " + numbers.get(key) + "\t" + (numbers.get(key) * 100.0) / array.length + "%");
		}
//		System.out.println(Arrays.toString(array));
	}

	public static int[] generateArray(int n) {
		int[] array = new int[n];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(10);
		}
		return array;
	}

	public static Map<Integer, Integer> count(int[] array) { // {2, 3, 3, 2}
		Map<Integer, Integer> number = new HashMap<>();
			for (int numOne : array) {			
				if (!number.containsKey(numOne)) {
					number.put(numOne, 1);
				} else {
					number.put(numOne, (number.get(numOne) + 1));				
				}
			}
		return number;
	}
}
