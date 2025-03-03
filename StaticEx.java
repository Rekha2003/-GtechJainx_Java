class StaticEx
{
//Constructer example
 StaticEx(){
System.out.println("This is a Constructer");
}
 // Static method
 static void static_exp()
{
      System.out.println("This is an example of static method..");
}
   //Instance Method
  void instance_exp()
{
      System.out.println("This is a example of instance method");
}
 public static void main(String[] args)
{
	StaticEx sc=new StaticEx();
        static_exp();
    
	sc.instance_exp();
	System.out.println("Arguments: "+(args[0]+args[1]));

}
}