import java.util.Scanner;
class PrintUniqueElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
        isUnique(nums);
    }
    public static void isUnique(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i] == nums[j]){
                count++;
                }
            }
            if(count == 1)
            System.out.print(nums[i]+" ");
        }
    }
}