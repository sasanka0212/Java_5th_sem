
public class q42 
{
	// Java program to print first 100 prime numbers
	public static void main(String args[])
	{
		boolean f;
		for(int i = 1; i<=100; i++)
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