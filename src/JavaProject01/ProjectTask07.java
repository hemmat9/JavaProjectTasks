package JavaProject01;

public class ProjectTask07 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		boolean a = false;
		int n = 621;
		for (int i = 2; i <= n / 2; i++) { // number is not divisible by more than its half
			if (n % i == 0) {
				a = true; // if number is divisible = true and not a prime number
				break;
			}
		}
		if (!a)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");
	}
}
	


