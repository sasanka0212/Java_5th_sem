import java.io.*;

// Java program to add two complex numbers
public class q5 {
    public static void main(String args[]) throws IOException
    {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();
        System.out.println("enter values of complex1:");
        c1.input();
        System.out.println("enter values of complex2:");
        c2.input();
        c3 = c2.calculate(c1);
        System.out.println("1st complex number:");
        c1.display();
        System.out.println("2nd complex number:");
        c2.display();
        System.out.println("resultant complex number:");
        c3.display();
    } 
}

class Complex
{
    int real, img;
    void input() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        real = Integer.parseInt(dis.readLine());
        img = Integer.parseInt(dis.readLine());
    }
    Complex calculate(Complex c1)
    {
        Complex c = new Complex();
        c.real = real + c1.real;
        c.img = img + c1.img;
        return c;
    }
    void display()
    {
        if(img>0)
            System.out.println(real + "+" + img + "i");
        else
            System.out.println(real + img + "i");
    }
}