import java.io.*;

// Java program to sort the array in ascending order
public class q25
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[], n, i, j;
        System.out.print("enter array size:");
        n = Integer.parseInt(br.readLine());
        a = new int[n];
        System.out.println("enter array elements:");
        for(i = 0; i<n; i++)
            a[i] = Integer.parseInt(br.readLine());
        System.out.println("given elements:");
        for(int val : a)
        {
            System.out.print(val + " ");
        }
        for(i = 0; i<n-1; i++)     // selection sort
        {
            for(j = 1; j<n-i; j++)
            {
                if(a[j-1] > a[j]){
                    a[j-1] = a[j-1] ^ a[j];
                    a[j] = a[j-1] ^ a[j];
                    a[j-1] = a[j-1] ^ a[j];
                }
            }
        }
        System.out.println("sorted array in ascending order:");
        for(int val : a)
        {
            System.out.print(val + " ");
        }
    }
}