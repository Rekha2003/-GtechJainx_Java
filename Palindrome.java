import java.util.Scanner;
class Palindrome{
//int temp;
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
String s=sc.nextLine();
if(isPalindrome(s))
System.out.println("true");
else
System.out.println("false");



}
public static boolean isPalindrome(String s){
int left=0;
int right=s.length()-1;
while(left<=right){
if(s.charAt(left) != s.charAt(right)){
return false;
}
left++;
right--;}
return true;

}
}
