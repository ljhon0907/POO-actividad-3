import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaFigurasGUI extends JFrame {
    private JTextField radioField;
    private JTextField baseRectanguloField;
    private JTextField alturaRectanguloField;
    private JTextField ladoCuadradoField;
    private JTextField baseTrianguloField;
    private JTextField alturaTrianguloField;
    private JButton calcularButton;

    public PruebaFigurasGUI() {
        initializeGUI();
    }

    private void initializeGUI() {
        setTitle("Prueba de Figuras");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(7, 2, 10, 10));

        JLabel radioLabel = new JLabel("Radio:");
        radioField = new JTextField();
        JLabel baseRectanguloLabel = new JLabel("Base del Rectángulo:");
        baseRectanguloField = new JTextField();
        JLabel alturaRectanguloLabel = new JLabel("Altura del Rectángulo:");
        alturaRectanguloField = new JTextField();
        JLabel ladoCuadradoLabel = new JLabel("Lado del Cuadrado:");
        ladoCuadradoField = new JTextField();
        JLabel baseTrianguloLabel = new JLabel("Base del Triángulo:");
        baseTrianguloField = new JTextField();
        JLabel alturaTrianguloLabel = new JLabel("Altura del Triángulo:");
        alturaTrianguloField = new JTextField();

        mainPanel.add(radioLabel);
        mainPanel.add(radioField);
        mainPanel.add(baseRectanguloLabel);
        mainPanel.add(baseRectanguloField);
        mainPanel.add(alturaRectanguloLabel);
        mainPanel.add(alturaRectanguloField);
        mainPanel.add(ladoCuadradoLabel);
        mainPanel.add(ladoCuadradoField);
        mainPanel.add(baseTrianguloLabel);
        mainPanel.add(baseTrianguloField);
        mainPanel.add(alturaTrianguloLabel);
        mainPanel.add(alturaTrianguloField);

        calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PruebaFigurasLogica logica = new PruebaFigurasLogica(PruebaFigurasGUI.this);
                logica.ejecutarPruebaFiguras();
            }
        });

        mainPanel.add(calcularButton);

        setContentPane(mainPanel);
        setVisible(true);
    }

    public Integer getRadio() {
        return Integer.parseInt(radioField.getText());
    }

    public Integer getBaseRectangulo() {
        return Integer.parseInt(baseRectanguloField.getText());
    }

    public Integer getAlturaRectangulo() {
        return Integer.parseInt(alturaRectanguloField.getText());
    }

    public Integer getLadoCuadrado() {
        return Integer.parseInt(ladoCuadradoField.getText());
    }

    public Integer getBaseTriangulo() {
        return Integer.parseInt(baseTrianguloField.getText());
    }

    public Integer getAlturaTriangulo() {
        return Integer.parseInt(alturaTrianguloField.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PruebaFigurasGUI();
        });
    }
}