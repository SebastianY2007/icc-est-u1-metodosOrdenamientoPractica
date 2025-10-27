public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();

        int[] numeros = new int[] {1, 3, -2, 9, 3};

        while (true) {
            view.ShowMenu();
            
            int opcion = view.inputOption(4);
            
            view.showOrderMenu();

            int orden = view.inputOption(2);
            boolean ordenOpt = orden == 1; 

            view.showPasosMenu();

            int pasos = view.inputOption(2);
            boolean pasosOpt = pasos == 1; 

            switch (opcion) {
                case 1:
                    System.out.println("\tMetodo Selección");

                    MetodoSeleccion metodoSeleccion = new MetodoSeleccion();
                    metodoSeleccion.sort(numeros, ordenOpt, pasosOpt);

                    view.printArray(numeros);
                    break;

                case 2:
                    System.out.println("\tMetodo Inserción");

                    MetodoInsercion metodoInsercion = new MetodoInsercion();
                    metodoInsercion.sort(numeros, ordenOpt, pasosOpt);
                    
                    view.printArray(numeros);
                    break;

                case 3:
                    System.out.println("\tMetodo Burbuja");
                    break;

                case 4:
                    System.out.println("\tAdiós");
                    System.exit(4);
                    break;

                default:
                    break;
            }
        }
    }
}
