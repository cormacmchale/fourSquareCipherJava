package EncriptionCipher;

import java.io.*;

//main class for running encryption
public class runner {

   public static void main(String[] args) throws FileNotFoundException{
	   
	   //choose which text file to encrypt here
	   final String ENCRIPTION_FILE ="DeBelloGallico.txt";

	   //open files to write out the encryption or decryption
	   PrintWriter encryptedFile = new PrintWriter("EncryptionFile.txt");
	   PrintWriter decryptedFile = new PrintWriter("DecryptedFile.txt");
	   
	   //create parser object for each process
	   parser test = new parser();
	   parser newTest = new parser();
 
	   //create cipher for each process
	   fourSquareCipher cipher = new fourSquareCipher();
	   fourSquareCipher newCipher = new fourSquareCipher();
	   
	   
	   //parse in first file
	   test.parse(ENCRIPTION_FILE); 
	   //passing in the string of text for encryption
	   cipher.bigram(test.encriptionText);	   
	   			   //this for loop prints out the encription to a text file
				   for(int i =0; i<cipher.encryptedText.size();i++)
				   {
				   	   if(i%75 == 74)
				   	   {
				   		   encryptedFile.println("");
				   	   }//end if
				   	   encryptedFile.print(cipher.encryptedText.get(i));

				   }//end for loop for printing to file	
	   //close file to read back in for encryption
	   encryptedFile.close();
	   
	               //repeat process as above with new objects for decryption
				   final String DECRIPTION_FILE ="EncryptionFile.txt";
				   newTest.parse(DECRIPTION_FILE);
				   newCipher.reverseBigram(newTest.encriptionText);
			
							   for(int i =0; i<newCipher.decryptedText.size();i++)
							   {
							   	   if(i%75 == 74)
							   	   {
							   		   decryptedFile.println("");
							   	   }
							   	   decryptedFile.print(newCipher.decryptedText.get(i));
						
							   }
				   decryptedFile.close();
	   
	   //print out time of encryption and decryption respectively
	   System.out.println("Encryption: "+cipher.nanoTime);
	   System.out.println("Decryption: "+newCipher.nanoTime);
   }//end main

}//end class

