package JavaProject01;

public class ProjectTask02 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.
		int[][] numbers = { 
				{ 37, 64, 891, 210, 107}, 
				{ 521, 42, 18, 75, 94 }, 
				{ 81, 452, 20, 569, 372 } 
				};

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {

				if (numbers[i][j] % 2 == 0) {
					System.out.print(numbers[i][j] + "- ");
				}

			}

		}
	}
}

	


