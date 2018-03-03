package EncriptionCipher;

import java.util.ArrayList;
import java.util.List;

public class fourSquareCipher {

	//starting point
	char[] firstQuadrent = "abcdefghiklmnopqrstuvwxyz".toUpperCase().toCharArray();
	char[] fourthQuadrent = "abcdefghiklmnopqrstuvwxyz".toUpperCase().toCharArray();
	
	//find encription here
	char[] secondQuadrent = "zgptfoihmuwdrcnykeqaxvsbl".toUpperCase().toCharArray();
	char[] thirdQuadrent = "mfnbdcrhsaxyogvituewlqzkp".toUpperCase().toCharArray();

	List<Character> encryptedText = new ArrayList<Character>();

public void bigram(char [] text)
	{
	   
       long startTime = System.nanoTime();
	   int i;
	   for (i=0; i < text.length-1; i+=2)
	   {
		   
		   char encryptOne = text[i];
		   char encryptTwo = text[i+1];
		               //testing only
					   //System.out.print(encryptOne);
					   //System.out.print(encryptTwo);
		   encription(encryptOne, encryptTwo);
		               //testing purposes only
					   //System.out.println("");
       }//end for loop
	    long endTime = System.nanoTime();
	    System.out.println("That took " + (endTime - startTime) + " nanoSeconds");
	    
	}//end Bigram method
	
public void encription(char one, char two)
    {
	   	int refOne = ((int) one -65);
	   	//error handling for the letter J no being in the alphabet, j will become i when passed in
	   	//first letter in
	   	if (refOne > 8){refOne -=1;}
	   	if(refOne == 9){refOne = 8;}
	   	//second letter in	   	
	   	int refTwo = ((int) two -65);
	   	if (refTwo > 8){refTwo -=1;}
	   	if(refTwo == 9){refTwo = 8;}	   	
						   	//testing
						    //System.out.println(one +" "+two);
						    //System.out.println(refOne+" "+refTwo);	   	
	   	//do maths to find second and third refernce
	   	int pointOne = (refOne/5); 
	   	int pointOne1 = refOne%5;	   	
	   	int pointTwo = (refTwo/5);
	   	int pointTwo1 = refTwo%5;	   	
					   	//testing only
					   	//System.out.println(pointOne+" "+pointOne1);
					   	//System.out.println(pointTwo+" "+pointTwo1);	   	
	   	int findPointOne = (pointOne*5)+(pointTwo1);
	   	int findPointTwo = (pointTwo*5)+(pointOne1);
	   					//testing only
	   					//System.out.println(findPointOne+" "+findPointTwo);	   	
	   	char three = secondQuadrent[findPointOne];
	    char four = thirdQuadrent[findPointTwo];	    
						   	//print these values
						    //System.out.print(three+""+four);
						    //System.out.println("");
	 
	    encryptedText.add(three);
	    encryptedText.add(four);

	}//end encription method

public void reverseBigram(char [] text)
{
   
   long startTime = System.nanoTime();
   int i;
   for (i=0; i < text.length-1; i+=2)
   {
	   
	   char encryptOne = text[i];
	   char encryptTwo = text[i+1];
	               //testing only
				   //System.out.print(encryptOne);
				   //System.out.print(encryptTwo);
	   reverseEncription(encryptOne, encryptTwo);
	               //testing purposes only
				   //System.out.println("");
   }//end for loop
    long endTime = System.nanoTime();
    System.out.println("That took " + (endTime - startTime) + " nanoSeconds");
    
}//end Bigram method

public void reverseEncription(char one, char two)
{
   	int refOne = 0, refTwo = 0, i, counter =0;
   	
   	for(i = 0; i< secondQuadrent.length; i++)
   	{
   		if(secondQuadrent[i]==one)
   		{
   			refOne = counter;
   		}
   		if(thirdQuadrent[i]==two)
   		{
   			refTwo = counter;
   		}
   		counter++;
   	}	   	
					   	//testing
					    //System.out.println(one +" "+two);
					    //System.out.println(refOne+" "+refTwo);	   	
   	//do maths to find second and third refernce
   	int pointOne = (refOne/5); 
   	int pointOne1 = refOne%5;	   	
   	int pointTwo = (refTwo/5);
   	int pointTwo1 = refTwo%5;	   	
				   	//testing only
				   	//System.out.println(pointOne+" "+pointOne1);
				   	//System.out.println(pointTwo+" "+pointTwo1);	   	
   	int findPointOne = (pointOne*5)+(pointTwo1);
   	int findPointTwo = (pointTwo*5)+(pointOne1);
   					//testing only
   					//System.out.println(findPointOne+" "+findPointTwo);	   	
   	char three = firstQuadrent[findPointOne];
    char four = fourthQuadrent[findPointTwo];	    
					   	//print these values
					    //System.out.print(three+""+four);
					    //System.out.println("");
 
    encryptedText.add(three);
    encryptedText.add(four);

}//end encription method

}




