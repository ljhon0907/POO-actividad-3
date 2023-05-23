import javax.swing.*;

/*
    Se tiene la siguiente información de un empleado:
    · código del empleado,
    · nombres,
    · número de horas trabajadas al mes,
    · valor hora trabajada,
    · porcentaje de retención en la fuente.
    Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.
 */




public class capitulo3EjercicioPropuesto18 extends JFrame {
    private JTextField codigoField;
    private JTextField nombresField;
    private JTextField horasTrabajadasField;
    private JTextField valorHoraField;
    private JTextField retencionField;
    private JTextArea resultadoArea;

    public capitulo3EjercicioPropuesto18() {
        super("Cálculo de Salario");

        JLabel codigoLabel = new JLabel("Código:");
        codigoField = new JTextField(10);

        JLabel nombresLabel = new JLabel("Nombres:");
        nombresField = new JTextField(10);

        JLabel horasTrabajadasLabel = new JLabel("Horas trabajadas:");
        horasTrabajadasField = new JTextField(10);

        JLabel valorHoraLabel = new JLabel("Valor hora:");
        valorHoraField = new JTextField(10);

        JLabel retencionLabel = new JLabel("Retención (%):");
        retencionField = new JTextField(10);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(e -> calcularSalario());

        resultadoArea = new JTextArea(5, 30);
        resultadoArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(codigoLabel);
        panel.add(codigoField);
        panel.add(nombresLabel);
        panel.add(nombresField);
        panel.add(horasTrabajadasLabel);
        panel.add(horasTrabajadasField);
        panel.add(valorHoraLabel);
        panel.add(valorHoraField);
        panel.add(retencionLabel);
        panel.add(retencionField);
        panel.add(calcularButton);
        panel.add(resultadoArea);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void calcularSalario() {
        String codigo = codigoField.getText();
        String nombres = nombresField.getText();
        int horasTrabajadas = Integer.parseInt(horasTrabajadasField.getText());
        double valorHora = Double.parseDouble(valorHoraField.getText());
        double retencion = Double.parseDouble(retencionField.getText());

        double salarioBruto = horasTrabajadas * valorHora;
        double retencionFuentes = salarioBruto * (retencion / 100);
        double salarioNeto = salarioBruto - retencionFuentes;

        String resultado = "Código: " + codigo + "\n"
                + "Nombres: " + nombres + "\n"
                + "Salario Bruto: " + salarioBruto + "\n"
                + "Salario Neto: " + salarioNeto;

        resultadoArea.setText(resultado);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(capitulo3EjercicioPropuesto18::new);
    }
}