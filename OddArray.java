import java.util.Scanner;
class OddArray{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int[] nums=new int[n];
for(int i=0;i<n;i++)
nums[i]=sc.nextInt();

for(int j=0;j<n;j++){
if(nums[j]%2 !=0)
System.out.print(nums[j]+" ");
}
}
}