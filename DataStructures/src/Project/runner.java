package Project;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class runner {

	public static void main(String[] args) throws FileNotFoundException {
		
		//initial variable
		String str;
		fourSquarecipher table = new fourSquarecipher();
		//scanners for keyboard and file
		Scanner console = new Scanner (System.in);
		Scanner encriptionText = new Scanner(new FileReader("res/PoblachtNaHEireann.txt"));
		
		//testing file reader
		//char test = encriptionText.next().charAt(0);
		//System.out.println(test); 
		
		System.out.println("Enter First Keyword for encription: ");
		str = console.nextLine();
        ArrayList<Character> keyWord = new ArrayList<Character>();
        
		
		char keyWordOne[] = str.toCharArray();
		Arrays.sort(keyWordOne);
		char compare = keyWordOne[0];
		keyWord.add(compare);
		
		for (int i = 1; i<keyWordOne.length; i++)
		{
			if(!(compare == keyWordOne[i]))
			{
				keyWord.add(keyWordOne[i]);
			}
			compare = keyWordOne[i];
		}
		
		for (int i = 0; i<keyWord.size();i++)
		{
			System.out.println(keyWord.get(i));
		}
		
		table.keyWords(keyWord);
		table.display();
		
		encriptionText.close();
	}//end main
	
}//end class
