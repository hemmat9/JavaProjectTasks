package JavaProject01;

import java.util.Scanner;

public class ProjectTask10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		System.out.println("Enter the size of Array");
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements into Array");

		for (int i = 0; i < size; i++) {

			arr[i] = scan.nextInt();
		}
		int Max = arr[0];
		int sMax = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > Max) {
				sMax = Max;
				Max = arr[i];

			} else if (arr[i] > sMax) {
				sMax = arr[i];

			}
		}
		System.out.println("The biggest " + Max);
		System.out.println("Second biggest " + sMax);
	}
}
