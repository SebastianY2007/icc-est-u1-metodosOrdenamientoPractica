public class MetodoBurbujaMejorado {

public void sort(int[] arreglo, boolean orden, boolean pasos) {
        if (orden) {
            sortAscendente(arreglo, pasos);
        } else {
            sortDescendente(arreglo, pasos);
        }
    }

    public void sortAscendente(int[] arreglo, boolean pasos) {
        for (int i = 0; i < arreglo.length - 1; i++) {

            if (pasos) {
                System.out.println("Iteración " + (i + 1) + ", elementos restantes: " + (arreglo.length - 1));
                System.out.println("El elemento más grande se movera a la posición " + (arreglo.length - 1 - i));
            }
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                
                if (pasos) {
                    System.out.print("Compara " + arreglo[j] + " (índice " + j + ") con " + arreglo[j + 1] + " (índice " + j + ")");
                } 
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                    if (pasos)  {
                        System.out.println(" -> Intercambia, nuevo orden: [" + arreglo[j] + ", " + arreglo[j + 1] + "]");
                    }
                } else {
                    if (pasos) {
                        System.out.println(" -> Está en orden, por lo tanto no se intercambia");
                    }
                }
            } if (pasos) {
                System.out.print("Estado al final de la pasada " + (i + 1) + ": ");
                printArray(arreglo);
            }
        }
    }

    public void sortDescendente(int[] arreglo, boolean pasos) {
        for (int i = 0; i < arreglo.length - 1; i++) {

            if (pasos) {
                System.out.println("Iteración " + (i + 1) + ", elementos restantes: " + (arreglo.length - 1));
                System.out.println("El elemento más grande se movera a la posición " + (arreglo.length - 1 - i));
            }
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                
                if (pasos) {
                    System.out.print("Compara " + arreglo[j] + " (índice " + j + ") con " + arreglo[j + 1] + " (índice " + j + ")");
                } 
                if (arreglo[j] < arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                    if (pasos)  {
                        System.out.println(" -> Intercambia, nuevo orden: [" + arreglo[j] + ", " + arreglo[j + 1] + "]");
                    }
                } else {
                    if (pasos) {
                        System.out.println(" -> Está en orden, por lo tanto no se intercambia");
                    }
                }
            } if (pasos) {
                System.out.print("Estado al final de la pasada " + (i + 1) + ": ");
                printArray(arreglo);
            }
        }
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
