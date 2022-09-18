import java.io.*;

// Java program to right rotate the array
public class q33
{
    public static void main(String args[]) throws IOException
    {
        int arr[], choice, pivot;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter array size : ");
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        System.out.println("enter array elements : ");
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        System.out.print("enter 1 to right rotate or 0 to don't rotate the array : ");
        choice = Integer.parseInt(br.readLine());
        while(choice==1)
        {
            pivot = arr[n-1];
            for(int i = n-1; i>0; i--)
                arr[i] = arr[i-1];
            arr[0] = pivot;
            System.out.println("After right rotation:");
            for(int i : arr)
                System.out.print(i + " ");
            System.out.print("enter 1 to right rotate or 0 to don't rotate the array : ");
            choice = Integer.parseInt(br.readLine());
        }
    }
}