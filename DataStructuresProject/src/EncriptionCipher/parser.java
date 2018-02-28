package EncriptionCipher;

//imports required to use tools required for reading files 
import java.util.*;
import java.io.*;

public class parser {

	//private variables for getting text correctly
	//private List<Character> plainText = new ArrayList<Character>();
	private List<String> words = new ArrayList<String>();
	public char encriptionText[];
	
	public void parse(String text)
	{
		
		try {
				FileInputStream fstream = new FileInputStream(text);
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				
				String next;
				while ((next = br.readLine()) != null)   
				{
				      words.add(next);
				}
				in.close();
		    } 
		    catch (Exception e) 
					{
						//throw new Exception("[ERROR] Encountered a problem reading the dictionary. " + e.getMessage());
					}
		String newWords = words.toString();
		//for (char c: words)
		
		newWords = newWords.replaceAll("(?:--|[\\[\\]{}(),.-: +/\\\\])", "").toUpperCase();
		
		encriptionText = newWords.toCharArray();

	}//end parse function

	public void testParse()
	{
		int i;		
		for(i=0; i<encriptionText.length; i++)
		{
			System.out.print(encriptionText[i]);
		}
	}// end test parse
	
}//end class
