import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();   // nhập chuỗi (bao gồm cả khoảng trắng)

        int length = name.length();    // lấy độ dài chuỗi
        System.out.println("Độ dài tên của bạn là: " + length);
    }
}
