import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyCalc extends JFrame implements ActionListener {
 
    
    private JTextField textField;
    private double firstNumber, secondNumber, result;
    private String operator;

    public MyCalc() {
        
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setResizable(false);
        
        JPanel containerPanel = new JPanel(new BorderLayout());
        getContentPane().add(containerPanel);
        
        
        textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setFont(new Font("Arial", Font.PLAIN, 30));
        textField.setEditable(false);
        containerPanel.add(textField, BorderLayout.NORTH);

        
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        containerPanel.add(buttonPanel, BorderLayout.CENTER);
        
        
        String[] buttonLabels = {"7", "8", "9", "+",
                                 "4", "5", "6", "-",
                                 "1", "2", "3", "*",
                                 "C", "0", "=", "/"};
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(this);
            buttonPanel.add(button);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = command;
            textField.setText("");
        } else if (command.equals("C")) {
            textField.setText(";");
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
        } else {
            String currentText = textField.getText();
            textField.setText(currentText + command);
        }
    }

    public static void main(String[] args) {
        MyCalc calculator = new MyCalc();
        calculator.setVisible(true);
    }
}
