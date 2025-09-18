    import java.util.Scanner;


    public class Bai5{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Nhập tuổi của sinh viên tính đến năm 2023: ");
            if (!sc.hasNextInt()){
                System.out.println("Giá trị nhập không phải số nguyên, kết thúc chương trình ");
                return;
            }
            int age = sc.nextInt();
            if (age < 0) {
                System.out.println("Tuổi không được âm ");
                return;
            }
            if (age > 30) {
                System.out.println("Tuổi không hợp lý. Vui lòng kiểm tra lại.");
                return;
            }
            int birthYear = 2023 - age;
            System.out.println("Năm sinh là: " + birthYear);
        }
    }
