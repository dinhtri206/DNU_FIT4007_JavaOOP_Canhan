import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên N: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " không phải là số chẵn (tức là số lẻ).");
        }

        sc.close();
    }
}
