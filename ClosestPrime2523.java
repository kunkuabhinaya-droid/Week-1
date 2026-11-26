import java.util.Scanner;
class ClosestPrime2523 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Left Number: ");
int left = sc.nextInt();
System.out.println("Enter Right Number: ");
int right = sc.nextInt();
int a = -1, b = -1, prev = -1, min = 100;
for (int i = left; i <= right; i++) {
int c = 0;
for (int j = 1; j < i; j++) {
if (i % j == 0)
c++;
}
if (c == 1) {
if (prev != -1 && i - prev < min) {
min = i - prev;
a = prev;
b = i;
}
prev = i;
}
}
System.out.println("[" + a + "," + b + "]");
    }
}