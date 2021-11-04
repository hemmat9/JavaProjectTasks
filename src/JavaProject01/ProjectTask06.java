package JavaProject01;

public class ProjectTask06 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		int numA = 10;
		int numB = 50;

		numA = (numA + numB);// 60
		numB = numA - numB;// 10
		numA = numA - numB;// 50

		System.out.println(numA);
		System.out.println(numB);

	}

}
