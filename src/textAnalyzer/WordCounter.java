package textAnalyzer;

import java.io.IOException;

public class WordCounter {
	
	private static int frequencyP(String FileName, String pattern) throws IOException {
		int count = 0;
		String text = Loader.loadText(FileName);
//		System.out.println(text);
		String[] word = text.split("\\W+");
		for (String s : word) {
			count += patternCount(pattern, s);
		}
		System.out.println(pattern.toLowerCase() + ": " + count);
		return count;
	}
	
	private static int patternCount(String pattern, String s) throws StringIndexOutOfBoundsException{
		int count = 0;
		int index = s.indexOf(pattern.toLowerCase());
		if(index == -1) return 0;
		else {
			while(s.indexOf(pattern.toLowerCase()) != -1 && s.length() >= (index + pattern.length())) {
				index = s.indexOf(pattern.toLowerCase());
//				System.out.println(s);
//				System.out.println(index);
				s = s.substring(index + pattern.length());
				count ++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		frequencyP(args[0], args[1]);
//		frequencyP("src/textAnalyzer/letters", "zzz");
	}

}
