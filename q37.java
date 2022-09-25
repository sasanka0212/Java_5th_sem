import java.io.*;

// Java program to remove duplicate elements from an array
public class q37 
{
    public static void main(String args[]) throws IOException
    {
        int arr[], count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter array size : ");
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        System.out.println("enter array elements(only positive) : ");
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++)
        {
        	for(int j = i+1; j<n; j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			for(int k = j; k<n-1; k++)
        			{
        				arr[k] = arr[k+1];
        			}
        			count+=1;
        		}
        	}
        }
        System.out.println("\nafter deleting duplicate elements : ");
        for(int i = 0; i<count; i++)
            System.out.print(arr[i] + " ");
    }
}