import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner tecInt = new Scanner(System.in);
        int respuesta = -1;
        boolean inc;

        System.out.println("--------------------------------");
        System.out.println("---------    MENU    -----------");
        System.out.println("--------------------------------");
        System.out.println("---------   Suma (0)   ---------");
        System.out.println("---------  Resta (1)   ---------");
        System.out.println("------  Multiplicación (2)  ----");
        System.out.println("-------   División (3)  --------");
        System.out.println("-------   Potencia (4)  --------");
        System.out.println("------  Raiz Cuadrada (5)  -----");
        System.out.println("--------------------------------");
        System.out.println();

        Operaciones op = new Operaciones();
        double numero1 = 0, numero2 = 0, resultado = 0;

        do {
            inc = false;
            try {
                System.out.print("Introduzca una opción: ");
                respuesta = tecInt.nextInt();

                if (respuesta == 5) {
                    System.out.println("Introduzca el número: ");
                    numero1 = tecInt.nextInt();
                    resultado = op.raizCuadrada(numero1);
                } else if (respuesta >= 0 && respuesta <= 4) {
                    System.out.println("Introduzca el primer número: ");
                    numero1 = tecInt.nextInt();

                    System.out.println("Introduzca el segundo número: ");
                    numero2 = tecInt.nextInt();

                    switch (respuesta) {
                        case 0:
                            resultado = op.suma(numero1, numero2);
                            break;
                        case 1:
                            resultado = op.resta(numero1, numero2);
                            break;
                        case 2:
                            resultado = op.multiplicacion(numero1, numero2);
                            break;
                        case 3:
                            resultado = op.division(numero1, numero2);
                            break;
                        case 4:
                            resultado = op.potencia(numero1, numero2);
                            break;
                    }

                } else {
                    System.out.println("La opción introducida no se encuentra en el menú.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida. Por favor, introduzca un número válido.");
                tecInt.next();
                inc = true;
            }
        } while (respuesta >= 0 && respuesta <= 5 && inc);
        System.out.println("Resultado: "+resultado);

    }
}
