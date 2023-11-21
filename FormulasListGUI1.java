import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FormulasListGUI1 extends JFrame {
    private JButton btnDifferentiation;
    private JButton btnTrigonometry;
    private JButton btnMensuration;
    private JButton btnLogarithms;
    private JButton btnIntegration;
   
    public FormulasListGUI1() {
        initializeComponents();
        setLayout(new GridLayout(5, 1)); // Adjusted layout

        add(btnDifferentiation);
        add(btnTrigonometry);
        add(btnMensuration);
        add(btnLogarithms);
        add(btnIntegration);
        

        setTitle("Math Operations");
        setSize(300, 400); // Adjusted size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeComponents() {
        btnDifferentiation = new JButton("Differentiation");
        btnTrigonometry = new JButton("Trigonometry");
        btnMensuration = new JButton("Mensuration");
        btnLogarithms = new JButton("Logarithms");
        btnIntegration = new JButton("Integration");
       
        btnDifferentiation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<String> formulas = new ArrayList<>();
                formulas.add("Separable differential equation: dy/dx = f(x)g(y)");
                formulas.add("Homogeneous differential equation: dy/dx = f(y/x)");
                formulas.add("Exact differential equation: M(x,y)dx + N(x,y)dy = 0");
                formulas.add("Linear differential equation: dy/dx + P(x)y = Q(x)");
                formulas.add("Bernoulli differential equation: dy/dx + P(x)y = Q(x)y^n");
                formulas.add("Riccati differential equation: dy/dx = f(x)y^2 + g(x)y + h(x)");
                showFormulas("Differentiation", formulas);
            }
        });

        btnTrigonometry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<String> formulas = new ArrayList<>();
                formulas.add("1) Pythagorean identity:");
                formulas.add("sin^2(θ) + cos^2(θ) = 1");
                formulas.add("tan^2(θ) + 1 = sec^2(θ)");
                formulas.add("1 + cot^2(θ) = csc^2(θ)");
                formulas.add("2) Co-function identities:");
                formulas.add("sin(π/2 - θ) = cos(θ)");
                formulas.add("cos(π/2 - θ) = sin(θ)");
                formulas.add("tan(π/2 - θ) = cot(θ)");
                formulas.add("cot(π/2 - θ) = tan(θ)");
                formulas.add("3) Angle sum and difference identities:");
                formulas.add("sin(A + B) = sin(A)cos(B) + cos(A)sin(B)");
                formulas.add("cos(A + B) = cos(A)cos(B) - sin(A)sin(B)");
                formulas.add("tan(A + B) = (tan(A) + tan(B)) / (1 - tan(A)tan(B))");
                formulas.add("4) Double angle identities:");
                formulas.add("sin(2θ) = 2sin(θ)cos(θ)");
                formulas.add("cos(2θ) = cos^2(θ) - sin^2(θ) = 2cos^2(θ) - 1 = 1 - 2sin^2(θ)");
                formulas.add("tan(2θ) = (2tan(θ)) / (1 - tan^2(θ))");
                formulas.add("5) Half-angle identities:");
                formulas.add("sin(θ/2) = ±sqrt((1 - cos(θ)) / 2)");
                formulas.add("cos(θ/2) = ±sqrt((1 + cos(θ)) / 2)");
                formulas.add("tan(θ/2) = ±sqrt((1 - cos(θ)) / (1 + cos(θ)))");
                showFormulas("Trigonometry", formulas);
            }
        });

        btnMensuration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<String> formulas = new ArrayList<>();
                formulas.add("Area of a rectangle: length x width");
                formulas.add("Perimeter of a rectangle: 2 x (length + width)");
                formulas.add("Area of a square: side x side");
                formulas.add("Area of a triangle: (base x height) / 2");
                formulas.add("Perimeter of a triangle: side1 + side2 + side3");
                formulas.add("Area of a circle: π x (radius x radius");
                formulas.add("Circumference of a circle: 2 x π x radius");
                formulas.add("Volume of a cube: side x side x side");
                formulas.add("Surface area of a cube: 6 x (side x side)");
                formulas.add("Volume of a cylinder: π x (radius x radius) x height");
                formulas.add("Surface area of a cylinder: 2 x π x radius x (radius + height)");
                showFormulas("Mensuration", formulas);
            }
        });

        btnLogarithms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<String> formulas = new ArrayList<>();
                formulas.add("log(a * b) = log(a) + log(b)");
                formulas.add("log(a / b) = log(a) - log(b)");
                formulas.add("log(a^b) = b * log(a)");
                formulas.add("log_a(b) = log_c(b) / log_c(a)");
                formulas.add("a^log_a(b) = b");
                formulas.add("log(a) = 0");
                formulas.add("log_a(a) = 1");
                formulas.add("log_a(1 / b) = -log_a(b)");
                formulas.add("log_a(√b) = (1/2) * log_a(b)");
                formulas.add("ln(b) = log_e(b)");
                showFormulas("Logarithms", formulas);
            }
        });

        btnIntegration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<String> formulas = new ArrayList<>();
                formulas.add("Indefinite integral: ∫ f(x) dx + C");
                formulas.add("Definite integral: ∫<sub>a</sub><sup>b</sup> f(x) dx = F(b) - F(a)");
                formulas.add("Integration by substitution: ∫ f(g(x))g'(x) dx = ∫ f(u) du");
                formulas.add("Integration by parts: ∫ u dv = uv - ∫ v du");
                formulas.add("Trigonometric integrals: ∫ sin(x) dx = -cos(x) + C, ∫ cos(x) dx = sin(x) + C");
                formulas.add("Integration of rational functions: ∫ (P(x)/Q(x)) dx");
                formulas.add("Improper integrals: ∫<sub>a</sub><sup>∞</sup> f(x) dx = lim<sub>b→∞</sub> ∫<sub>a</sub><sup>b</sup> f(x) dx");
        
                showFormulas("Integration", formulas);
            }
        });

    }

    private void showFormulas(String category, List<String> formulas) {
        StringBuilder message = new StringBuilder();//Creating a String Builder object to change the Formulas  
        message.append("Category: ").append(category).append("\n\n");// Appending the Formulas
        for (String formula : formulas) {
            message.append(formula).append("\n");
        }//Using for each loop to append one by one; 
        JOptionPane.showMessageDialog(this, message.toString(), "Formulas", JOptionPane.PLAIN_MESSAGE);//To Show the Formulas.
    }

    public static void main(String[] args) {
        new FormulasListGUI1();
    }
}

//ActionListener -- cursor response
//ActionEvent  -- to respond to action listener