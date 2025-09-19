import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
        } else {
            // Tính căn bậc 2
            double can = Math.sqrt(n);

            // Ép về số nguyên để so sánh
            int phanNguyen = (int) can;

            if (can == phanNguyen) {
                System.out.println(n + " là số chính phương.");
            } else {
                System.out.println(n + " không phải là số chính phương.");
            }
        }

        sc.close();
    }
}
