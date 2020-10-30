import java.util.Scanner;
class Symmetric
{    
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no. of rows : \n");
int rows = sc.nextInt();
System.out.println("Enter the no. of columns : \n");
int cols = sc.nextInt();
int matrix[][] = new int[rows][cols];
System.out.println("Enter the elements :\n");
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
matrix[i][j] = sc.nextInt();
}
}
System.out.println("Printing the input matrix :\n");
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
System.out.print(matrix[i][j]+"\t");
}
System.out.println();
}
if(rows != cols)
{
System.out.println("The given matrix is not Symmetric");
}
else
{
int flag=1; 
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
if(matrix[i][j] != matrix[j][i])
{
flag=0;
break;
}
}
}
if(flag==1)
{
System.out.println("The given matrix is Symmetric");
}
else
{
System.out.println("The given matrix is not Symmetric");
}
}
}
}

/*
OUTPUT-
D:\shruti>javac Symmetric.java
D:\shruti>java Symmetric
Enter the no. of rows :
3
Enter the no. of columns :
3
Enter the elements :
1
2
1
2
3
4
1
4
5
Printing the input matrix :
1       2       1
2       3       4
1       4       5
The given matrix is Symmetric
D:\shruti>

*/