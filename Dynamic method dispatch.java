import java.util.Scanner;
interface Tri
{
  public void triarea(int b, int h);
}
class Circle
{
  public void calculate(int r)
{
}
}

class Area extends Circle implements Tri
{
  public void triarea(int b,int h)
{
  System.out.println("Area of triangle is :"+(0.5*b*h));
}
 public void calculate(int r)
 {
  System.out.println("Area of circle is :"+(3.14*r*r));
 }
}
class Dynamic
{
 public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
 System.out.println("Enter base and height of triangle:");
 int b=sc.nextInt();
 int h=sc.nextInt();
 System.out.println("Enter radius of circle:");
int r=sc.nextInt();
Circle c=new Area();
Tri t= new Area();
 t.triarea(b,h);
 c.calculate(r);
}
}
Output:
D:\shruti>javac Dynamic.java

D:\shruti>java Dynamic
Enter base and height of triangle:
3
6
Enter radius of circle:
2
Area of triangle is :9.0
Area of circle is :12.56

D:\shruti>
