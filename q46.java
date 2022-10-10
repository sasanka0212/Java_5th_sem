import java.io.DataInputStream;

public class q46
{
	// Java program to check a given number is perfect square or not
	public static void main(String args[]) throws Exception
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("enter a number to check if it is perfect square or not : ");
		int num = Integer.parseInt(dis.readLine());
		boolean f = isPerfectSquare(num);
		System.out.println(f);
	}
	public static boolean isPerfectSquare(int num)
	{
		int sr = (int)Math.sqrt(num);
		return (sr*sr==num);
	}
}