import java.util.Scanner;

public class View {

    // Variable blobal privada para el scanner
    private final Scanner scanner;

    public View() {
        System.out.println("Metodos Ordenamiento");
        scanner = new Scanner(System.in); 
    }

    public void ShowMenu() {
        System.out.println("\n--- Seleccione el Método --- ");
        System.out.println("1 -> Selection");
        System.out.println("2 -> Insertion");
        System.out.println("3 -> Bubble");
        System.out.println("4 -> Salir");
        System.err.print("Selecciona una opción: ");
    }

    public int inputOption(int max) {
        int option = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                // Si ingreso un numero
                option = scanner.nextInt();
                if (option >= 1 && option <= max) 
                    break;
            } else {
                scanner.next();
            }
            System.out.print("Opción invalida, ingrese otra vez: ");
        }
        return option;
    }

    public void showOrderMenu() {
        System.out.println("\n--- Seleccione el orden ---");
        System.out.println("1 -> Ascendente");
        System.out.println("2 -> Descendente");
        System.out.print("Seleccione una opción: ");
    }

    public void showPasosMenu() {
        System.out.println("\n--- ¿Quiere ver los pasos? ---");
        System.out.println("1 -> Si");
        System.out.println("2 -> No");
        System.out.print("Seleccione una opción: ");
    }

    public void printArray(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1)
            System.out.print(", ");
        }
        System.out.print("]");
    }
}
