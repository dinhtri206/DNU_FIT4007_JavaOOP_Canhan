import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N ít nhất 2 chữ số: ");
        int n = sc.nextInt();

        if (Math.abs(n) < 10) {
            System.out.println("Số phải có ít nhất 2 chữ số!");
        } else {
            int secondLastDigit = Math.abs((n / 10) % 10);
            System.out.println("Chữ số gần cuối của " + n + " là: " + secondLastDigit);
        }
    }
}
