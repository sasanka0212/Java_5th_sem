import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Java program to count frequency of each element in an array
public class q31
{
    public static void main(String args[]) throws IOException
    {
        int arr[], count;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter array size : ");
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        System.out.println("enter array elements(only positive) : ");
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++)
        {
            count = 1;
            if(arr[i]!=-1)
            {
                for(int j = i+1; j<n; j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++; arr[j] = -1;
                    }
                }
                System.out.println("frequency of " + arr[i] + " is : " + count);
                arr[i] = -1;
            }
        }
    }
}