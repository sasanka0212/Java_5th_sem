import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
// Java program to convert integer to digits
public class q44 
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream dis = new DataInputStream(System.in);
		List<Integer> ls = new ArrayList<>();
		System.out.print("enter a digit : ");
		int n = Integer.parseInt(dis.readLine());
		System.out.println("given number : " + n);
		while(n>0)
		{
			ls.add(n%10);
			n/=10;
		}
		ls.forEach(i -> System.out.print(i + " "));
	}
}