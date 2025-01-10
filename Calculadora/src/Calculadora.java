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
        System.out.println("--------   Resta (1)  ----------");
        System.out.println("------  Multiplicación (2)  ----");
        System.out.println("-------   División (3)  --------");
        System.out.println("------  Raiz Cuadrada (4)  -----");
        System.out.println("--------------------------------");
        System.out.println();
        
        do {
            inc = false;
            try {
                System.out.print("Introduzca una opción: ");
                respuesta = tecInt.nextInt();

                switch (respuesta) {
                    case 0:
                        break;

                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    default:
                        System.out.println("La opción introducida no se encuentra en el menú.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida. Por favor, introduzca un número dentro del rango.");
                tecInt.next();
                inc = true;
            }
        } while (respuesta >= 0 && respuesta <= 4 && inc);
    }
}