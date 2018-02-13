# fourSquareCipherJava
an attempt an make a java program that works as a four square encription cipher, gets keywords from user and encrypts a text file

program will begin by asking the user for keywords and using a method will insert these words into the second and third char arrays.. representing the second and third quadrents
i think that a method where... for(inputString.Length)
                                      {
									    char array(i) = inputString.charAt(i);
									  }
				                      hopefully should add keywords correctly
									  //** turns out you have to remove duplicates from key word so im going to convert the keywords to a char array first, remove dupicates and pass that array to function

starting first just by using 4 single arrays to represent the 4 squares, the reason for this is that I think that it will be quicker to search through two single arrays and find the corresponding values in the other arrays
the big 0 notation on this is o(n) however as with a large input size the program will have to loop many times..
