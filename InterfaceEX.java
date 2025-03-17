interface Vehicle{
void start();
void stop();
}

class Car implements Vehicle{
public void start(){
System.out.println("Car is Starting");
}
public void stop(){
System.out.println("Car Stopped");
}
}
class Bike implements Vehicle{
public void start(){
System.out.println("Bike is Starting");
}
public void stop(){
System.out.println("Bike Stopped");
}
}

class InterfaceEX{
public static void main(String[] args){
Car c= new Car();
Bike b=new Bike();
c.start();
c.stop();
b.start();
b.stop();
}
}


