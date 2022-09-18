import java.io.*;

// Jaba program to find largest element in an array
public class q35 
{
    public static void main(String args[]) throws IOException
    {
        int arr[], largestEle;
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
        largestEle = arr[0];
        for(int i = 1; i<n; i++)
            if(largestEle < arr[i])
                largestEle = arr[i];
        System.out.println("Largest element in the given array is : " + largestEle);
    }
}