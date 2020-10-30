interface  Area
{
double pi=3.14;
double compute(double x,double y);
}
class Rect implements Area
{ 
 public double compute(double x,double y)
 {          
return x*y;             
}
}
class Sqr implements Area
{
  public double compute(double x,double y)
 {          
return x*x;          
}
}               
class Circle implements Area
{
 public double compute(double x,double y)
{          
return pi*x*x;        
}
}
class Area1
{
         public static void main(String arg[])
        { 
              Rect r=new Rect();
              Sqr s=new Sqr();
              Circle c=new Circle();
             System.out.println("The Area of rectangle is:"+r.compute(10,20));
             System.out.println("The Area of square  is :"+s.compute(10,12));
             System.out.println("The Area of Circle  is :"+c.compute(10,12));
}
}

/*
OUTPUT-
D:\shruti> javac Area1.java
D:\shruti>java Area1
The Area of rectangle is:200.0
The Area of square  is :100.0
The Area of Circle  is :314.0
D:\shruti>
*/