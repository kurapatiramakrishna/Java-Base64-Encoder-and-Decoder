package Demo;

import java.util.Base64;
import java.util.Scanner;

public class Base64ToString
{
  public static void main(String[] args) 
  {
	  Scanner scan = new Scanner(System.in);
      System.out.println("Enter encoded value:");
      String strToEncoding = scan.nextLine();

      Base64.Decoder decoder = Base64.getDecoder();
      byte[] decodedBytes = decoder.decode(strToEncoding);
      String decodedString = new String(decodedBytes);

      System.out.println("Decoded string: " + decodedString);	
 }
}
