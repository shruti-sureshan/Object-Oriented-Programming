import java.util.Scanner;
class Nos
{
public static void main(String[] args) 
{
int n, t,i,j;
Scanner s = new Scanner(System.in);
System.out.print("Enter no. of elements you want in array:");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Enter all the elements:");
for (i = 0; i < n; i++) 
{
a[i] = s.nextInt();
}
for (j=0 ; j<(n-1) ; j++)
{
for (i=0 ; i<(n-1) ; i++)
{
if (a[i+1] < a[i])
{
t = a[i];
a[i] = a[i + 1];
a[i + 1] = t;
}
}
}
System.out.print("Ascending Order:");
for (i=0 ; i<n ; i++)
{
System.out.print(a[i] + ",");
}
System.out.print("\n descending Order:");
for (i=n ; i>0 ; i--)
{
System.out.print(a[i-1] + ",");
}
}
}

/*
OUTPUT-
D:\shruti>javac Nos.java
D:\shruti>java Nos
Enter no. of elements you want in array:5
Enter all the elements:
58
92
37
10
63
Ascending Order:10,37,58,63,92,
 descending Order:92,63,58,37,10,
D:\shruti>
*/