import java.io.*;

// Java program to find smallest number in an array
public class q36 
{
    public static void main(String args[]) throws IOException
    {
        int arr[], smallestEle;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter array size : ");
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        System.out.println("enter array elements : ");
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        System.out.println("given elements : ");
        for(int i : arr)
            System.out.print(i + " ");
        smallestEle = arr[0];
        for(int i = 1; i<n; i++)
            if(smallestEle > arr[i])
                smallestEle = arr[i];
        System.out.println("Smallest element in the given array is : " + smallestEle);
    }
}