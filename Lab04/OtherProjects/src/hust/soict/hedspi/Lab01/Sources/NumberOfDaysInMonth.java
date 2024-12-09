import java.util.Scanner;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0, year = -1;
        int[] daysInCommonYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysInLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (year < 0) {
            System.out.print("Vui lòng nhập năm (năm không âm): ");
            year = scanner.nextInt();
            if (year < 0) {
                System.out.println("Năm không được âm. Vui lòng nhập lại.");
            }
        }
        while (month < 1 || month > 12) {
            System.out.print("Vui lòng nhập tháng (số từ 1 đến 12): ");
            month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
            }
        }
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int daysOfMonth = isLeapYear ? daysInLeapYear[month - 1] : daysInCommonYear[month - 1];
        System.out.println("Số ngày trong tháng " + month + " của năm " + year + " là: " + daysOfMonth);
        scanner.close();
    }
}
