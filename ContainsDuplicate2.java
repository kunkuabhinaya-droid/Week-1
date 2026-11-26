import java.util.Scanner;
public class ContainsDuplicate2 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Array size: ");
int n=sc.nextInt();
int[] num=new int[n];
System.out.println("Enter Array Elements: ");
for(int i=0;i<n;i++) {
num[i]=sc.nextInt();
}
System.out.println("Enter k: ");
int k=sc.nextInt();
int found=0;
for(int i=0;i<n;i++) {
for(int j=i+1; j<n; j++) {
if(num[i]==num[j]&&(j-i)<=k) {
found=1;
}
}
}
if(found==1)
System.out.println("TRUE");
else
System.out.println("FALSE");
}
}




