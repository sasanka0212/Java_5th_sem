import java.io.DataInputStream;
import java.io.IOException;

// Java program to calculate simple interest
public class q10
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int amount, t, n = 100;
        double r, finalAmount;
        System.out.print("enter primary amount : ");
        amount = Integer.parseInt(dis.readLine());
        System.out.print("enter interest rate : ");
        r = Double.parseDouble(dis.readLine());
        System.out.print("enter time period(year) : ");
        t = Integer.parseInt(dis.readLine());
        finalAmount = (amount * t * r) / 100;
        System.out.println("Final amount : " + (finalAmount + amount));
    }
}