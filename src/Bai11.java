import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        // Hoán đổi dùng biến trung gian
        int c = a;
        a = b;
        b = c;

        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);
    }
}
