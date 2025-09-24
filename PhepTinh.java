import java.util.Scanner;

public class PhepTinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        System.out.print("Nhập phép tính (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Lỗi: không thể chia cho 0.");
                } else {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Lỗi: không thể chia lấy dư cho 0.");
                } else {
                    System.out.println(a + " % " + b + " = " + (a % b));
                }
                break;
            default:
                System.out.println("Lỗi: phép tính không hợp lệ.");
        }

        sc.close();
    }
}
