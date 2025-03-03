import java .util.Scanner;
class Calculator3
{
public static void main(String[] args){
//Calculator1 c= new Calculator1();
 Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice: ");
int choice=sc.nextInt();
System.out.println("Enter first number: ");
int a=sc.nextInt();
System.out.println("Enter second number: ");
int b= sc.nextInt();
switch(choice){
case 1:
 System.out.println("Addition :" + (a+b));break;
case 2:
System.out.println("Subtraction :" + (a-b));break;
case 3:
System.out.println("Multiplication :" +(a*b));break;
case 4:
System.out.println("Division :"+ (a/b));break;
default:
System.out.println("Enter valid number ");}


}
}