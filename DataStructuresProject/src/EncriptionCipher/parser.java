package EncriptionCipher;

//imports required to use tools required for reading files 
import java.util.*;
import java.io.*;

public class parser {

	//private variables for getting text correctly
	private List<String> words = new ArrayList<String>();
	public char encriptionText[];
	
	//function that takes a string of text
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
				//not sure what to put here!!
			}
		String newWords = words.toString();		
		newWords = newWords.replaceAll("[^a-zA-Z]", "").toUpperCase();
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
