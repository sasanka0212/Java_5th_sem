import java.io.DataInputStream;

// Java program to check a year is leap year or not
public class q7
{
    public static void main(String args[]) throws Exception
    {
        DataInputStream dis = new DataInputStream(System.in);
        int year;
        System.out.print("Enter a year : ");
        year = Integer.parseInt(dis.readLine());
        if(year%4==0 && year%100!=0)
            System.out.println(year + " is a leap year");
        else if(year%400==0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}