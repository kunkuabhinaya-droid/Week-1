import java.util.Scanner;
class FirstMissingPositive41 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Array Size: ");
int n = sc.nextInt();
int[] nums = new int[n];
System.out.println("Enter Array Elements: ");
for (int i = 0; i < n; i++) {
nums[i] = sc.nextInt();
}
for (int i = 1; i <= n + 1; i++) {
int count = 0;
for (int j = 0; j < n; j++) {
if (nums[j] == i) {
count++;
}
}
if (count == 0) {
System.out.println("First Missing Positive: "+i);
break;
            }
        }
    }
}