package tasktimer;

import java.io.InputStream;

public class Dictionary {
	private static String DICTIONARY = "wordlist.txt";
	
	public static InputStream getWordsAsStream(){
		return Dictionary.class.getClassLoader().getResourceAsStream(DICTIONARY);
	}
}
