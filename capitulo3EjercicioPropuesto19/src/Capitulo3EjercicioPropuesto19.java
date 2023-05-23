import javax.swing.*;

public class Capitulo3EjercicioPropuesto19 extends JFrame {
    private JTextField ladoField;
    private JTextArea resultadoArea;

    public Capitulo3EjercicioPropuesto19() {
        super("Cálculo de Triángulo Equilátero");

        JLabel ladoLabel = new JLabel("Lado:");
        ladoField = new JTextField(10);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(e -> calcularTrianguloEquilatero());

        resultadoArea = new JTextArea(5, 30);
        resultadoArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(ladoLabel);
        panel.add(ladoField);
        panel.add(calcularButton);
        panel.add(resultadoArea);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void calcularTrianguloEquilatero() {
        double lado = Double.parseDouble(ladoField.getText());

        double perimetro = lado * 3;
        double altura = (Math.sqrt(3) / 2) * lado;
        double area = (Math.sqrt(3) / 4) * lado * lado;

        String resultado = "Perímetro: " + perimetro + "\n"
                + "Altura: " + altura + "\n"
                + "Área: " + area;

        resultadoArea.setText(resultado);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Capitulo3EjercicioPropuesto19::new);
    }
}