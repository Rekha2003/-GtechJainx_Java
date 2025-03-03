import java .util.Scanner;
class Calculator2
{
public static void main(String[] args){
//Calculator1 c= new Calculator1();
 Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice: ");
int c=sc.nextInt();
System.out.println("Enter first number: ");
int a=sc.nextInt();
System.out.println("Enter second number: ");
int b= sc.nextInt();
if(c == 1)
 System.out.println("Addition :" + (a+b));
else if(c == 2)
System.out.println("Subtraction :" + (a-b));
else if(c == 3)
System.out.println("Multiplication :" +(a*b));
else if(c == 4)
System.out.println("Division :"+ (a/b));
else
System.out.println("Enter valid number ");

}
}