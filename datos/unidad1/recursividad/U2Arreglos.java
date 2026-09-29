package datos.unidad1.recursividad;

public class U2Arreglos {
    
    public static void main(String[] args) {

        int K = 7; // <-- INSERTA AQUÍ (Último dígito de tu matrícula + 1)
        int[] lecturas = {10, -5, 20, K * 2, -1, 30, 0, 15};

        // Error: El desarrollador intenta procesar el arreglo al revés pero se desploma
        // Justificacion: .length le devolvera la cantidad total de elementos pero el arreglo comienza a contarlos desde el cero y al buscar el elemento con indice 8 no lo encontrara 	porque el elemento 8 tiene indice 7 y no existe un elemento con indice 8.

        for (int i = lecturas.length - 1; i >= 0; i--) {
            if (lecturas[i] > 0) {
                System.out.println("Lectura positiva: " + lecturas[i]);
            }
        }

        // CÓDIGO A CORREGIR - FASE 2

        // Matriz de 3 filas con columnas de tamaño variable
        int[][] ventas = new int[3][];
        ventas[0] = new int[K]; // Vendedor 1
        ventas[1] = new int[K + 1]; // Vendedor 2
        ventas[2] = new int[2]; // Vendedor 3

        int sumaTotal = 0;

        // Error: Intentan llenar la matriz como si fuera rectangular (4x4)
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                ventas[i][j] = (i + 1) * (j + 1);
                // Tarea 2.2: Acumular la suma de todos los elementos
                sumaTotal += ventas[i][j]; 
            }
        }
        System.out.println("Suma total de la matriz irregular: " + sumaTotal);

        /*
        * ¿Cuál es la ventaja de memoria de un Jagged Array sobre una matriz tradicional de N x M cuando los datos de cada fila no sonhomogéneos?
        * R= La ventaja es que evita el desperdicio de memoria. Las filas reservan en la memoria únicamente la cantidad exacta de celdas que necesitan.
        */

        // CÓDIGO A CORREGIR - FASE 3
        int[][][] cubo = new int[2][K][K];
        
        // Inicialización rápida
        for(int i=0; i<2; i++) {
            for(int j=0; j<K; j++) {
                for(int k=0; k<K; k++) {
                    cubo[i][j][k] = i + j + k + 1;
                }
            }
        }

        System.out.println("Múltiplos de 3 encontrados usando for-each:");
        for (int[][] matriz2D : cubo) {
            for (int[] fila : matriz2D) {
                for (int valor : fila) {
                    if (valor % 3 == 0) {
                        System.out.println("Múltiplo encontrado con valor: " + valor);
                    }
                }
            }
        }

	/*
         * Tarea 3.3 (Análisis crítico - Limitación del for-each):
         * ¿Qué limitación tiene el bucle for-each en Java respecto a los arreglos tridimensionales si la tarea fuera modificar los valores dentro del arreglo en lugar de solo leerlos?
         * El bucle for-each es de "solo lectura". Si cambias el dato local dentro del bucle, el arreglo original no se modifica. 
         */

    }
}