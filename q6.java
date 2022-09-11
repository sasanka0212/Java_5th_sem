import java.io.DataInputStream;
import java.io.IOException;

// Multiplication of two numbers
public class q6
{
    public static void main(String arsgs[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int n1, n2;
        System.out.print("enter two numbers:");
        n1 = Integer.parseInt(dis.readLine());
        n2 = Integer.parseInt(dis.readLine());
        System.out.println("Multiplication : " + n1*n2);
    }
}