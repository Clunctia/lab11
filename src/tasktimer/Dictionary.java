package tasktimer;

import java.io.InputStream;

/**
 * Dictionary class is class for generate and return word list from wordlist.txt.
 * @author Clunctia
 *
 */
public class Dictionary {
	private static String DICTIONARY = "wordlist.txt";
	
	/**
	 * Return list from wordlist.txt
	 * @return InputStrem list from DICTIONARY.
	 */
	public static InputStream getWordsAsStream(){
		return Dictionary.class.getClassLoader().getResourceAsStream(DICTIONARY);
	}
}
