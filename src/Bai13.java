import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên N: ");

        if (!sc.hasNextLong()) { // kiểm tra có phải số nguyên (dùng long để rộng hơn)
            String bad = sc.next();
            System.out.println("'" + bad + "' không phải là một số nguyên.");
            sc.close();
            return;
        }

        long n = sc.nextLong();
        if (n >= 0) {
            System.out.println(n + " là một số tự nhiên.");
        } else {
            System.out.println(n + " không phải là một số tự nhiên.");
        }
        sc.close();
    }
}
