import java.util.Scanner;
class MajorityElement229 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter array size:");
int n = sc.nextInt();
int[] nums = new int[n];
System.out.println("Enter array elements:");
for (int i = 0; i < n; i++) {
nums[i] = sc.nextInt();
}
int[] result = new int[2];
int k = 0;
for (int i = 0; i < n; i++) {
int count = 0;
int duplicate = 0;
for (int j = 0; j < i; j++) {
if (nums[i] == nums[j]) {
duplicate++;
}
}
if (duplicate == 0) {
for (int j = 0; j < n; j++) {
if (nums[i] == nums[j]) {
count++;
}
}
if (count > n / 3) {
result[k] = nums[i];
k++;
}
}
}
System.out.println("Majority elements are:");
for (int i = 0; i < k; i++) {
System.out.print(result[i] + " ");
        }
sc.close();
    }
}
