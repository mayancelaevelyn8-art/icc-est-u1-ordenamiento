public class Selection {
    public void sort(int[] arreglo) {
        int cambios = 0;
        int comparaciones = 0;
        for(int i = 0; i < arreglo.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                if (arreglo[j] < arreglo[min]) {
                    min = j;

                }
            }
            if (min != i) {
                System.out.println("Pasada= " + i + "| cambio: " + arreglo[i] + "<->" + arreglo[min]);
                int tem = arreglo[min];
                arreglo[min] = arreglo[i];  
                arreglo[i] = tem;
                cambios ++;
            }
        }
        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
    }
}