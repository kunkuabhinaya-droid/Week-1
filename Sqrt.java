import java.util.Scanner;
public class Sqrt {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int x=sc.nextInt();
int i=0;
while(i*i<=x) {
i++;
}
System.out.println("Square root of x: "+(i-1));
}
} 