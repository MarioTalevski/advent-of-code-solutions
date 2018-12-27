import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws FileNotFoundException {
		int surface = 0, small = 0, result = 0;
		int a,b,c;
		ArrayList<String> array = new ArrayList();
		File file = new File("/opt/input.txt");
		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			String nextLine = input.nextLine();
			String[] abc = nextLine.split("x");
			a = Integer.parseInt(abc[0]);
			b = Integer.parseInt(abc[1]);
			c = Integer.parseInt(abc[2]);
			int Array[] = {a * b, a * c , b * c};
			Arrays.sort(Array);
			surface = (2 * a * b)  + (2 * a * c) + (2 * b * c);
			result = result + Array[0]  + surface;
		}

		System.out.print(result);
	}

}


