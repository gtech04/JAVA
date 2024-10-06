import java.util.*;
public class Volshapes{
final double pi=3.14;
void volume(double radius,double height)
{
double vol=pi*radius*radius*height;
System.out.println("The volume of cylinder="+vol);
}
void volume(double side)
{
double vol=side*side*side;
System.out.println("The volume of cube="+vol);
}
void volume(double length,double width,double hieght)
{
double vol=length*width*hieght;
System.out.println("The volume of cuboid="+vol);
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Volshapes obj=new Volshapes();
double radius;
double side;
double length;
double width;
double height;
int ch;
do
{
System.out.println("Menu\n 1.Cylinder\n2.Cube\n3.Cuboid\n4.Exit\n");
System.out.println("Enter the choice");
ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the radius of the cylinder");
radius=s.nextDouble();
System.out.println("Enter the height of the cylinder");
height=s.nextDouble();
obj.volume(radius,height);
break;
case 2:
System.out.println("Enter the side of the cube");
side=s.nextDouble();
obj.volume(side);
break;
case 3:
System.out.println("Enter the length of the cuboid");
length=s.nextDouble();
System.out.println("Enter the width of the cuboid");
width=s.nextDouble();
System.out.println("Enter the height of the cuboid");
height=s.nextDouble();
obj.volume(length,width,height);
break;
case 4:
System.out.println("Exit");
default :
System.out.println("\nInvalid choice\n");
}
}
while(ch!=0);
}
}