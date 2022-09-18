import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Java program to find duplicate elements in an array
public class q34
{
    public static void main(String args[]) throws IOException
    {
        List<Integer> num = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[], count;
        boolean f;
        System.out.print("enter array size : ");
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        System.out.println("enter array elements : ");
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        System.out.println("given elements : ");
        for(int i : arr)
            System.out.print(i + " ");
        for(int i = 0; i<n; i++)
        {
            count = 0;
            for(int j = 0; j<n ; j++)
                if(arr[i]==arr[j])
                    count++;
            if(count>1)
            {
                f = true;
                for(int val : num)
                {
                    if(val==arr[i])
                    {
                        f = false;
                        break;
                    }
                }
                if(f)
                    num.add(arr[i]);
            }
        }
        System.out.println("duplicate elements are : ");
        for(int val : num)
            System.out.print(val + " ");
    }
}