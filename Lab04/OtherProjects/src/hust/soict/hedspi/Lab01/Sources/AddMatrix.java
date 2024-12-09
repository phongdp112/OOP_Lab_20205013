import javax.swing.JOptionPane;

public class AddMatrix {

    public static void main(String[] args) {
        int rows, cols;

        String[] options = {"Nhập ma trận", "Dùng ma trận cố định"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "Bạn muốn nhập ma trận hay dùng ma trận cố định?",
                "Lựa chọn phương thức",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );

        if (choice == 0) {
            String inputRows = JOptionPane.showInputDialog("Nhập số hàng của ma trận:");
            String inputCols = JOptionPane.showInputDialog("Nhập số cột của ma trận:");
            rows = Integer.parseInt(inputRows);
            cols = Integer.parseInt(inputCols);
        } else {
            rows = 3;
            cols = 3;
            JOptionPane.showMessageDialog(null, "Sử dụng ma trận cố định kích thước 3x3.");
        }

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];

        if (choice == 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    String elementA = JOptionPane.showInputDialog("Nhập phần tử A[" + i + "][" + j + "]:");
                    matrixA[i][j] = Integer.parseInt(elementA);
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    String elementB = JOptionPane.showInputDialog("Nhập phần tử B[" + i + "][" + j + "]:");
                    matrixB[i][j] = Integer.parseInt(elementB);
                }
            }
        } else {
            matrixA = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            matrixB = new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
            JOptionPane.showMessageDialog(null, "Ma trận A: \n" + matrixToString(matrixA) +
                    "\n\nMa trận B: \n" + matrixToString(matrixB));
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        String result = "Ma trận A:\n" + matrixToString(matrixA) +
                "Ma trận B:\n" + matrixToString(matrixB) +
                "Kết quả của phép cộng ma trận A và B:\n" + matrixToString(resultMatrix);        JOptionPane.showMessageDialog(null, result);
    }

    public static String matrixToString(int[][] matrix) {
        String result = "";
        for (int[] row : matrix) {
            for (int element : row) {
                result += element + " ";
            }
            result += "\n";
        }
        return result;
    }
}