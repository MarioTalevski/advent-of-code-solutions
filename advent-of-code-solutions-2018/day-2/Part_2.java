package day_2_inventory_management_system;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Part_2 {

	public static void main(String[] args) throws IOException {
		List<String> inputList = Files.readAllLines(Paths.get("C:\\advent-of-code\\input.txt"));
		String[] idArray = new String[inputList.size()];
		int k = 0, similarityCounter = 0, r = 0;

		for (String input : inputList) {
			idArray[k] = input;
			k++;
		}

		for (int i = 0; i < k; i++) {
			String first = idArray[i];
			for (int j = i + 1; j < k; j++) {
				String second = idArray[j];
				Character[] commonLetters = new Character[1000];
				for (int a = 0; a < first.length(); a++) {
					for (int b = 0; b < second.length(); b++) {
						if (first.charAt(a) == second.charAt(b) && a == b) {
							similarityCounter++;
							commonLetters[r] = first.charAt(a);
							r++;
						}
					}
				}
				if (similarityCounter < first.length() - 1) {
					similarityCounter = 0;
				} else if (similarityCounter == first.length() - 1) {
					for (int x = 0; x < r; x++) {
						System.out.print(commonLetters[x]);
					}
				}
				r = 0;
			}
		}

	}

}
