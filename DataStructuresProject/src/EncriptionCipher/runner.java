package EncriptionCipher;
import java.io.*;
import java.util.List;
import java.util.Scanner;

//main class for running encryption
public class runner {

   public static void main(String[] args) throws FileNotFoundException{
	   
	   menu();

   }//end main



public static void menu() throws FileNotFoundException
	{
	  Scanner console = new Scanner(System.in);
	  int choice;
	  String file;
	  System.out.print("Please Select an option: 1)Encrypt a File, -1)to finish: ");
	  choice = console.nextInt();
	  while(choice!=-1)
	  {
		  switch(choice)
		  {
				  case 1:
						  System.out.print("Please Enter the file Name: ");
						  file = console.next();
						  parser test = new parser();
						  test.parse(file);
						  fourSquareCipher cipher = new fourSquareCipher();
						  cipher.bigram(test.encriptionText);
						  printEncryption(cipher.encryptedText);
						  System.out.println("Encryption:"+cipher.nanoTime+" nanoSeconds");
				  break;
				  case 2:
					      parser newTest = new parser();
						  fourSquareCipher newCipher = new fourSquareCipher();
						  newTest.parse("EncryptionFile.txt");
						  newCipher.reverseBigram(newTest.encriptionText);
						  printDecryption(newCipher.decryptedText);
						  System.out.println("Decryption:"+newCipher.nanoTime+" nanoSeconds");
				  break;
				  case -1:
				  return;			  
		  }//end switch statement
		  System.out.print("Please Select an option: 1)Encrypt a File, 2)Decrypt Previously Encrypted File -1)to finish: ");
		  choice = console.nextInt();
	  }//end while loop
	}//end menu method

public static void printEncryption(List<Character> print) throws FileNotFoundException
	{
	   PrintWriter encryptedFile = new PrintWriter("EncryptionFile.txt");
		   //this for loop prints out the encription to a text file
		   for(int i =0; i<print.size();i++)
		   {
		   	   if(i%75 == 74)
		   	   {
		   		   encryptedFile.println("");
		   	   }//end if
		   	   encryptedFile.print(print.get(i));	
		   }//end for loop for printing to file		   
	   encryptedFile.close();//close file
	}//end print to file method
public static void printDecryption(List<Character> print) throws FileNotFoundException
	{
	   PrintWriter decryptedFile = new PrintWriter("DecryptedFile.txt");
	   
	   for(int i =0; i<print.size();i++)
	   {
	   	   if(i%75 == 74)
	   	   {
	   		   decryptedFile.println("");
	   	   }
	   	   decryptedFile.print(print.get(i));

	   }
	   decryptedFile.close();
	}
}//end class

