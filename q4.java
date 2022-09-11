import java.io.DataInputStream;
import java.io.IOException;

// Java program to add two binary numbers
public class q4 {
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int bin1, bin2, sum = 0, c = 0, r1, r2, p = 1;
        System.out.print("enter 2 binary numbers:");
        bin1 = Integer.parseInt(dis.readLine());
        bin2 = Integer.parseInt(dis.readLine());
        while(bin1!=0 && bin2!=0)
        {
            r1 = bin1 % 10;
            r2 = bin2 % 10;
            bin1/=10;
            bin2/=10;
            sum = sum + (c + r1 + r2) % 2 * p;
            c = (c + r1 + r2) / 2;
            p*=10; 
        }
        while(bin1!=0)
        {
            r1 = bin1 % 10;
            bin1/=10;
            sum = sum + (c + r1 ) % 2 * p;
            c = (c + r1) / 2;
            p*=10;
        }
        while(bin2!=0)
        {
            r2 = bin2 % 10;
            bin2/=10;
            sum = sum + (c + r2) % 2 * p;
            c = (c + r2) / 2;
            p*=10;
        }
        if(c!=0)
            sum = sum + c * p;
        System.out.println("sum:" + sum);
    }   
}