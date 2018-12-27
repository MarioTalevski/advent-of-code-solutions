package day_1_chronal_calibration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Part_2 {
	
	public static void main(String[] args) throws IOException {
		List<String> inputList = Files.readAllLines(Paths.get("C:\\advent-of-code\\input.txt"));
		Set<Integer> frequencies = new HashSet<Integer>();
		int sum = 0, duplicate =0;
		
		while(duplicate == 0) {
	    	for(String input : inputList) {
	        	sum = sum + Integer.parseInt(input.replaceAll("[\\D&&[^,-]]", ""));	    
	        	if(frequencies.add(sum) == false) {
	        		System.out.print("Duplicate: " + sum);
	        		return;
	        	}
	        	frequencies.add(sum);
	        	System.out.println(sum);
	        }
		}
	}	
}
