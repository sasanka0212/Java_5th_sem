import java.io.*;

// Java program to find average of elements in an array
public class q22
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[], n, total = 0;
        float avg;
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
        avg = total / arr.length;
        System.out.println("average of elements : " + avg);
    }
}