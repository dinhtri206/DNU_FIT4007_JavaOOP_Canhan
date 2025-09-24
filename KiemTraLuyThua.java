import java.util.Scanner;

public class KiemTraLuyThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean check = n > 0 && (n & (n - 1)) == 0;
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
