package textAnalyzer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Loader {
	
	public static String loadText(String FileName) throws IOException {
		String text = "";
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(FileName));
			String s;
			while((s = br.readLine()) != null) {
				text+=s;	
			}
			br.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("no such file to be found");
//			e.printStackTrace();
		}
		return text.toLowerCase();
	}
}
