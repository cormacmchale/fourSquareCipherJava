package Project;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
	
		
		
		String str;

		
		final Scanner console = new Scanner (System.in);
		System.out.println("Enter First Keyword for encription: ");
		str = console.nextLine();
        ArrayList<Character> keyWord = new ArrayList<Character>();
		
		char keyWordOne[] = str.toCharArray();
		Arrays.sort(keyWordOne);
		char compare = keyWordOne[0];
		keyWord.add(compare);
		//for (int i = 1; i<keyWordOne; )
	}

}
