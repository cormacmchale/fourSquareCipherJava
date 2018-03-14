package EncriptionCipher;
import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
//main class for running encryption
public class runner {

   public static void main(String[] args) throws IOException{

	   menu();

   }//end main

public static void menu() throws IOException
	{
      fourSquareCipher cipher = new fourSquareCipher();
	  Scanner console = new Scanner(System.in);
	  int choice;
	  String file, url;
	  System.out.print("Please Select an option:\n  1)Encrypt a File\n  2)Enter a URL for Encryption\n  3)Decrypt a File *you haven't anything to decrypt yet!\n -1)to finish:  ");
	  choice = console.nextInt();
	  while(choice!=-1)
	  {
		  switch(choice)
		  {
				  case 1:

					      parser parseFile = new parser();
					      JFileChooser chooser = new JFileChooser();
					      FileNameExtensionFilter filter = new FileNameExtensionFilter("text Files", "txt");
					      chooser.setFileFilter(filter);
						  int returnVal = chooser.showOpenDialog(null);				    
						  file = chooser.getSelectedFile().getPath();
						  parseFile.parse(file);
						  cipher.bigram(parseFile.encriptionText);
						  printEncryption(cipher.encryptedText);
						  System.out.println("Encryption:"+cipher.nanoTime+" nanoSeconds,"+" Please view EncryptionFile.txt to inspect!");
				  break;
				  case 2:
					      System.out.println("Please enter a valid URL: ");
					      url = console.next();
					      URL encryptUrl = new URL("https://"+url);
					      parser urlParse = new parser();
					      urlParse.parseURL(encryptUrl);
					      cipher.bigram(urlParse.encriptionText);
					      printEncryption(cipher.encryptedText);
						  System.out.println("Encryption:"+cipher.nanoTime+" nanoSeconds,"+" Please view EncryptionFile.txt to inspect!");				      
				  break;
				  case 3:
					      parser newParseFile = new parser();
						  newParseFile.parse("EncryptionFile.txt");
						  cipher.reverseBigram(newParseFile.encriptionText);
						  printDecryption(cipher.decryptedText);
						  System.out.println("Decryption:"+cipher.nanoTime+" nanoSeconds,"+" Please view DecryptedFile.txt to inspect!");
				  break;
				  case -1:
				  return;			  
		  }//end switch statement
		  System.out.print("Please Select an option:\n  1)Encrypt a File\n  2)Enter a URL for Encryption\n  3)Decrypt Previously Encrypted File\n  -1)to finish: ");
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

