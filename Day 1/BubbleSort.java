public class BubbleSort
{
public static void main(String[] st)
{
int a[]=new int[st.length];
int i,j,t;
for(i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(st[i]);
}

for(i=a.length-1;i>0;i--)
{
	for(j=0;j<i;j++)
	{
		if(a[j]>a[j+1])
		{
		t=a[j];
		a[j]=a[j+1];
		a[j+1]=t;
		}
	}
}
for(i=0;i<a.length;i++)
{
System.out.print(" "+a[i]);
}

}}