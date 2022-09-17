import java.io.*;

// Java program to display array elements present on even position
public class q29 
{
    public static void main(String args[]) throws IOException
    {
        int arr[];
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter array size :");
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        System.out.println("enter elements :");
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        System.out.println("given array elements on even positions :");
        for(int i = 1; i<n; i+=2)
            System.out.print(arr[i] + " ");
    }
}