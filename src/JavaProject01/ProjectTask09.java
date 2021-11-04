package JavaProject01;

public class ProjectTask09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[] myArray = { 66, 45, 2, 32, 876, 500 };

		int Max = myArray[0];
		int size = myArray.length;
		int Min = myArray[size - 1];

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > Max) {
				Max = myArray[i];
			}
			if (Min > myArray[i]) {
				Min = myArray[i];
			}
		}
		System.out.println("Max number = " + Max);
		System.out.println("Minimum number = " + Min);

	}

}
