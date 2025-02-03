import java.io.*;
import java.util.Scanner;

public class datatypes{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    short s=sc.nextShort();
    int a=sc.nextInt();
    Byte b =sc.nextByte();
    float f=sc.nextFloat();
    String d=sc.next();
    System.out.println(a);
    System.out.println(b);
    System.out.println(f);
    System.out.println(s);
    System.out.println(d);

    System.out.println(a>b);
   }
}