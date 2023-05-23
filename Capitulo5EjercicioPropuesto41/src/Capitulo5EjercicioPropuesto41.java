import javax.swing.*;

/*
    Elaborar un algoritmo que encuentre el mayor valor entre un grupo de datos positivos
 */

public class Capitulo5EjercicioPropuesto41 extends JFrame {
    private JTextField numerosField;
    private JTextArea resultadoArea;

    public Capitulo5EjercicioPropuesto41() {
        super("Encontrar el Mayor Valor");

        JLabel numerosLabel = new JLabel("Números (separados por coma):");
        numerosField = new JTextField(20);

        JButton encontrarButton = new JButton("Encontrar");
        encontrarButton.addActionListener(e -> encontrarMayorValor());

        resultadoArea = new JTextArea(10, 30);
        resultadoArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(numerosLabel);
        panel.add(numerosField);
        panel.add(encontrarButton);
        panel.add(resultadoArea);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void encontrarMayorValor() {
        String numerosText = numerosField.getText();
        String[] numerosArray = numerosText.split(",");
        int mayor = Integer.MIN_VALUE;

        for (String numero : numerosArray) {
            try {
                int num = Integer.parseInt(numero.trim());
                if (num > mayor) {
                    mayor = num;
                }
            } catch (NumberFormatException e) {
                // Ignorar números no válidos
            }
        }

        String resultado = "El mayor valor es: " + mayor;
        resultadoArea.setText(resultado);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Capitulo5EjercicioPropuesto41::new);
    }
}