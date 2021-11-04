package JavaProject01;

public class ProjectTask08 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci serie
		int num1=1;
		int num2=1;
		int sum;
		System.out.print(num1+" "+num2+" ");
		for (int a=3; a<=10;a++) {
			sum=num1+num2;
			System.out.print(sum+" ");
			num1=num2;
			num2=sum;
		}
	}

}
