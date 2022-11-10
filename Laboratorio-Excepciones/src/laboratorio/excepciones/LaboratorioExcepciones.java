
package laboratorio.excepciones;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DANIEL BARRANTES
 */
public class LaboratorioExcepciones {


    public static void main(String[] args) {
        ejer_1_y_2();
        ejer3();
        ejer4();
        ejer5 ();
}   

//excepción sin tratar 
      
public static void ejer_1_y_2(){

    int numero;   
    String cadena="  1"; //error es que el string tiene espacios
    
    try{   
        numero = Integer.parseInt(cadena); // en la primera parte del ejercicio el numero se convertia directamente sin utilizar un Try Catch  
    }catch(NumberFormatException ex){   
        System.out.println("No es un número, es una cadena de texto."+ex.getMessage());//con el Try catch se evalua la conversion del dato y si se genera error se envia un mensaje al usuario    
        }   
    }


public static void ejer3(){
    // ejercicio 3
        int v[]= new int[3];
        try { 
		    for(int i =0; i<5;i++){
		        v[i]=i;               // en este lugar mediante el for se esta dando una posisicion no existente dentro del arreglo 
            
            } 
        }catch (Exception e) {
            for (int j = 0; j < v.length; j++) {
               v[j]=j;                              // con este for manejamos el arreglo hasta la cantidad de posiciones que tiene para poderlo imprimir correctamente
            }
            System.out.println(Arrays.toString(v));
        }
    }

public static void ejer4(){
    int numero=5, resultado;
        try {
            resultado= numero/0;
        } catch (Exception e) {
            System.out.println("el divisor no puede ser cero");
        }
}

public static void ejer5 (){
    Scanner datos= new Scanner(System.in);
           
        try {
            System.out.println("Ingrese el numerador:");
            int a = datos.nextInt();
            System.out.println("Ingrese el denominador");
            int b = datos.nextInt();
            int aux;
            aux= a/b;
            System.out.println("el resultado es" + aux);
        } catch (Exception e) {
            System.out.println("El denominador tiene que ser un numero y a la vez que sea diferente de cero");
        } 
    }
}

    

