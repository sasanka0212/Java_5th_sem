import java.util.*;

// Java program to reverse a string using recursion
public class q40 
{
	public static void main(String arga[])
	{
		String s, rev;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a string : ");
		s = sc.nextLine();
		rev = new Reverse2().reverse(s, s.length()-1);
		System.out.println("reversed string : " + rev);
		sc.close();
	}
}
class Reverse2
{
	String rev;
	String reverse(String s, int i)
	{
		if(i==-1)
			return "";
		rev = s.charAt(i) + reverse(s,i-1);
		return rev;
	}
}