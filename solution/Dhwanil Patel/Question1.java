/**
 * Given a string remove the duplicate characters from it keeping the original order.
 *
 * @author Dhwanil
 */

import java.util.ArrayList;
import java.util.Scanner;


public class Question1 
{

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();  //scans the string.
		ArrayList<Character> chr=new ArrayList<Character>();  //arraylist of different char of string.
		for(int i=0;i<str.length();i++)
		{
			if(!chr.contains(str.charAt(i)))  //if char is dif and not in arraylist then add it and print char.
					{
					chr.add(str.charAt(i));
					System.out.print(""+str.charAt(i));
					}
		}
		
	}
}