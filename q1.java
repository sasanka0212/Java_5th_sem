import java.io.DataInputStream;
import java.io.IOException;

public class q1 {
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int a, b;
        System.out.print("enter 2 no:");
        a = Integer.parseInt(dis.readLine());
        b = Integer.parseInt(dis.readLine());
        System.out.println("result :" + (a+b));
    }   
}