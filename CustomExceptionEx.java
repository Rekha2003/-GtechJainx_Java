import java.util.Scanner;
class UnderAgeException extends Exception{
@Override
public String getMessage(){
return "UnderAge";
}
}
class OverAgeException extends Exception{
@Override
public String getMessage(){
return "OverAge";
}
} 

class Person{
int age;
public void acceptInput(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age");
age=sc.nextInt();
}
public void validate() throws Exception{
if(age>=18 && age<60)
{
System.out.println("Take your Driving license");
}
 if(age<18){
   UnderAgeException ue=new UnderAgeException();
   System.out.println(ue.getMessage());
throw ue;
}
if(age>=60){
OverAgeException oe=new OverAgeException();
System.out.println(oe.getMessage());
throw oe;
}
}
}
class Rto{
public void init(){
Person p=new Person();
try{
p.acceptInput();
p.validate();
}
catch(Exception e){
try{
p.acceptInput();
p.validate();

}
catch(Exception f){
try{
p.acceptInput();
p.validate();

}
catch(Exception g){
System.out.println("ILLEGAL AGE TO GET DRIVING LICENSE!!!!");
}
}
}
}
}
public class CustomExceptionEx{
public static void main(String[] args){
Rto r= new Rto();
r.init();
}
}

