/**
 * Given a string remove the consecutive dulicate characters from it keeping the original order.
 */

import java.util.Scanner;


public class Question2 
{

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in); 
		String str=s.nextLine();//scans the string.
		char tmp= '\n';//this tmp variable stores the last different char.
		for(int i=0;i<str.length();i++)
		{								//till char is coming same then do nothing.
			if((str.charAt(i))!=tmp)  //if char is different then assign to the tmp and print the char.
			{
				tmp=str.charAt(i);
				System.out.print(""+str.charAt(i));				
			}
		}
	}
}