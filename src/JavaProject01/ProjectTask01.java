package JavaProject01;

public class ProjectTask01 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		int[][] numbers = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }

		};
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {

				sum += numbers[i][j];
			}
		}
		System.out.println("Sum of all elements= " + sum);

	}

}
