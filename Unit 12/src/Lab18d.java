import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab18d {
	public static void main(String args[]) throws IOException {
		ArrayList<Word> words = new ArrayList<>();

		Scanner file = new Scanner(new File("C:/Users/ant3384/Desktop/APCSA - Workspace/APCSA-Labs/Unit 12/src/lab18d.dat/"));
		int size = file.nextInt();
		file.nextLine();

		while (size >= 1) {
			words.add(new Word(file.nextLine()));
			size--;
		}
		System.out.println("Initial words: " + words);
		file.close();

		for (int n = 0; n < words.size(); n++)
			for (int i = 0; i < words.size() - 1; i++)
				if (words.get(i).compareTo(words.get(i + 1)) == -1) {
					Word temp = words.get(i);
					words.set(i, words.get(i + 1));
					words.set(i + 1, temp);
				}

		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
	}
}

