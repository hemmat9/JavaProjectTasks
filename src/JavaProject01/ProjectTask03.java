package JavaProject01;

public class ProjectTask03 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum
		// of even and odd numbers for that array.

		int[][] num = { { 10, 20, 30, 40, 45 }, { 34, 35, 23, 46, 78 } };
		int sumeven = 0;
		int sumodd = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					// loop
					System.out.println("This is even number " + num[i][j]);
					// store even number in i_even
					sumeven += num[i][j];
				} else if (num[i][j] != 0) {
					System.out.println("This is odd number " + num[i][j]);
					sumodd += num[i][j];
				}
			}
		}
		System.out.println("sum of Even numbers is " + sumeven);
		System.out.println("sum of Odd numbers is " + sumodd);

	}

}
