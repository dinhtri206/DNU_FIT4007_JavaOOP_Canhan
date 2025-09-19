import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một ký tự: ");
        char ch = sc.next().charAt(0); // lấy ký tự đầu tiên người dùng nhập

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("'" + ch + "' là chữ cái in thường.");
        } else {
            System.out.println("'" + ch + "' không phải là chữ cái in thường.");
        }

        sc.close();
    }
}
