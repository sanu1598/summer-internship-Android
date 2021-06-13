import java.util.*;

class Student
{
int id;
String na;
int age;
Scanner scan;

Student()
{
scan=new Scanner(System.in);
}

void input()
{
System.out.print("ENTER ID:");
id=scan.nextInt();
System.out.print("ENTER NAME:");
na=scan.next();
System.out.print("ENTER AGE:");
id=scan.nextInt();
}

void show()
{
System.out.println("\nID:"+id+"  NAME:"+na+"  AGE:"+age);
}}

public class ArrayObj
{
public static void main(String[] st)
{
//Student s1=new Student(();
int n=Integer.parseInt(st[0]);

Student s[]=new Student[n];
int i;
for(i=0;i<s.length;i++)
{
s[i]=new Student();
}

for(i=0;i<s.length;i++)
{
s[i].input();
}

for(i=0;i<s.length;i++)
{
s[i].show();
}
}}