import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ScientificCalc extends JFrame implements ActionListener {

    private JTextField textField;
    private double firstNumber, secondNumber, result;
    private String operator;

    public ScientificCalc() {
        // Set up the JFrame
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        
        // Set up the container panel
        JPanel containerPanel = new JPanel(new BorderLayout());
        getContentPane().add(containerPanel);
        
        // Set up the text field
        textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setBorder(new LineBorder(Color.GREEN));
        textField.setFont(new Font("Arial", Font.PLAIN, 60));
        textField.setEditable(false);
        containerPanel.add(textField, BorderLayout.NORTH);

        // Set up the button panel
        JPanel buttonPanel = new JPanel(new GridLayout(4, 8, 5, 5));
        containerPanel.add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.setPreferredSize(new Dimension(400, 400));
        
        // Add the buttons to the button panel using array
        String[] buttonLabels = {"7", "8", "9", "+","Sin", "Cos", "Tan", "Cot",
                                  "4", "5", "6", "-","Log","Exp","Sqrt","Pow",
                                  "1", "2", "3", "*","sqr","^-1","mod","fact",
                                  "C", "0", "=", "/","sec","cosec"};
                                 
                                
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Algerian", Font.PLAIN, 16));    // to change button text format,size and font
            //button.setBackground(Color.DARK_GRAY);
            //button.setForeground(Color.white);
            button.addActionListener(this);

            buttonPanel.add(button);
        }

    }

    @Override  
    public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();
        if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = command;
            textField.setText("");
        } else if (command.equals("C")) {
            textField.setText("");
        } else if (command.equals("=")) {
            secondNumber = Double.parseDouble(textField.getText());
            if (operator.equals("+")) {
                result = firstNumber + secondNumber;
            } else if (operator.equals("-")) {
                result = firstNumber - secondNumber;
            } else if (operator.equals("*")) {
                result = firstNumber * secondNumber;
            } else if (operator.equals("/")) {
                result = firstNumber / secondNumber;
            }
            textField.setText(Double.toString(result));
        } else if (command.equals("Sin")) {
            double number = Double.parseDouble(textField.getText());
            double radians = Math.toRadians(number);
            result = Math.sin(radians);
            textField.setText(Double.toString(result));
        } else if (command.equals("Cos")) {
            double number = Double.parseDouble(textField.getText());
            double radians = Math.toRadians(number);
            result = Math.cos(radians);
            textField.setText(Double.toString(result));
        } else if (command.equals("Tan")) {
            double number = Double.parseDouble(textField.getText());
            double radians = Math.toRadians(number);
            result = Math.tan(radians);
            textField.setText(Double.toString(result));
        } else if (command.equals("Cot")) {
            double number = Double.parseDouble(textField.getText());
            double radians = Math.toRadians(number);
            result = 1.0 / Math.tan(radians);
            textField.setText(Double.toString(result));
        } else if (command.equals("Log")) {
        double number = Double.parseDouble(textField.getText());
        result = Math.log10(number);
        textField.setText(Double.toString(result));
    } else if (command.equals("Exp")) {
        double number = Double.parseDouble(textField.getText());
        result = Math.exp(number);
        textField.setText(Double.toString(result));
    } else if (command.equals("Sqrt")) {
        double number = Double.parseDouble(textField.getText());
        result = Math.sqrt(number);
        textField.setText(Double.toString(result));
    } else if (command.equals("Pow")) {
        double number = Double.parseDouble(textField.getText());
        result = Math.pow(number, 2);
        textField.setText(Double.toString(result));
    } else if (command.equals("sqr")) {
        double number = Double.parseDouble(textField.getText());
        result = Math.pow(number, 2);
        textField.setText(Double.toString(result));
    } else if (command.equals("^-1")) {
        double number = Double.parseDouble(textField.getText());
        result = 1.0 / number;
        textField.setText(Double.toString(result));
    } else if (command.equals("mod")) {
        double number = Double.parseDouble(textField.getText());
        result = Math.abs(number);
        textField.setText(Double.toString(result));
    } else if (command.equals("fact")) {
        int number = Integer.parseInt(textField.getText());
        result = factorial(number);
        textField.setText(Double.toString(result));
    } else if (command.equals("sec")) {
        double number = Double.parseDouble(textField.getText());
        double radians = Math.toRadians(number);
        result = 1.0 / Math.cos(radians);
        textField.setText(Double.toString(result));
    } else if (command.equals("cosec")) {
        double number = Double.parseDouble(textField.getText());
        double radians = Math.toRadians(number);
        result = 1.0 / Math.sin(radians);
        textField.setText(Double.toString(result));
    }else {
        String currentText = textField.getText();
        textField.setText(currentText + command);
    }
} 


// Method to calculate factorial
private double factorial(int n) {
    if (n == 0)
        return 1;
    else
        return n * factorial(n - 1);
}
        
    public static void main(String[] args) {
        ScientificCalc calculator = new ScientificCalc();
        calculator.setVisible(true);
    }
}
