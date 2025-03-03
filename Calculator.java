import java .util.Scanner;
class 
{
public int add(int a, int b){
return a+b;
}Calculator1
public int sub(int a, int b){
return a-b;
}

public int mul(int a, int b){
return a*b;
}
public int add(int a, int b){
return a/b;
}
public static void main(String[] args){
Calculator1 c= new Calculator1();
 Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b= sc.nextInt();

 System.out.println("Addition :" + c.add(a,b));
System.out.println("Subtraction :" + c.sub(a,b);
System.out.println("Multiplication :" +c.mul(a,b));
System.out.println("Division :"+ c.div(a,b));

}
}