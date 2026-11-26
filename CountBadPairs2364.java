import java.util.Scanner;
class CountBadPairs2364 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Array Size: ");
int n = sc.nextInt();
int[] nums = new int[n];
System.out.println("Enter Array Elements: ");
for (int i = 0; i < n; i++) {
nums[i] = sc.nextInt();
}
 int count = 0;
for (int i = 0; i < n; i++) {
for (int j = i + 1; j < n; j++) {
if (j - i != nums[j] - nums[i]) {
count++;
}
}
}
System.out.println("Count of Bad Pairs: "+count);
    }
}