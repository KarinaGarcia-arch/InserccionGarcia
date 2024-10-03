import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int tamaño ;
        System.out.println("De que tamaño desea el arreglo");
        tamaño= leer.nextInt();
        int[]arreglo = new int[tamaño];

        for(int i=0;i<tamaño;i++){
            System.out.println("Ingrese el numero en la posicion "+(i+1));
            arreglo[i]= leer.nextInt();
        }

        System.out.println("Desea ordenar con pasos ");
        System.out.println("1)SI");
        System.out.println("2)NO");
    }
}
