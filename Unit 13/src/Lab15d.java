
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab15d {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("C:/Users/ant3384/Desktop/APCSA - Workspace/APCSA-Labs/Unit 13/src/lab15d.dat/"));
		int size = file.nextInt();
		file.nextLine();
		for (int i = 0; i < size; i++) {
			FancyWords fu = new FancyWords(file.nextLine());
			System.out.println(fu);
		}

	}
}