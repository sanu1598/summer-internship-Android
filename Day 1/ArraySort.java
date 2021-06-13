import java.util.*;

public class ArraySort
{
public static void main(String[] st)
{
Scanner scan=new Scanner(System.in);
	int i,j,temp;
int a[]=new int[10];

for(i=0;i<10;i++)
{
System.out.print("ENTER VALUE:");
a[i]=scan.nextInt();
}

for(i=0;i<10;i++)
{
	for(j=i;j>0;j--)
	{

	if(a[j]<a[j-1])
	{ 
	  temp=a[j];
	  a[j]=a[j-1];
	  a[j-1]=temp;
	}
	}
}
 
for(int x : a)
{
System.out.print("\n "+x);
}

}}
	