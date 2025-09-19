import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên dương b: ");
        int b = sc.nextInt();

        System.out.print("Nhập số nguyên dương c: ");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Cả ba số phải là số nguyên dương.");
        } else {
            if (a % b == 0 && b % c == 0) {
                System.out.println("b đồng thời là ước của a và là bội của c.");
            } else {
                System.out.println("b KHÔNG đồng thời là ước của a và bội của c.");
            }
        }

        sc.close();
    }
}
