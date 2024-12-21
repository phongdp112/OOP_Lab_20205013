import javax.swing.JOptionPane;

public class GiaiPhuongTrinh {

    public static void solveLinearEquation() {
        String strA = JOptionPane.showInputDialog(null, "Please input a (a ≠ 0):", "Input", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "a must not be 0!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String strB = JOptionPane.showInputDialog(null, "Please input b:", "Input", JOptionPane.INFORMATION_MESSAGE);
            double b = Double.parseDouble(strB);
            double solution = -b / a;
            JOptionPane.showMessageDialog(null, "Solution: x = " + solution, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void solveLinearSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input a11:", "Input", JOptionPane.INFORMATION_MESSAGE));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input a12:", "Input", JOptionPane.INFORMATION_MESSAGE));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input b1:", "Input", JOptionPane.INFORMATION_MESSAGE));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input a21:", "Input", JOptionPane.INFORMATION_MESSAGE));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input a22:", "Input", JOptionPane.INFORMATION_MESSAGE));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input b2:", "Input", JOptionPane.INFORMATION_MESSAGE));

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "Solution: x1 = " + x1 + ", x2 = " + x2, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void solveQuadraticEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input a (a != 0):", "Input", JOptionPane.INFORMATION_MESSAGE));
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "a must not be 0!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input b:", "Input", JOptionPane.INFORMATION_MESSAGE));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input c:", "Input", JOptionPane.INFORMATION_MESSAGE));

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "The equation has two distinct roots: x1 = " + x1 + ", x2 = " + x2, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "The equation has a double root: x = " + x, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The equation has no real root.", "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        String[] options = {"Linear Equation", "Linear System", "Quadratic Equation"};
        int choice = JOptionPane.showOptionDialog(null, "Choose the type of equation to solve", "Equation Solver", 
                                                  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (choice == 0) {
            solveLinearEquation();
        } else if (choice == 1) {
            solveLinearSystem();
        } else if (choice == 2) {
            solveQuadraticEquation();
        } 

        System.exit(0);
    }
}
