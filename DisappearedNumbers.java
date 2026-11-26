import java.util.Scanner;
class DisappearedNumbers {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Array size: ");
int n = sc.nextInt();
int[] nums = new int[n];
int[] result = new int[n];
System.out.println("Enter the Array Elements: ");
for (int i = 0; i < n; i++) {
nums[i] = sc.nextInt();
}
int k = 0;
for (int i = 1; i <= n; i++) {
int count = 0;
for (int j = 0; j < n; j++) {
if (nums[j] == i) {
count++;
}
}
if (count == 0) {
result[k] = i;
k++;
}
}
for (int i = 0; i < k; i++) {
System.out.print(result[i] + " ");
        }
    }
}