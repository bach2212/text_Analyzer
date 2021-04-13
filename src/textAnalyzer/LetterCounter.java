package textAnalyzer;

import java.io.IOException;
import java.util.HashMap;
//import textAnalyzer.Loader;

public class LetterCounter {

	public static void frequencyL(String FileName) throws IOException {
		HashMap<Integer, Integer> counts = new HashMap<>();
		String text = Loader.loadText(FileName);
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if(Character.isLetter(c)) {
				int value = counts.getOrDefault((int) c, 0);
				counts.put((int) c, value + 1);
			}
		}
		for (int key : counts.keySet()) {
            System.out.println((char)key + ": " + counts.get(key));
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		frequencyL(args[0]);
	}

}
