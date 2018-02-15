package Project;

import java.util.ArrayList;

public class fourSquarecipher {

		char firstQuadrent[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', '0', 'P','Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	    char secondQuadrent[] = {'Z', 'G', 'P', 'T', 'F','O', 'I', 'H', 'M', 'U','W', 'D', 'R', 'C', 'N','Y', 'K', 'E', 'Q', 'A','X', 'V', 'S', 'B', 'L'};
	    char thirdQuadrent[] = {'M', 'F', 'N', 'B', 'D','C', 'R', 'H', 'S', 'A', 'X', 'Y', 'O', 'G', 'V','I', 'T', 'U', 'E', 'W','L', 'Q', 'Z', 'K', 'P',};
	    char fourthQuadrent[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', '0', 'P','Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	
	
	public void keyWords(ArrayList keyWord)
	{
		for(int i = 0; i <keyWord.size(); i++)
		{
			secondQuadrent[i] = (char) keyWord.get(i);
		}
	}
	
	public void display()
	{
		for (int i = 0; i<secondQuadrent.length; i++)
		{
			System.out.println(secondQuadrent[i]);
		}
	}
}

