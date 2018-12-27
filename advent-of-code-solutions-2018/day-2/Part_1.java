package day_2_inventory_management_system;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Part_1 {
	
	public static void main(String[] args) throws IOException {
		List<String> inputList = Files.readAllLines(Paths.get("C:\\advent-of-code\\input.txt"));
		int counter = 1, twice = 0, three = 0, globalTwice = 0 , globalThree = 0;
		
        for(String input : inputList) {
        	for(int i=0; i<input.length(); i++) {
        		for(int j=i+1; j<input.length(); j++) {
        			if(input.charAt(i) == input.charAt(j) && input.charAt(i) != '*') {
        				counter++;
        			}
        		}
        		if(counter ==  2) {
        			twice++;
        		}
        		 if(counter == 3) {
        			three++;
        		}
        		counter=1;
         		input = input.replace(input.charAt(i), '*');
        	}
        	if(twice > 0) {
        		globalTwice++;
        	}
        	if(three > 0) {
        		globalThree++;
        	}
        	twice = 0;
        	three=0;
        	
        }
        
        System.out.println("RESULT: ");
        System.out.println(globalTwice*globalThree);   
       
	}

}
