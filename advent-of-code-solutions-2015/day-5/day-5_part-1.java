import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws FileNotFoundException {
		File file = new File("/opt/input.txt");
		Scanner input = new Scanner(file);
		int result = 0;

		while (input.hasNext()) {
			String nextLine = input.nextLine();
			if ((ruleOne(nextLine) == true) && (ruleTwo(nextLine) == true) && (ruleThree(nextLine) == true)) {
				result++;
			}

		}

		System.out.println(result);
	}

	public static boolean ruleOne(String nextLine) {
		int counter = 0;
		for (int i = 0; i < nextLine.length(); i++) {
			if (nextLine.charAt(i) == 'a' || nextLine.charAt(i) == 'e' || nextLine.charAt(i) == 'i' || nextLine.charAt(i) == 'o'
					|| nextLine.charAt(i) == 'u') {
				counter++;
			}
		}
		if (counter >= 3) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean ruleTwo(String nextLine) {

		Boolean twice = false;
		for (int i = 0; i < nextLine.length() - 1; i++) {
			if (nextLine.charAt(i) == nextLine.charAt(i + 1)) {
				twice = true;
			}
		}

		return twice;
	}

	public static boolean ruleThree(String nextLine) {
		if (nextLine.contains("ab") || nextLine.contains("cd") || nextLine.contains("pq") || nextLine.contains("xy")) {
			return false;
		} else {
			return true;
		}
	}

}