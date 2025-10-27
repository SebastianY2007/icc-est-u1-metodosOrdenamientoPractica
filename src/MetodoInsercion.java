public class MetodoInsercion {

    public void sort(int[] arreglo, boolean orden, boolean pasos) {
        if (orden) {
            sortAscendente(arreglo, pasos);
        } else {
            sortDescendente(arreglo, pasos);
        }
    }

    public void sortAscendente(int[] numeros, boolean pasos) {
        for (int i = 1; i < numeros.length; i++) {
            int j = i - 1;
            int aux = numeros[i];
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while (j >= 0 && numeros[j] > aux) {
                if (pasos)
                System.out.println("Compara aux: " + aux + " con numeros [" + j + "]: " + numeros[j]);
                    numeros[j + 1] = numeros[j];
                if (pasos) 
                    printArray(numeros);
                j--;
                if (pasos) 
                    System.out.println("Mueve numeros [" + (j + 1) + "] a numeros [" + (j + 2) + "]");
            }
            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j + 1));
                System.out.print("Estado actual");
                printArray(numeros);
            }
        }
    }

    public void sortDescendente(int[] numeros, boolean pasos) {
        for (int i = 1; i < numeros.length; i++) {
            int j = i - 1;
            int aux = numeros[i];
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while (j >= 0 && numeros[j] < aux) {
                if (pasos)
                System.out.println("Compara aux: " + aux + " con numeros [" + j + "]: " + numeros[j]);
                    numeros[j + 1] = numeros[j];
                if (pasos) 
                    printArray(numeros);
                j--;
                if (pasos) 
                    System.out.println("Mueve numeros [" + (j + 1) + "] a numeros [" + (j + 2) + "]");
            }
            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j + 1));
                System.out.print("Estado actual");
                printArray(numeros);
            }
        }
    }

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
