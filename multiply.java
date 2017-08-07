# Multiply
import java.io.*;
import java.util.*;
public class Multiply
{
  public static void main(String args[])
  {
    String a,b,y; 
    int x;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the two integer");
    a=sc.nextLine();
    b=sc.nextLine();
    int c=Integer.parseInt(a);
    int d=Integer.parseInt(b);
    if(c>0 && d>0)
    {
      x=c*d;
      y=String.valueOf(x); 
      System.out.println(y);
    }
    else
    {
      System.out.println("it is negative number");
    }
  }
}
