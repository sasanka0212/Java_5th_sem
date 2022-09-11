import java.io.*;

// Java program to add the elements of the array
public class q23
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[], n, total = 0;
        System.out.print("enter number of elements:");
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        System.out.println("enter array elements:");
        for(int i = 0; i<n; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i : arr)
        {
            total = total + i;
        }
        System.out.println("sum of elements : " + total);
    }
}