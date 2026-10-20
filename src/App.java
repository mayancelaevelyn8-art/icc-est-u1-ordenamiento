public class App {
    
    public static void main(String[] args) throws Exception {
        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();

        // usar el metodo del archivo(clase) Bubble
        // instaciar el archivo Bubble
        // instanciar la clase Bubble
        Bubble bubble = new Bubble();
        //Ejecutar codigo al archivo burbuja bubble uso la instancia
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        // instanciar la clase Selection
        System.out.println("--- Selection Sort ---");
        System.out.println("Original: ");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        System.out.println("Ordenado Asc: ");
        printArreglo(c);
    }
    public static void printArreglo(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " - ");
        System.out.println();
        }
}
