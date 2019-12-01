package day_1_the_tyranny_of_the_rocket_equation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Part_2 {
	
	public static void main(String[] args) throws IOException {
		List<String> inputList = Files.readAllLines(Paths.get("D:\\input.txt"));
		double fuel = 0;
		int sum = 0;
		
		for(String line : inputList) {
			fuel = Double.parseDouble(line);
			do {
				fuel = Math.floor(fuel / 3) - 2;
				sum = sum + (int)fuel;
			} while((int)Math.floor(fuel / 3) - 2 > 0);
		}
		
		System.out.println(sum);
	}

}
