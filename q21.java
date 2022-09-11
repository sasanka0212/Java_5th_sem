import java.io.*;

// Java program to count total number of elements
public class q21
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[], n, count = 0;
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
            count+=1;
        }
        System.out.println("number of elements : " + count);
    }
}