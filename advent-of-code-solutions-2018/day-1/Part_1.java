package day_1_chronal_calibration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Part_1 {
	
	public static void main(String[] args) throws IOException {
		List<String> inputList = Files.readAllLines(Paths.get("C:\\advent-of-code\\input.txt"));
		int sum = 0;
		
      		for(String input : inputList) {
        		sum = sum + Integer.parseInt(input.replaceAll("[\\D&&[^,-]]", ""));	        	
        	}
        
        	System.out.println(sum);
       
	}

}
