

public class MetodoSeleccion {

    public void sort(int[] arreglo, boolean orden, boolean pasos) {
        if (orden) {
            sortAscendente(arreglo, pasos);
        } else {
            sortDescendente(arreglo, pasos);
        }
    }

    public void sortAscendente(int[] numeros, boolean pasos) {
        for (int i = 0; i < numeros.length; i++) {
            if (pasos){
                System.out.println("\nIteracion: " + (i + 1) + ", buscando el numero menor para la posicion " + i);
            }
            int indiceMenor = i;
            if (pasos){
                System.out.println("El menor es " + numeros[indiceMenor] + "(indice " + indiceMenor + ")");
            }
            for (int j = i + 1; j < numeros.length; j++) {
                if (pasos){
                    System.out.println("Compara " + numeros[j] + " (indice " + j + ") con " + numeros[indiceMenor] + "(menor actual)");
                }
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                    if (pasos){
                        System.out.println("Nuevo numero menor encontrado: " + numeros[indiceMenor] + ", en el indice " + indiceMenor);
                    }
                }
            }
            if (i != indiceMenor) {
                if (pasos){
                    System.out.println("Intercambiando " + numeros[i] + " (indice " + i + ") con " + numeros[indiceMenor] + " (indice " + indiceMenor + ")");
                }
                int aux = numeros[indiceMenor];
                numeros[indiceMenor] = numeros[i];
                numeros[i] = aux;
            } else {
                if (pasos) {
                    System.out.println("El numero ya esta en la posicion correcta, no se intercambia");
                }
                if (pasos) {
                    System.out.print("Estado actual del array: ");
                    printArray(numeros);
                }
            }
        }   
    }

    public void sortDescendente(int[] numeros, boolean pasos) {
        for (int i = 0; i < numeros.length; i++) {
            if (pasos){
                System.out.println("\nIteracion: " + (i + 1) + ", buscando el numero menor para la posicion " + i);
            }
            int indiceMenor = i;
            if (pasos){
                System.out.println("El menor es " + numeros[indiceMenor] + "(indice " + indiceMenor + ")");
            }
            for (int j = i + 1; j < numeros.length; j++) {
                if (pasos){
                    System.out.println("Compara " + numeros[j] + " (indice " + j + ") con " + numeros[indiceMenor] + "(menor actual)");
                }
                if (numeros[j] > numeros[indiceMenor]) {
                    indiceMenor = j;
                    if (pasos){
                        System.out.println("Nuevo numero menor encontrado: " + numeros[indiceMenor] + ", en el indice " + indiceMenor);
                    }
                }
            }
            if (i != indiceMenor) {
                if (pasos){
                    System.out.println("Intercambiando " + numeros[i] + " (indice " + i + ") con " + numeros[indiceMenor] + " (indice " + indiceMenor + ")");
                }
                int aux = numeros[indiceMenor];
                numeros[indiceMenor] = numeros[i];
                numeros[i] = aux;
            } else {
                if (pasos) {
                    System.out.println("El numero ya esta en la posicion correcta, no se intercambia");
                }
                if (pasos) {
                    System.out.print("Estado actual del array: ");
                    printArray(numeros);
                }
            }
        } 
    }

    public void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
