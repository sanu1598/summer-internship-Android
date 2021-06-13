class Vehicle
{
int wheels,cap;
Vehicle(int w,int c)
{
wheels=w;
cap=c;
}

void show()
{
System.out.println("\nWHEELS:"+wheels);
System.out.println("CAPACITY:"+cap);
}}

class Car extends Vehicle
{
int horns;
Car(int a,int b,int c)
{
super(a,b);
horns=c;
}

void disp()
{
show();
System.out.println("\nHORNS:"+horns);
}}

interface Speed
{
int sp=500;
void spe();
}

interface Fly extends Speed
{
int height=5000;
void flew();
}

interface Loading
{
int weight=20;
void we();
}

class Plane extends Vehicle implements Fly,Loading
{
int ahost;
Plane(int a,int b,int d)
{
super(a,b);
ahost=d;
}

public void we()
{
System.out.println("\n WEIGHT:"+weight);
}
public void flew()
{
System.out.println("HEIGHT:"+height);
}

public void spe()
{
System.out.println("SPEED:"+sp);
}

void show()
{
super.show();
flew();
spe();
we();
System.out.println("A-HOST:"+ahost);
}}

public class Interface
{
public static void main(String[]st)
{
Car c1=new Car(4,5,2);
Plane p1=new Plane(16,200,20);
c1.disp();
p1.show();
}}