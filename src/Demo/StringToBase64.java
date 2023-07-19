package Demo;

import java.util.Base64;
import java.util.Scanner;

//importing base64
public class StringToBase64 
{
  public static void main(String[] args)
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Eter the Encoded value");
	String strtoencoding=scan.nextLine();
	System.out.println("Before encoding :"+strtoencoding);
	
	//now lets decode the string
	Base64.Encoder encoder=Base64.getEncoder();
	String encodedstring=encoder.encodeToString(strtoencoding.getBytes());
	System.out.println("encoded string :"+encodedstring);
  }
}
