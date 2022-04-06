import java.util.*;
class Matrix
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
int i,rows,cols,j;
System.out.println("enter the rows of the matrix");
rows=sc.nextInt();
System.out.println("enter the cols of the matrix");
cols=sc.nextInt();
int a[][] = new int[rows][cols];
int b[][] = new int[rows][cols];
int c[][] = new int[rows][cols];
System.out.println("enter the elements of the matrix1");
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
	a[i][j]=sc.nextInt();
}
System.out.println();
}
System.out.println("enter the elements of the matrix2");
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
	b[i][j]=sc.nextInt();
}
System.out.println();
}
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
	c[i][j]=a[i][j]+b[i][j];
}
System.out.println();
}
System.out.println("The result of matrix");
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
System.out.println(c[i][j]);
	
}

System.out.println();
}

}}