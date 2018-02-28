package EncriptionCipher;

public class fourSquareCipher {

	//starting point
	char[] firstQuadrent = "abcdefghiklmnopqrstuvwxyz".toUpperCase().toCharArray();
	char[] fourthQuadrent = "abcdefghiklmnopqrstuvwxyz".toUpperCase().toCharArray();
	//find encription here
	char[] secondQuadrent = "zgptfoihmuwdrcnykeqaxvsbl".toUpperCase().toCharArray();
	char[] thirdQuadrent = "mfnbdcrhsaxyogvituewlqzkp".toUpperCase().toCharArray();


public void bigram(char [] text)
	{
	   int i;
	   for (i=0; i < text.length - 1; i++)
	   {
		   
		   char encryptOne = text[i];
		   char encryptTwo = text[i+1];
		               //testing only
					   //System.out.print(encryptOne);
					   //System.out.print(encryptTwo);
		   encription(encryptOne, encryptTwo);
		               //testing purposes only
					   //System.out.println("");
		   i++;
       }//end for loop
	
	}//end Bigram method
	
public void encription(char one, char two)
    {
	   	int refOne = ((int) one -65);
	   	if (refOne > 8)
	   	{
	   		refOne -=1;
	   	}
	   	if(refOne == 9)
	   	{
	   		refOne = 8;
	   	}
	   	int refTwo = ((int) two -65);
	   	if (refTwo > 8)
	   	{
	   		refTwo -=1;
	   	}
	   	if(refTwo == 9)
	   	{
	   		refTwo = 8;
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
	   	
	   	char three = secondQuadrent[findPointOne];
	    char four = thirdQuadrent[findPointTwo];
	    
	   	//print these values
	    System.out.print(three+""+four);
	  
	   		
	}//end encription method
}
