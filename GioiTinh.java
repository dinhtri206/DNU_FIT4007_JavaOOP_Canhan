import java.util.Scanner;

public class GioiTinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giới tính (0: Nam, 1: Nữ, 2: Khác): ");
        int gender = sc.nextInt();

        switch (gender) {
            case 0:
                System.out.println("Giới tính: Nam");
                break;
            case 1:
                System.out.println("Giới tính: Nữ");
                break;
            case 2:
                System.out.println("Giới tính: Khác");
                break;
            default:
                System.out.println("Lỗi: vui lòng nhập số 0, 1 hoặc 2.");
        }

        sc.close();
    }
}
