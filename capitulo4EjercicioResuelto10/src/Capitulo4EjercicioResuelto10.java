
import javax.swing.*;

    /*
    Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
    siguientes datos:
    • Número de inscripción
    • Nombres
    • Patrimonio.
    • Estrato social.
    La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
    es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
    sobre el patrimonio. Hacer un algoritmo que muestre:
    • Número de inscripción.
    • Nombres.
    • Pago de matrícula.
     */

public class Capitulo4EjercicioResuelto10 extends JFrame {
    private JTextField inscripcionField;
    private JTextField nombresField;
    private JTextField patrimonioField;
    private JTextField estratoField;
    private JTextArea resultadoArea;

    public Capitulo4EjercicioResuelto10() {
        super("Cálculo de Pago de Matrícula");

        JLabel inscripcionLabel = new JLabel("Número de inscripción:");
        inscripcionField = new JTextField(10);

        JLabel nombresLabel = new JLabel("Nombres:");
        nombresField = new JTextField(10);

        JLabel patrimonioLabel = new JLabel("Patrimonio:");
        patrimonioField = new JTextField(10);

        JLabel estratoLabel = new JLabel("Estrato social:");
        estratoField = new JTextField(10);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(e -> calcularPagoMatricula());

        resultadoArea = new JTextArea(5, 30);
        resultadoArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(inscripcionLabel);
        panel.add(inscripcionField);
        panel.add(nombresLabel);
        panel.add(nombresField);
        panel.add(patrimonioLabel);
        panel.add(patrimonioField);
        panel.add(estratoLabel);
        panel.add(estratoField);
        panel.add(calcularButton);
        panel.add(resultadoArea);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void calcularPagoMatricula() {
        String inscripcion = inscripcionField.getText();
        String nombres = nombresField.getText();
        double patrimonio = Double.parseDouble(patrimonioField.getText());
        int estrato = Integer.parseInt(estratoField.getText());

        double matricula = 50000.0;

        if (patrimonio > 2000000 && estrato > 3) {
            double incremento = patrimonio * 0.03;
            matricula += incremento;
        }

        String resultado = "Número de inscripción: " + inscripcion + "\n"
                + "Nombres: " + nombres + "\n"
                + "Pago de matrícula: $" + matricula;

        resultadoArea.setText(resultado);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Capitulo4EjercicioResuelto10::new);
    }
}