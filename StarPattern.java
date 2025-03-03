import java.util.Scanner;
class StarPattern
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
  for(int i=0;i<=n;i++){
     //System.out.print(i+" ");
	for(int j=n;j>=i;j--){
	System.out.print("* ");
	}
  System.out.println();
}
}
}