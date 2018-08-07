
package lista;

import java.util.Scanner;

public class Lista {


    public static void main(String[] args) {
               
        Scanner scan = new Scanner(System.in);    
        int numeroElementos;
        int posicion; 
        
        try {
   
        System.out.println("Ingrese el numero de elementos para el arreglo de numeros");
        numeroElementos = Integer.parseInt(scan.nextLine());   
        int list [] = new int [numeroElementos];
        for (int i = 0; i < numeroElementos; i++) {
        System.out.println("Ingrese el numero en la posicion "+ i);
        int numero = Integer.parseInt(scan.nextLine()); 
        list [i]=numero;
        }
        
        System.out.println("\nIngrese la posicion del numero que desee visualizar ");
        posicion = Integer.parseInt(scan.nextLine()); 
      
        System.out.println("El numero en la posicion "+posicion+" es: "+list [posicion]);
        
        }catch (NumberFormatException e1){
            System.out.println("Error: Ha ingresado una letra en lugar de un numero");
        }catch (NegativeArraySizeException e2){
            System.out.println("Error: Ha ingresado un numero negativo en el tamaño del arreglo de numeros");
        }catch (ArrayIndexOutOfBoundsException e3){
            System.out.println("Error: la posicion ingresada no existe");
        }
    }
    
}
