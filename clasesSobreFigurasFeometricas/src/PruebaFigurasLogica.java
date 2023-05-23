import javax.swing.JOptionPane;

public class PruebaFigurasLogica {
    private PruebaFigurasGUI gui;

    public PruebaFigurasLogica(PruebaFigurasGUI gui) {
        this.gui = gui;
    }

    public void ejecutarPruebaFiguras() {
        int radio = gui.getRadio();
        int baseRectangulo = gui.getBaseRectangulo();
        int alturaRectangulo = gui.getAlturaRectangulo();
        int ladoCuadrado = gui.getLadoCuadrado();
        int baseTriangulo = gui.getBaseTriangulo();
        int alturaTriangulo = gui.getAlturaTriangulo();

        Circulo figura1 = new Circulo(radio);
        Rectangulo figura2 = new Rectangulo(baseRectangulo, alturaRectangulo);
        Cuadrado figura3 = new Cuadrado(ladoCuadrado);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);

        String mensaje = "Resultados:\n\n";

        mensaje += "Área del Círculo: " + figura1.calcularArea() + "\n";
        mensaje += "Perímetro del Círculo: " + figura1.calcularPerímetro() + "\n\n";

        mensaje += "Área del Rectángulo: " + figura2.calcularArea() + "\n";
        mensaje += "Perímetro del Rectángulo: " + figura2.calcularPerímetro() + "\n\n";

        mensaje += "Área del Cuadrado: " + figura3.calcularArea() + "\n";
        mensaje += "Perímetro del Cuadrado: " + figura3.calcularPerímetro() + "\n\n";

        mensaje += "Área del Triángulo: " + figura4.calcularArea() + "\n";
        mensaje += "Perímetro del Triángulo: " + figura4.calcularPerímetro() + "\n\n";

        mensaje += "Tipo de Triángulo: " + figura4.determinarTipoTriángulo() + "\n";

        JOptionPane.showMessageDialog(null, mensaje, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}