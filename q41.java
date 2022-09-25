import java.io.*;

// Java program to find factorial of a number using recursion
public class q41 
{
	public static void main(String args[]) throws Exception
	{
		int num;
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("enter a number : ");
		num = Integer.parseInt(dis.readLine());
		System.out.println("factorial of " + num + " : " + factorial(num));
	}
	public static int factorial(int num)
	{
		int f;
		if(num==0||num==1)
			return num;
		f = num * factorial(num-1);
		return f;
	}
}