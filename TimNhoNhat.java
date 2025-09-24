import java.util.Scanner;

public class TimNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = 0, sum = 0;
        while (sum + n + 1 <= s) {
            n++;
            sum += n;
        }
        System.out.println(n);
        sc.close();
    }
}
