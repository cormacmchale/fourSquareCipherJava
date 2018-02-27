package EncriptionCipher;

import java.io.File;

//main class for running encription
public class runner {

   public static void main(String[] args) 
   {
	   
	   final String ENCRIPTION_FILE = "PoblachtNaHEireann.txt";
	   
	   //testing that the file will parse correctly
	   parser test = new parser();
	   test.parse(ENCRIPTION_FILE);	   
	   test.testParse();
	   
	   System.out.println("");	   
	   System.out.print(test.encriptionText[22]);
	   
   }//end main


}
