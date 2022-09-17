import java.io.*;

// Java program to copy elements from one array to another array
public class q30 
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
        System.out.println("given array1 elements :");
        for(int i : arr)
            System.out.print(i + " ");
        int[] arr1 = new int[arr.length];
        for(int i = 0; i<arr.length; i+=1)
            arr1[i] = arr[i];
        System.out.println("\nCopied elements :");
        for(int i : arr1)
            System.out.print(i + " ");
    }
}