import java.util.Scanner;
interface Calculator{

public void add();//by deafult it consider as abstract method
public void sub();
}

class Calculator1 implements Calculator{
 public void add(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the A value :");
int a=sc.nextInt();
System.out.println("Enter the B value :");
int b=sc.nextInt();
int c= a+b;
System.out.println(c);
}
 public void sub(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the A value :");
int a=sc.nextInt();
System.out.println("Enter the B value :");
int b=sc.nextInt();
int c= a-b;
System.out.println(c);
}

}
class Calculator2 implements Calculator{
 public void add(){
int a=10;
int b=20;
int c=a+b;
System.out.println(c);
}
 public void sub(){
int a=10;
int b=20;
int c=a-b;
System.out.println(c);
}

}
class Calculator3 implements Calculator{
 public void add(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the A value :");
int a=sc.nextInt();
System.out.println("Enter the B value :");
int b=sc.nextInt();
if(a>b){
System.out.println(a+b);
}
else{
System.out.println("invalid");
}
}
 public void sub(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the A value :");
int a=sc.nextInt();
System.out.println("Enter the B value :");
int b=sc.nextInt();
if(a<b)
System.out.println(b-a);
else
System.out.println("Invalid");
}

}
class InterfaceEX1{
public static void main(String[] args){
Calculator1 c1= new Calculator1();
Calculator2 c2= new Calculator2();
Calculator3 c3= new Calculator3();

c1.add();
System.out.println("----------------");
c1.sub();
System.out.println("----------------");
c2.add();
System.out.println("----------------");
c2.sub();
System.out.println("-----------------");
c3.add();
System.out.println("----------------");
c3.sub();



}
}

