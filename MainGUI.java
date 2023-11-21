// The packages which we imported used for creating GUI in java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// This class extends JFrame it is using the the JFrame class
// This JFrame is class for creating the basic functional window 
public class MainGUI extends JFrame {

// These are the instances of three different classes which we used to connect the different GUI codes to this panel or window 
    private FormulasListGUI1 FormulasListGUI1;
    private MyCalc myCalc;
    private ScientificCalc scientificCalc;

// This is the MainGUI() constructor
    public MainGUI() {

// These are several methods which are used for designing the panel like it's size,height,width etc 
        setTitle("Main GUI");
//  It determines what should happen when the user closes the frame's window.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
// This is used to position a JFrame or window at the center of the screen
        setLocationRelativeTo(null);

// Create a panel to hold the buttons
        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
// This is used to set a empty border around the panel and createEmptyBorder is used for create an  empty border with specified padding or margins  
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
// Where JFrame contains content panel which we used to add the components by this we are the content panel to add the panel components to the JFrame  
        getContentPane().add(panel);

// Create the "Formulas List" button
        JButton btnFormulasList = new JButton("Formulas List");
        btnFormulasList.setFont(new Font("Arial", Font.BOLD, 18));
        btnFormulasList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (FormulasListGUI1 == null) {
                    FormulasListGUI1 = new FormulasListGUI1();
                } else {
                    FormulasListGUI1.setVisible(true);
                }
            }
        });
        panel.add(btnFormulasList);

        // Create the "Basic Calculator" button
        JButton btnBasicCalculator = new JButton("Basic Calculator");
        btnBasicCalculator.setFont(new Font("Arial", Font.BOLD, 18));
        btnBasicCalculator.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (myCalc == null) {
                    myCalc = new MyCalc();
                } else {
                    myCalc.setVisible(true);
                }
            }
        });
        panel.add(btnBasicCalculator);

        // Create the "Scientific Calculator" button
        JButton btnScientificCalculator = new JButton("Scientific Calculator");
        btnScientificCalculator.setFont(new Font("Arial", Font.BOLD, 18));
        btnScientificCalculator.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (scientificCalc == null) {
                    scientificCalc = new ScientificCalc();
                } else {
                    scientificCalc.setVisible(true);
                }
            }
        });
        panel.add(btnScientificCalculator);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainGUI mainGUI = new MainGUI();
                mainGUI.setVisible(true);
            }
        });
    }
}