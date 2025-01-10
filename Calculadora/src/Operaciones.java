public class Operaciones {
    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("La división por cero no está permitida.");
        }
        return a / b;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double a) {
        if (a < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(a);
    }
}