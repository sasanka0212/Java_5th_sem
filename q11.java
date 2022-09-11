import java.io.*;

// Java program to calculate power of a number
public class q11
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int p, num, res = 1;
        System.out.print("enter number & power : ");
        num = Integer.parseInt(dis.readLine());
        p = Integer.parseInt(dis.readLine());
        for(int i = 1; i<=p; i++)
        {
            res*=num;
        }
        System.out.println("result is : " + res);
    }
}