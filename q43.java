import java.io.DataInputStream;

public class q43
{
	// Java program to print prime numbers between 1 to n
	public static void main(String args[]) throws Exception
	{
		boolean f;
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("enter max value : ");
		int n = Integer.parseInt(dis.readLine());
		for(int i = 1; i<=n; i++)
		{
			f = true;
			for(int j = 2; j<=i/2; j++)
			{
				if(i % j == 0)
					f = false;
			}
			if(f)
				System.out.print(i + " ");
		}
	}
}