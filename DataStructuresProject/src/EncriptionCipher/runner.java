package EncriptionCipher;

//main class for running encription
public class runner {

   public static void main(String[] args) 
   {
	   
	   final String ENCRIPTION_FILE = "PoblachtNaHEireann.txt";
	   
	   //parse file here
	   parser test = new parser();
	   test.parse(ENCRIPTION_FILE);	  
	   
	   //pass file into cipher for breaking up into encription
	   fourSquareCipher cipher = new fourSquareCipher();
	   cipher.bigram(test.encriptionText);
	   
	   			   //testing purposes only
	   			   //test.testParse();	   
				   //System.out.println("");	   
				   //System.out.print(test.encriptionText[22]);	   
   }//end main

}//end class

