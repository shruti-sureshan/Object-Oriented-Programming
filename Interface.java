import java.util.Scanner;
interface Perimeter
{
public void peri();
}
interface Area
{
public void area();
}
class Rectangle implements Area,Perimeter
{
int length,breadth;
Rectangle(int x,int y)
{
length=x;
breadth=y;
}
public void area()
{
System.out.println("Area:"+(length*breadth));
}
public void peri()
{
System.out.println("Perimeter:"+(2*(length+breadth)));
}
}
class Multiple
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter length and breadth");
int x=sc.nextInt();
int y=sc.nextInt();
Rectangle r=new Rectangle(x,y);
r.area();
r.peri();
}
}


/*
D:\shruti>javac Multiple.java

D:\shruti>java Multiple
Enter length and breadth
3
4
Area:12
Perimeter:14

D:\shruti>



*/
  
