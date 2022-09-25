import java.util.*;

// Java program to check a string is palindrome or not using recursion
public class q39 
{
	public static void main(String args[])
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a string : ");
		s = sc.nextLine();
		System.out.println();
		Reverse1 obj = new Reverse1();
		if(obj.palindrome(s, 0, s.length()-1))
			System.out.println(s + " is a palinfrome string");
		else
			System.out.println(s + " is not a palindrome string");
	}
}
class Reverse1
{
	public boolean palindrome(String s, int i, int j)
	{
		if(i==j)
			return true;
		if(s.charAt(i)!=s.charAt(j))
			return false;
		if(i<j)
			return palindrome(s,i+1,j-1);
		return true;
	}
}