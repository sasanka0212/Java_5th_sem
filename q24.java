import java.io.*;

// Java program to reverse the array
public class q24
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
        i = 0; j = a.length - 1;
        while(i<j)
        {
            a[i] = a[i] ^ a[j];
            a[j] = a[i] ^ a[j];
            a[i] = a[i] ^ a[j];
            i++; j--;
        }
        System.out.println("reverse of the array:");
        for(int val : a)
        {
            System.out.print(val + " ");
        }
    }
}