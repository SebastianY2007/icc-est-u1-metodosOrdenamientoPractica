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
            int indiceMenor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor) {
                int aux = numeros[indiceMenor];
                numeros[indiceMenor] = numeros[i];
                numeros[i] = aux;
            }
        }   
    }

    public void sortDescendente(int[] numeros, boolean pasos) {
        for (int i = 0; i < numeros.length; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] > numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor) {
                int aux = numeros[indiceMenor];
                numeros[indiceMenor] = numeros[i];
                numeros[i] = aux;
            }
        }
    }

}
