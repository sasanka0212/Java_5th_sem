import java.io.*;

// Java program to add two matrices
public class q27 
{
    public static void main(String args[]) throws Exception
    {
        int r,c;
        int arr1[][], arr2[][], arr3[][];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter row and col or matrix 1:");
        r = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        arr1 = new int[r][c];
        System.out.print("enter row and col or matrix 2:");
        r = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        arr2 = new int[r][c];
        System.out.print("enter elements of matrix 1:");
        for(int i = 0; i<arr1.length; i++)
        {
            for(int j = 0; j<arr1[0].length; j++)
            {
                arr1[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.print("enter elements of matrix 2:");
        for(int i = 0; i<arr2.length; i++)
        {
            for(int j = 0; j<arr2[0].length; j++)
            {
                arr2[i][j] = Integer.parseInt(br.readLine());
            }
        }
        if(arr1.length==arr2.length && arr1[0].length==arr2[0].length)
        {
            arr3 = new int[arr1.length][arr1[0].length];
            for(int i = 0; i<arr2.length; i++)
            {
                for(int j = 0; j<arr2[0].length; j++)
                {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            System.out.println("result matrix :");
            for(int i = 0; i<arr3.length; i++)
            {
                for(int j = 0; j<arr3[0].length; j++)
                {
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("addition is not possible");
    }
}