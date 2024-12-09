import javax.swing.JOptionPane;
import java.util.Arrays;

public class ArrayNumber {

    public static void main(String[] args) {
        double[] array;

        String[] options = {"Nhập mảng", "Dùng mảng cố định"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "Bạn muốn nhập mảng hay dùng mảng cố định?",
                "Lựa chọn phương thức",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );

        if (choice == 0) {
            String inputSize = JOptionPane.showInputDialog("Nhập số lượng phần tử của mảng:");
            int size = Integer.parseInt(inputSize);
            array = new double[size];

            for (int i = 0; i < size; i++) {
                String element = JOptionPane.showInputDialog("Nhập phần tử thứ " + (i + 1) + ":");
                array[i] = Double.parseDouble(element);
            }
        } else {
            array = new double[]{5.5, 3.3, 8.8, 1.1, 2.2, 7.7, 4.4, 6.6};
            JOptionPane.showMessageDialog(null, "Sử dụng mảng cố định: " + Arrays.toString(array));
        }

        Arrays.sort(array);

        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        double average = sum / array.length;

        String result = "Mảng sau khi sắp xếp: " + Arrays.toString(array) + "\n" +
                "Tổng các phần tử trong mảng: " + sum + "\n" +
                "Giá trị trung bình của các phần tử trong mảng: " + average;

        JOptionPane.showMessageDialog(null, result);
    }
}
