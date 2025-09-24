import java.util.Scanner;

public class Huong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ký tự hướng (N, S, W, E): ");
        char c = sc.next().toUpperCase().charAt(0);

        switch (c) {
            case 'N':
                System.out.println("Hướng Bắc");
                break;
            case 'S':
                System.out.println("Hướng Nam");
                break;
            case 'W':
                System.out.println("Hướng Đông");
                break;
            case 'E':
                System.out.println("Hướng Tây");
                break;
            default:
                System.out.println("Lỗi: vui lòng nhập một trong các ký tự N, S, W, E.");
        }

        sc.close();
    }
}
