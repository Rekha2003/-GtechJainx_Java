import java.util.Scanner;
class StarPattern6
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();

  for(int i=1;i<=n;i++)
{
      char c='A';
for(int k=1;k<=n-i;k++)
{
     System.out.print(" ");
}
      	for(int j=1;j<=i;j++)
        {
	System.out.print(c++ +" ");

   	}
  System.out.println();
}
}
}