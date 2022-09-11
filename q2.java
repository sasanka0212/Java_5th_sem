import java.io.DataInputStream;
import java.io.IOException;

public class q2 {
    public static void main(String arsgs[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int n;
        n = Integer.parseInt(dis.readLine());
        if(n%2==0)
            System.out.println(n + " is an even number");
        else
            System.out.println(n + " is a odd number");
    }   
}