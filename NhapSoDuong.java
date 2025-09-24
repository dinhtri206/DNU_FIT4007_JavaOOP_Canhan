import java.util.Scanner;

public class NhapSoDuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("N = " + n);
        sc.close();
    }
}
