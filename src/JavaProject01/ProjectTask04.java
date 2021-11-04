package JavaProject01;

import java.util.Scanner;

public class ProjectTask04 {

	public static void main(String[] args) {
		// Create an array on double values using scanner and calculate the sum of all
				// stored elements in that array.

				Scanner scan = new Scanner(System.in);

				double[] array = new double[4];

				System.out.println("Enter first element");
				array[0] = scan.nextDouble();

				System.out.println("Enter second element");
				array[1] = scan.nextDouble();

				System.out.println("Enter third element");
				array[2] = scan.nextDouble();

				System.out.println("Enter fourth element");
				array[3] = scan.nextDouble();

				System.out.println("The sum of all elements = " + (array[0] + array[1] + array[2] + array[3]));

	}

}
