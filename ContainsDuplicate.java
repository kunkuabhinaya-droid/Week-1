import java.util.Scanner;
public class ContainsDuplicate {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Array size: ");
int n=sc.nextInt();
int[] num=new int[n];
System.out.println("Enter Array Elements: ");
for(int i=0;i<n;i++) {
num[i]=sc.nextInt();
}
for(int i=0;i<n;i++) {
for(int j=i+1; j<n; j++) {
if(num[i]==num[j]) {
System.out.println("TRUE");
return;
}
}
}
System.out.println("FALSE");
sc.close();
}
}



