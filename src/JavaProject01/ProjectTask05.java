package JavaProject01;

public class ProjectTask05 {

	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values from an array print
		// capital for each country. (use 2 different loops).
		System.out.println("Country/Capital");
		String[] cntry = { "USA-Washington D.C", "Turkey-Ankara", "Greece-Athens ", "Russia-Moscov ", "Ukraine-Kyiv ",
				"Canada--Ottawa " };

		for (int i = 0; i < cntry.length; i++) {
			System.out.println(i + " " + cntry[i]);

		}
		System.out.println("-------------------------");

		System.out.println("Country/Capital");
		String[] country = { "USA-Washington D.C", "Turkey-Ankara", "Greece-Athens ", "Russia-Moscov ", "Ukraine-Kyiv ",
				"Canada--Ottawa " };
		for (String cc : country) {
			System.out.println(cc);
		}
	}
}
