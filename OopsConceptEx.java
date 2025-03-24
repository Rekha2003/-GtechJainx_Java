import java.util.Scanner;
abstract class Shape{
float area;
abstract void acceptInput();
abstract void calcArea();
void dispArea(){

System.out.println("Area of the Square is :"+area);
}
}
class Square extends Shape{
 private float side;

void acceptInput(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the side");
side=sc.nextFloat();
}
void calcArea(){
area=side*side;
}
}
class Rectangle extends Shape{
private float length;
private float breadth;

void acceptInput(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the length");
length=sc.nextFloat();
System.out.println("Enter the breadth");
breadth=sc.nextFloat();
}
void calcArea(){
area=length*breadth;
}
}
class Circle extends Shape{
private float radius;
void acceptInput(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the radius");
radius=sc.nextFloat();
}
void calcArea(){
area=3.14f*radius*radius;
}
}
class Geometry{
 void maths(Shape ref){
     ref.acceptInput();
     ref.calcArea();
     ref.dispArea();

}
}
 class OopsConceptEx{
public static void main(String[] args){
Square s= new Square();
Rectangle r=new Rectangle();
Circle c= new Circle();
Geometry g=new Geometry();
g.maths(s);
g.maths(r);
g.maths(c);
}
}





