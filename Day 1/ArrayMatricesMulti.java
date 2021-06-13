import java.util.*;

public class ArrayMatricesMulti
{
public static void main(String[] st)
{
Scanner scan=new Scanner(System.in);
int i,j,k,s;
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

System.out.print("\nMATRIX c:\n");
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
	s=0;
		for(k=0;k<3;k++)
		{
		s=s+a[i][k]*b[k][j];
		}
	c[i][j]=s;	
	System.out.print(" "+c[i][j]);
	}

System.out.println("\n");

}

}}