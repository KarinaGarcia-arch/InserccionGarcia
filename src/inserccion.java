public class inserccion {
    public void inserccionMetodo(int[] arreglo, boolean pasos) {
       
        if(pasos==true ){
            for (int i = 1; i < arreglo.length; i++) {
                int clave = arreglo[i];  
                int j = i - 1;
    
                System.out.println("Insertando " + clave + " en la posición correcta.");
                while (j >= 0 && arreglo[j] > clave) {
                    System.out.println("Moviendo " + arreglo[j] + " a la posición " + (j + 1));
                    arreglo[j + 1] = arreglo[j];
                    j--;
                }
                arreglo[j + 1] = clave;
                System.out.println("Posicion cambiada" + clave + ": " + java.util.Arrays.toString(arreglo));
            
            }
            System.out.println("Arreglo ordenado " + java.util.Arrays.toString(arreglo));

        }else{
            for (int i = 1; i < arreglo.length; i++) {
                int clave = arreglo[i];  
                int j = i - 1;
                while (j >= 0 && arreglo[j] > clave) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                }
                arreglo[j + 1] = clave;
                
            }
            System.out.println("Arreglo ordenado " + java.util.Arrays.toString(arreglo));
            
        }

        
    }
}
