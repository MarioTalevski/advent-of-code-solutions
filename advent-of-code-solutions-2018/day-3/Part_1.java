package day_3_no_matter_how_you_slice_it;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Part_1 {

	public static void main(String[] args) throws IOException {
		List<String> inputList = Files.readAllLines(Paths.get("C:\\advent-of-code\\input.txt"));
		int size = 20000 , result = 0;
		Integer[][] matrix = new Integer[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = 0;
			}
		}

		for (String input : inputList) {
			String[] parts = input.replaceAll("[^0-9]+", ",").split(",");

			int id = Integer.valueOf(parts[1]);
			int y = Integer.valueOf(parts[2]);
			int x = Integer.valueOf(parts[3]);
			int height = Integer.valueOf(parts[4]);
			int width = Integer.valueOf(parts[5]);

			for (int i = x; i < x + width; i++) {
				for (int j = y; j < y + height; j++) {
					matrix[i][j]++;
				}
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (matrix[i][j] > 1) {
					result++;
				}
			}
		}

		System.out.println("RESULT : ");
		System.out.println(result);

	}

}
