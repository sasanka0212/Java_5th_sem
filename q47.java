import java.io.DataInputStream;
import java.io.IOException;

public class q47
{
	// Java program to find sqrt of a number without using sqrt() function
	public static void main(String args[]) throws IOException
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("enter a number : ");
		double num = Double.parseDouble(dis.readLine());
		double sr = findSqrt(num);
		System.out.println("square root of " + num + " : " + sr);
	}
	public static double findSqrt(double num)
	{
		double i = 1, res = 0.0;
		boolean f = true;
		while(f)
		{
			if(i*i == num)
			{
				res = i;
				f = false;
			}
			else if(i*i > num)
			{
				res = square(num, i-1, i);
				f = false;
			}
			i+=1;
		}
		return res;
	}
	public static double square(double num, double i, double j)
	{
		double mid = (i+j)/2;
		double mult = mid*mid;
		if((mult == num)||(Math.abs(mult-num)<0.00001))
			return mid;
		else if(mult < num)
			return square(num, mid, j);
		else
			return square(num, i, mid);
	}
}