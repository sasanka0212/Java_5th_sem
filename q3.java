import java.io.DataInputStream;
import java.io.IOException;

public class q3 {
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int n;
        n = Integer.parseInt(dis.readLine());
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}