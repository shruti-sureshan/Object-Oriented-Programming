import java.util.Scanner;
class Student
{
int no;
String name;
void set()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name:");
name=sc.nextLine();
System.out.println("enter no:");
no=sc.nextInt();
}
void display()
{
System.out.println("name:"+name);
System.out.println("no:"+no);
}
}
class Marks extends Student
{
int m1,m2;
Scanner sc=new Scanner(System.in);
void set1()
{
 System.out.println("enter marks in maths:");
m1=sc.nextInt();
System.out.println("enter marks in oopm:");
m2=sc.nextInt();
}
void display1()
{
System.out.println("MATHS:"+m1);
System.out.println("OOPM:"+m2);
}
}
class Total extends Marks
{
void cal()
{
int t=m1+m2;
System.out.println("TOTAL:"+t);
}
}
class Multilevel
{
public static void main(String args[])
{
Total a=new Total();
a.set();
a.set1();
a.display();
a.display1();
a.cal();
}
}

/*
Output-
D:\shruti>javac Multilevel.java
D:\shruti>java Multilevel
Enter name:
shruti
enter no:
16
enter marks in maths:
50
enter marks in oopm:
40
name:shruti
no:16
MATHS:50
OOPM:40
TOTAL:90
D:\shruti>

*/