import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();

        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();

        System.out.print("Nhập cạnh c: ");
        int c = sc.nextInt();

        // Kiểm tra điều kiện: các cạnh phải dương và thỏa mãn bất đẳng thức tam giác
        if (a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a) {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " có thể là độ dài 3 cạnh của một tam giác.");
        } else {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " KHÔNG thể là độ dài 3 cạnh của một tam giác.");
        }

        sc.close();
    }
}
