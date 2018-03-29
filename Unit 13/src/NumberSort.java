
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;

public class NumberSort {
	// instance variables and other methods not shown

	private static int getNumDigits(int number) {
		int count = 0;
		return count;
	}

	public static int[] getSortedDigitArray(int number) {
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		while (number > 0) {
			sorted.add(number % 10);
			number = number / 10;
		}
		int[] sorted2 = new int[sorted.size()];
		for (int i = 0; i < sorted.size(); i++) {
			sorted2[i] = sorted.get(i);
		}
		Arrays.sort(sorted2);
		return sorted2;
	}
}