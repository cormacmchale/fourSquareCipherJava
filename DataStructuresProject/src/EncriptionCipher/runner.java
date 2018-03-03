package EncriptionCipher;

import java.io.*;

//main class for running encryption
public class runner {

   public static void main(String[] args) throws FileNotFoundException{
	   
	   final String ENCRIPTION_FILE ="WarAndPeace-Leotolstoy.txt";	   
	   PrintWriter encryptedFile = new PrintWriter("EncryptionFile.txt");
	   
	   //parse file here
	   parser test = new parser();
	   test.parse(ENCRIPTION_FILE);
   
	   //pass file into cipher for breaking up into encryption
	   fourSquareCipher cipher = new fourSquareCipher();
	   fourSquareCipher newCipher = new fourSquareCipher();
	   cipher.bigram(test.encriptionText);
	   	   
	   			   //testing purposes only
	   			   //test.testParse();	           
				   //System.out.println("");	   
				   //System.out.print(test.encriptionText[22]);	
	   
/*				   for(int i =0; i<cipher.encryptedText.size();i++)
				   {
				   	   encryptedFile.print(cipher.encryptedText.get(i));
				   }*/
				   
	   encryptedFile.close();
	   
	   
	   
							   String newTest = cipher.encryptedText.toString();
							   newTest = newTest.replaceAll("[^a-zA-Z]", "").toUpperCase();
							   char [] Testing = newTest.toCharArray();
/*							   for(int i=0; i<Testing.length; i++)
							   {
								   System.out.print(Testing[i]);
							   }*/
							   
							   System.out.println("");
							   newCipher.reverseBigram(Testing);
/*							   for(int i =0; i<newCipher.encryptedText.size();i++)
							   {
							   	   System.out.print(newCipher.encryptedText.get(i));
							   }*/

							   
   }//end main

}//end class

