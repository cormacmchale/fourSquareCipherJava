package EncriptionCipher;

import java.io.*;
import java.util.*;

//main class for running encryption
public class runner {

   public static void main(String[] args) throws FileNotFoundException{
	   
	   final String ENCRIPTION_FILE ="WarAndPeace-LeoTolstoy.txt";	   
	   PrintWriter encryptedFile = new PrintWriter("EncryptionFile.txt");
	   
	   //parse file here
	   parser test = new parser();
	   test.parse(ENCRIPTION_FILE);	  
	   
	   //pass file into cipher for breaking up into encryption
	   fourSquareCipher cipher = new fourSquareCipher();
	   cipher.bigram(test.encriptionText);
	   
	   			   //testing purposes only
	   			   //test.testParse();	   
				   //System.out.println("");	   
				   //System.out.print(test.encriptionText[22]);	
	   
				   //for(int i =0; i<cipher.encryptedText.size();i++)
				   //{
				   //	   encryptedFile.print(cipher.encryptedText.get(i));
				   //}
	   encryptedFile.close();
	   
   }//end main

}//end class

