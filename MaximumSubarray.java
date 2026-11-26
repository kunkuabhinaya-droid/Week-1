import java.util.Scanner;
public class MaximumSubarray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Array size: ");
int n=sc.nextInt();
int[] num=new int[n];
System.out.println("Enter Array Elements: ");
for(int i=0;i<n;i++) {
num[i]=sc.nextInt();
}
int currentSum=num[0];
int maxSum=num[0];
for(int i=1;i<n;i++) {
if(currentSum+num[i]>num[i]) {
currentSum=currentSum+num[i];
} else {
currentSum=num[i];
}
if(currentSum>maxSum){
maxSum=currentSum;
}
}
System.out.println("Maximum Sum: "+maxSum);
}
}


