package day_2_program_alarm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Day_2 {
	
	public static void main(String[] args) throws IOException {
		int result;
		
		// Part 1
		result = partOne(12, 2);
		System.out.println("The result of part one is: " + result);
		
		// Part 2
		for(int a = 0; a < 100; a++) {
			for(int b = 0; b < 100; b++) {
				if(partOne(a,b) == 19690720){
					result = (100 * a) + b;
					System.out.println("The result of part two is: " + result);
				}
			}
		}

	}
	
	static int partOne(int a, int b) throws IOException {
		List<String> inputLines = Files.readAllLines(Paths.get("D:\\input.txt"));
		String[] inputParts = inputLines.get(0).split(",");	
		int[] inputArray = Arrays.stream(inputParts).mapToInt(Integer::parseInt).toArray();
		inputArray[1] = a;
		inputArray[2] = b;
		int[] outputArray = inputArray;
		
		for(int i = 0; i < inputArray.length; i = i + 4) {
			int opcode = inputArray[i];
			int firstInputPosition = inputArray[i+1];
			int secondInputPosition = inputArray[i+2];
			int outputPosition = inputArray[i + 3];
	
			if(opcode == 1) {
				outputArray[outputPosition] = inputArray[firstInputPosition] + inputArray[secondInputPosition];
			}
			if(opcode == 2) {
				outputArray[outputPosition] = inputArray[firstInputPosition] * inputArray[secondInputPosition];
			}
			if(opcode == 99) {
				break;
			}
		}
		
		return outputArray[0];
	}
	
	
}
