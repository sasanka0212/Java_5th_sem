import java.io.*;

// Reverse number using for, while and recursion
public class q38 
{
	public static void main(String args[]) throws Exception
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("enter a number:");
		int num = Integer.parseInt(dis.readLine());
		int rev = 0, r, n1;
		n1 = num;
		for(;n1!=0;)
		{
			r = n1 % 10;
			n1 /= 10;
			rev = rev*10 + r;
		}
		System.out.println("reversed number using for loop : " + rev);
		n1 = num; rev = 0;
		while(n1>0)
		{
			r = n1 % 10;
			n1/=10;
			rev = rev*10 + r;
		}
		System.out.println("reversed number using while loop : " + rev);
		Reverse obj = new Reverse();
		rev = obj.reverse(num);
		System.out.println("reversed number using recursion : " + rev);
	}
}
class Reverse
{
	static int rev = 0;
	public int reverse(int num)
	{
		if(num<1)
			return num%10;
		rev = rev*10 + num%10;
		reverse(num/10);
		return rev;
	}
}