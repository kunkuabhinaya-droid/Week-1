import java.util.Scanner;
class MaximumSum918 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Array Size: ");
int n = sc.nextInt();
int[] nums = new int[n];
System.out.println("Enter Array Elements: ");
for (int i = 0; i < n; i++) {
nums[i] = sc.nextInt();
}
int max = nums[0];
for (int i = 0; i < n; i++) {
int sum = 0;
for (int j = 0; j < n; j++) {
int index = (i + j) % n;
sum = sum + nums[index];
if (sum > max) {
max = sum;
}
}
}

System.out.println("Maximum Sum: "+max);
    }
}