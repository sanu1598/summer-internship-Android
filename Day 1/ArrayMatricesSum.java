import java.util.*;

public class ArrayMatricesSum
{
public static void main(String[] st)
{
Scanner scan=new Scanner(System.in);
int i,j;
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];

System.out.print("\nENTER VALUE IN MATRIX A:");
System.out.print("\n");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print("FOR INDEX "+i+j);System.out.print(" :");
a[i][j]=scan.nextInt();
}}

System.out.print("\nENTER VALUE IN MATRIX B:");
System.out.print("\n");
for(i=0;i<b.length;i++)
{
for(j=0;j<b[i].length;j++)
{
System.out.print("FOR INDEX "+i+j);System.out.print(" :");
b[i][j]=scan.nextInt();
}}

System.out.print("MATRIX A:\n");
for(int x[] : a)
{
for(int y : x)
{
System.out.print(" "+y);
}
System.out.print("\n");
}

System.out.print("MATRIX B:\n");
for(int x[] : b)
{
for(int y : x)
{
System.out.print(" "+y);
}
System.out.print("\n");
}


for(i=0;i<c.length;i++)
{
for(j=0;j<c[i].length;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}

System.out.print("MATRIX C = MATRIX A + MATRIX B\n");
System.out.print("MATRIX C:\n");
for(int x[] : c)
{
for(int y : x)
{
System.out.print(" "+y);
}
System.out.print("\n");
}
}}