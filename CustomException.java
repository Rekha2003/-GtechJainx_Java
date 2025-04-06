import java.util.Scanner;
class InvalidInputException extends Exception{

}
class Atm{
int pin=1234;
int p;
public void acceptInput(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the pin");
p=sc.nextInt();
}
public void verify() throws Exception
{
if(pin==p)
{
System.out.println("Collect your money");
}
else
{
InvalidInputException ie= new InvalidInputException();
System.out.println("Invalid input");
throw ie;
}
}
}
class Bank{
public void init(){
Atm a=new Atm();
try{
a.acceptInput();
a.verify();
}
catch(Exception e)
{
try{
a.acceptInput();
a.verify();
}
catch(Exception f){
try{
a.acceptInput();
a.verify();

}
catch(Exception g){
System.out.println("Your account has blocked!!! Please contact your bank");
}
}
} 
}
}
public class CustomException{
public static void main(String[] args){
Bank b=new Bank();
b.init();
}
}
