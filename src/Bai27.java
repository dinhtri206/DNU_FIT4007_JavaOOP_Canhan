import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập giờ và phút
        System.out.print("Nhập giờ (0 <= h < 24): ");
        int h = sc.nextInt();

        System.out.print("Nhập phút (0 <= m < 60): ");
        int m = sc.nextInt();

        // In thời gian hiện tại
        System.out.printf("Thời gian hiện tại: %02d:%02d\n", h, m);

        // Tăng thêm 1 phút
        m++;
        if (m == 60) {   // nếu phút thành 60 thì tăng giờ
            m = 0;
            h++;
            if (h == 24) { // nếu giờ thành 24 thì quay về 0
                h = 0;
            }
        }

        // In thời gian sau 1 phút
        System.out.printf("Thời gian sau 1 phút nữa: %02d:%02d\n", h, m);

        sc.close();
    }
}
