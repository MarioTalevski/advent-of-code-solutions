package day_23_experimental_emergency_teleportation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Nanobot {
	int x,y,z,signal;
	
	public Nanobot(int x,int y,int z, int signal) {
		this.x = x;
		this.y = y;
		this.z = z;		
		this.signal = signal;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public int getSignal() {
		return signal;
	}
	
	
}

public class Part_1 {
	
	public static void main(String[] args) throws IOException {
		
        List<String> inputList = Files.readAllLines(Paths.get("C:\\advent-of-code\\input.txt"));
        List<String> parsedList = new ArrayList<String>();
        List<Nanobot> nanobotList = new ArrayList<Nanobot>();
        
        for(String input : inputList) {
        	parsedList.add(input.replaceAll("[\\D&&[^,-]]", ""));
        }
        
        for(String parsed : parsedList) {
        	String[] parsedParts = parsed.split(",");
        	int x = Integer.parseInt(parsedParts[0]);
        	int y = Integer.parseInt(parsedParts[1]);
        	int z = Integer.parseInt(parsedParts[2]);
        	int signal = Integer.parseInt(parsedParts[3]);
        	Nanobot nanobot = new Nanobot(x,y,z,signal);
        	nanobotList.add(nanobot);
        }
        
        int strongestSignal = 0;
        Nanobot strongestNanobot = null;
        for(Nanobot nanobot : nanobotList) {
        	if(nanobot.getSignal() > strongestSignal) {
        		strongestSignal = nanobot.getSignal();
        		strongestNanobot = nanobot;
        	}
        }
      
        int rangeBotCounter = 0;
        for(Nanobot nanobot : nanobotList) {
        	int currentX = nanobot.getX();
        	int currentY = nanobot.getY();
        	int currentZ = nanobot.getZ();
        	int strongestX = strongestNanobot.getX();
        	int strongestY = strongestNanobot.getY();
        	int strongestZ = strongestNanobot.getZ();
        	
        	if((Math.abs(strongestX - currentX) + Math.abs(strongestY - currentY) + Math.abs(strongestZ - currentZ)) <= strongestSignal) {
        		rangeBotCounter++;
        	}
        	
        }
        
        System.out.println("Number of bots in range: " + rangeBotCounter);
	
	}
 
}