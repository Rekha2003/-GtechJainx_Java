import java.util.Scanner;
class SecondLargest{
//int temp;
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();

int[] nums=new int[n];
for(int i=0;i<n;i++)
nums[i]=sc.nextInt();

for(int j=0;j<n-1;j++){
for(int k=0;k<n-j-1;k++){
if(nums[k] > nums[k+1]){
 int temp=nums[k];
nums[k]=nums[k+1];
nums[k+1]=temp;}
}
}

System.out.print(nums[n-2]);


}
}
