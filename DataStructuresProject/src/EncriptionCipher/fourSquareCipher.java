package EncriptionCipher;

import java.util.ArrayList;
import java.util.List;

public class fourSquareCipher {
	String cipherSquare = "abcdefghiklmnopqrstuvwxyz";
	//starting point
	char[] firstQuadrent = cipherSquare.toUpperCase().toCharArray();
	char[] fourthQuadrent = firstQuadrent;
	
	
	//find encription here
	char[] secondQuadrent = "zgptfoihmuwdrcnykeqaxvsbl".toUpperCase().toCharArray();
	char[] thirdQuadrent = "mfnbdcrhsaxyogvituewlqzkp".toUpperCase().toCharArray();
    //variables for storing the encrypted and then decrypted text
	//using the list data structure as .add runs in amortized running time 0(N)
	List<Character> encryptedText = new ArrayList<Character>();
	List<Character> decryptedText = new ArrayList<Character>();
	//used to measure encryption and decryption time
	public long nanoTime;
	
//method that breaks the text from the parser object up into bigrams 
public void bigram(char [] text)
	{	   
       long startTime = System.nanoTime();//start timer
	   int i;
	   //loops through the Character array and feeds the bigrams into encryption method
	   for (i=0; i < text.length-1; i+=2)
	   {		   
		   char encryptOne = text[i];
		   char encryptTwo = text[i+1];
		   encription(encryptOne, encryptTwo);
       }//end for loop
	    long endTime = System.nanoTime();//end timer	    
	    nanoTime = endTime - startTime;	    
	}//end Bigram method
	
public void encription(char one, char two)
    {
		//the first and fourth array are ordered from 0-24, A-Z
	    //so by getting the ascii code and subtracting 65 we can get the index of the element in the array in 0(1) time
	    //this helps us locate the first bigram in the first and fourth array
   	    //first letter in 
	   	int refOne = ((int) one -65);
	   	//second letter in	   	
	   	int refTwo = ((int) two -65);
	   	
	   	//error handling for the letter J not being in the cipher, j will become i when passed in
	   	if (refOne > 8){refOne -=1;}
	   	if(refOne == 9){refOne = 8;}
	   	if (refTwo > 8){refTwo -=1;}
	   	if(refTwo == 9){refTwo = 8;}	   		   	
	   	//we can use basic maths to encrypt the bigram
	   	//this is done by giving imagined two dimensional reference points to each of the first two characters
	   	//these are aquired by using the / and % operator on the position of each character in the first and fourth array
	   	int pointOne = (refOne/5); 
	   	int pointOne1 = refOne%5;	   	
	   	int pointTwo = (refTwo/5);
	   	int pointTwo1 = refTwo%5;   	
	   	
	   	//then to find the corners of the square used for encription we use *5 to get where the row refernce would tell us to go 
	   	//and +pointTwo1 to get from the multiple of 5 to the actual index in the single dimensional arrays
	   	//making this process 0(1) also
	   	int findPointOne = (pointOne*5)+(pointTwo1);
	   	int findPointTwo = (pointTwo*5)+(pointOne1);
	   	
	   	char three = secondQuadrent[findPointOne];
	    char four = thirdQuadrent[findPointTwo];	    
	 
	    //add them to the list here to print to file later
	    encryptedText.add(three);
	    encryptedText.add(four);

	}//end encription method

//the same method as bigram only this feeds bigrams into a reverse encription method
public void reverseBigram(char [] text)
	{  
	   long startTime = System.nanoTime();
	   int i;
	   for (i=0; i < text.length-1; i+=2)
	   {	   
		   char encryptOne = text[i];
		   char encryptTwo = text[i+1];
		   reverseEncription(encryptOne, encryptTwo);
	   }//end for loop
	    long endTime = System.nanoTime();
	    nanoTime = endTime - startTime;   
	}//end Bigram method

public void reverseEncription(char one, char two)
	{
	    //this method mirrors the encryption method the only difference being the way in which you find the first letters
	    //the second and third quadrent are in random order so i've used a single for loop and counter to go through each array and find the letter each time
	    //this is slower than the encription as it is 0(N)
	    //this is reflected in the running time
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
	   	int pointOne = (refOne/5); 
	   	int pointOne1 = refOne%5;	   	
	   	int pointTwo = (refTwo/5);
	   	int pointTwo1 = refTwo%5;	   		   	
	   	int findPointOne = (pointOne*5)+(pointTwo1);
	   	int findPointTwo = (pointTwo*5)+(pointOne1);	   	
	   	char three = firstQuadrent[findPointOne];
	    char four = fourthQuadrent[findPointTwo];	    
	    decryptedText.add(three);
	    decryptedText.add(four);
	}//end decryption method

}//end class




