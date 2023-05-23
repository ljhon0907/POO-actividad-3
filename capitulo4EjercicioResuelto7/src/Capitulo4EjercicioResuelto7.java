import javax.swing.*;

public class Capitulo4EjercicioResuelto7 extends JFrame {
    private JTextField aField;
    private JTextField bField;
    private JTextArea resultadoArea;

    public Capitulo4EjercicioResuelto7() {
        super("Comparación de Números");

        JLabel aLabel = new JLabel("A:");
        aField = new JTextField(10);

        JLabel bLabel = new JLabel("B:");
        bField = new JTextField(10);

        JButton compararButton = new JButton("Comparar");
        compararButton.addActionListener(e -> compararNumeros());

        resultadoArea = new JTextArea(5, 30);
        resultadoArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(compararButton);
        panel.add(resultadoArea);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void compararNumeros() {
        double a = Double.parseDouble(aField.getText());
        double b = Double.parseDouble(bField.getText());

        String resultado;
        if (a > b) {
            resultado = "A es mayor que B";
        } else if (a < b) {
            resultado = "A es menor que B";
        } else {
            resultado = "A es igual a B";
        }

        resultadoArea.setText(resultado);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Capitulo4EjercicioResuelto7::new);
    }
}