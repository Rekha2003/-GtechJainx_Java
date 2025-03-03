
import java.util.Scanner;

class GetterAndSetter 
{
  int num;// instance variable can acess anywhere inside a class
  int getNum()
  {
	return num;

  }
   void setNum(int var)
   {
    if(var == 0) 
	num=10;
    else   
	num=var;
    System.out.println(num);
   }
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
  GetterAndSetter gs=new GetterAndSetter();
  gs.setNum(b);
  gs.getNum();
  }
}