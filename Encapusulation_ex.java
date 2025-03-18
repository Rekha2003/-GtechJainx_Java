class Encapusulation_ex{
private int number;

public int getNumber(){
return number;
}

public void setNumber(int num){
if(num !=0 && num>0){
this.number=num;
}

public static  boolean checkPrime(int n){
int count=0;
for(int i=0;i<n;i++){
if(n%i==0){
count++;
}
}
if(count<=2){
return true;
}
else{
 return false;
}
}
public static void main(String[] args){
int n;
Encapusulation_ex e=new Encapusulation_ex();
e.setNumber(7);
n=getNumber();
boolean value=e.checkPrime(n);
System.out.println(value);
}
}