import java.util.Scanner;
public class MissingNumber {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Array size: ");
int n=sc.nextInt();
int[] num=new int[n];
System.out.println("Enter Array Elements: ");
for(int i=0;i<n;i++) {
num[i]=sc.nextInt();
}
int sum=n*(n+1)/2;
int actualSum=0;
for(int i=0;i<n;i++) {
actualSum=actualSum+num[i];
}
System.out.println("Missing Number: "+(sum-actualSum));
}
}


