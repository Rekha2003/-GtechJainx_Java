import java.util.Scanner;
class HallowDiamond{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
//upperDiamond
for(int i=0;i<n;i++){
for(int j=0;j<n-i;j++){

System.out.print(" ");
}
for(int k=0;k<=i;k++){
if(k==0 || k ==i){
System.out.print("* ");
}
else { System.out.print("  ");}
}
System.out.println();
}
//Lower Diamond
for(int i=n-2;i>=0;i--){
for(int j=0;j<n-i;j++){

System.out.print(" ");
}
for(int k=0;k<=i;k++){
if(k==0 || k ==i){
System.out.print("* ");
}
else { System.out.print("  ");}
}



System.out.println();
}


}
}