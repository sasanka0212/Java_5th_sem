import java.util.*;

// Java program to convert a character array into string
public class q26 
{
    public static void main(String args[]) throws Exception
    {
        char arr[];
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("enter characters : ");
        arr = sc.next().toCharArray();
        String s = new String(arr);
        for(char a : arr)
            System.out.print(a + " ");
        System.out.println("coverted string : " + s);
        sc.close();
    }
}