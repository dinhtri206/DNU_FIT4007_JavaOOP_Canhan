import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int n = sc.nextInt();

        int lastDigit = Math.abs(n % 10);  // Lấy trị tuyệt đối để tránh số âm
        System.out.println("Chữ số cuối cùng của " + n + " là: " + lastDigit);
    }
}
