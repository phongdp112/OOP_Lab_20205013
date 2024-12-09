import javax.swing.JOptionPane;

public class CalculateTwoNumbers{
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, 
            "Please input the first number: ", "Input the first number", 
            JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null, 
            "Please input the second number: ", "Input the second number", 
            JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        strNotification += strNum2;

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String quotient;

        if (num2 != 0) {
            quotient = String.valueOf(num1 / num2);
        } else {
            quotient = "undefined (division by zero)";
        }

        String result = "Sum: " + sum + "\n" +
                        "Difference: " + difference + "\n" +
                        "Product: " + product + "\n" +
                        "Quotient: " + quotient;

        JOptionPane.showMessageDialog(null, strNotification + "\n" + result, 
            "Calculation Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
