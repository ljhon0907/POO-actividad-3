public class TrianguloRectangulo {
    int base;
    int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base * altura / 2;
    }

    double calcularPerímetro() {
        return base + altura + calcularHipotenusa();
    }

    double calcularHipotenusa() {
        return Math.pow(base, 2) + Math.pow(altura, 2);
    }

    String determinarTipoTriángulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
                == calcularHipotenusa()))
            return "Es un triángulo equilátero";
        else if ((base != altura) && (base != calcularHipotenusa()) &&
                (altura != calcularHipotenusa()))
            return "Es un triángulo escaleno";
        else
            return "Es un triángulo isósceles";
    }
}