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
	   for (i=0; i < 4; i++)
	   {
		   
		   char encryptOne = text[i];
		   char encryptTwo = text[i+1];
		   encription(encryptOne, encryptTwo);
		               //testing purposes only
					   //System.out.print(encryptOne);
					   //System.out.print(encryptTwo);
					   //System.out.println("");
		   i++;
       }//end for loop
	
	}//end Bigram method
	
public void encription(char one, char two)
    {
	   	int refOne = ((int) one -65);
	   	int refTwo = ((int) two -65);
	   	//testing
	    System.out.println(one +" "+two);
	    System.out.println(refOne+" "+refTwo);
	   	
	   	//do maths to find second and third refernce
	   	int pointOne = (refOne/5); 
	    if(pointOne != 0)
	    {
	    	pointOne -=1;
	    }
	   	int pointOne1 = refOne%5;
	   	if(pointOne1 == 0)
	   	{
	   		pointOne1 = 5;
	   	}
	   	else if (pointOne1 == 5)
	   	{
	   		pointOne1 = 0;
	   	}
	   	
	   	
	   	
	   	int pointTwo = (refTwo/5);

	   	int pointTwo1 = refTwo%5;
	   	if(pointTwo1 == 0)
	   	{
	   		pointOne1 = 5;
	   	}
	   	else if (pointTwo1 == 5)
	   	{
	   		pointOne1 = 0;
	   	}
	   	
	   	System.out.println(pointOne+" "+pointOne1);
	   	System.out.println(pointTwo+" "+pointTwo1);
	   	int findPointOne = (pointOne*5)+(pointTwo1);
	   	int findPointTwo = (pointTwo*5)+(pointOne1);
	   	

	    char three = secondQuadrent[findPointOne-1];
	    char four = thirdQuadrent[findPointTwo+1];
	    
	   	//print these values
	    System.out.println(three+" "+four);
	  
	   		
	}//end encription method
}
