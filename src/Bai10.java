import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một ký tự thường từ 'a' đến 'y': ");
        char ch = sc.next().charAt(0);

        if (ch < 'a' || ch > 'y') {
            System.out.println("Ký tự phải nằm trong khoảng từ 'a' đến 'y'.");
        } else {
            char nextChar = (char) (ch + 1);
            System.out.println("Ký tự liền sau là: " + nextChar);
        }
    }
}
