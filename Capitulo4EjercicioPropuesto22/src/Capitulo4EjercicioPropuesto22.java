
import javax.swing.*;

/*
        Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
        número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
        de $450.000, de lo contrario escriba sólo el nombre.
*/

public class Capitulo4EjercicioPropuesto22 extends JFrame {
    private JTextField nombreField;
    private JTextField salarioBasicoField;
    private JTextField horasTrabajadasField;
    private JTextArea resultadoArea;

    public Capitulo4EjercicioPropuesto22() {
        super("Cálculo de Salario Mensual");

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField(10);

        JLabel salarioBasicoLabel = new JLabel("Salario básico por hora:");
        salarioBasicoField = new JTextField(10);

        JLabel horasTrabajadasLabel = new JLabel("Horas trabajadas en el mes:");
        horasTrabajadasField = new JTextField(10);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(e -> calcularSalarioMensual());

        resultadoArea = new JTextArea(5, 30);
        resultadoArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(salarioBasicoLabel);
        panel.add(salarioBasicoField);
        panel.add(horasTrabajadasLabel);
        panel.add(horasTrabajadasField);
        panel.add(calcularButton);
        panel.add(resultadoArea);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void calcularSalarioMensual() {
        String nombre = nombreField.getText();
        double salarioBasico = Double.parseDouble(salarioBasicoField.getText());
        int horasTrabajadas = Integer.parseInt(horasTrabajadasField.getText());

        double salarioMensual = salarioBasico * horasTrabajadas;

        String resultado;
        if (salarioMensual > 450000) {
            resultado = "Nombre: " + nombre + "\n" + "Salario Mensual: $" + salarioMensual;
        } else {
            resultado = "Nombre: " + nombre;
        }

        resultadoArea.setText(resultado);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Capitulo4EjercicioPropuesto22::new);
    }
}