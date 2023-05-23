import javax.swing.*;

/*
    Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
    elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación.
*/

public class capitulo4EjercicioPropuesto23 extends JFrame {
    private JTextField aField;
    private JTextField bField;
    private JTextField cField;
    private JTextArea resultadoArea;

    public capitulo4EjercicioPropuesto23() {
        super("Cálculo de Ecuación de Segundo Grado");

        JLabel aLabel = new JLabel("A:");
        aField = new JTextField(10);

        JLabel bLabel = new JLabel("B:");
        bField = new JTextField(10);

        JLabel cLabel = new JLabel("C:");
        cField = new JTextField(10);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(e -> calcularSoluciones());

        resultadoArea = new JTextArea(5, 30);
        resultadoArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(cLabel);
        panel.add(cField);
        panel.add(calcularButton);
        panel.add(resultadoArea);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void calcularSoluciones() {
        double a = Double.parseDouble(aField.getText());
        double b = Double.parseDouble(bField.getText());
        double c = Double.parseDouble(cField.getText());

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            String resultado = "Las soluciones son:\n"
                    + "x1 = " + x1 + "\n"
                    + "x2 = " + x2;
            resultadoArea.setText(resultado);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            String resultado = "La solución es:\n"
                    + "x = " + x;
            resultadoArea.setText(resultado);
        } else {
            String resultado = "No existen soluciones reales";
            resultadoArea.setText(resultado);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(capitulo4EjercicioPropuesto23::new);
    }
}
