
import javax.swing.*;
        import java.util.ArrayList;
        import java.util.List;

/*
    Encontrar la raíz cuadrada, el cuadrado y el cubo de un grupo de números enteros
    positivos.
*/

public class Capitulo5EjercicioPropuesto40 extends JFrame {
    private JTextField numerosField;
    private JTextArea resultadoArea;

    public Capitulo5EjercicioPropuesto40() {
        super("Operaciones con Números");

        JLabel numerosLabel = new JLabel("Números (separados por coma):");
        numerosField = new JTextField(20);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(e -> realizarOperaciones());

        resultadoArea = new JTextArea(10, 30);
        resultadoArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(numerosLabel);
        panel.add(numerosField);
        panel.add(calcularButton);
        panel.add(resultadoArea);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void realizarOperaciones() {
        String numerosText = numerosField.getText();
        String[] numerosArray = numerosText.split(",");
        List<Integer> numeros = new ArrayList<>();

        for (String numero : numerosArray) {
            try {
                int num = Integer.parseInt(numero.trim());
                numeros.add(num);
            } catch (NumberFormatException e) {
                // Ignorar números no válidos
            }
        }

        StringBuilder resultadoBuilder = new StringBuilder();

        for (int num : numeros) {
            resultadoBuilder.append("Número: ").append(num).append("\n");
            resultadoBuilder.append("Raíz cuadrada: ").append(Math.sqrt(num)).append("\n");
            resultadoBuilder.append("Cuadrado: ").append(num * num).append("\n");
            resultadoBuilder.append("Cubo: ").append(num * num * num).append("\n");
            resultadoBuilder.append("\n");
        }

        resultadoArea.setText(resultadoBuilder.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Capitulo5EjercicioPropuesto40::new);
    }
}