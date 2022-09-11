import java.io.DataInputStream;

// Java program to check a given character is vowel or consonant
public class q8
{
    public static void main(String args[]) throws Exception
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("enter a character:");
        String c = dis.readLine();
        char a = c.charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
            System.out.println(a + " is a vowel");
        else
            System.out.println(a + " is a consonant");
    }
}