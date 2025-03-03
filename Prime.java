import java.util.Scanner;
class Prime{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
if(isPrime(i)){
System.out.println(i);}
}
//else
//System.out.println(n+ " is not prime");
}

public static Boolean isPrime(int n){

 if(n<=2)
return false;
//if(n%2==0 || n%3==0)
//return false;
if(n==3) return true;
for(int i=2;i<=n;i++){
if(n%i == 0)
return true;

}

return false;

}}