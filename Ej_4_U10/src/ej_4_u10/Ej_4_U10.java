

package ej_4_u10;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ej_4_U10 {

    /**
     * @param args the command line arguments
     * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
     */
    public static void main(String[] args) {
     Scanner leer= new Scanner (System.in);
     
     int numero_random = (int)(Math.random()*500);
     System.out.println("SHH!- Trampita:"+numero_random);
     
     boolean input_error=true;   
     int numero_usuario,intentos=0;
     
        do {
        try {
            System.out.print("\nIngrese el número a adivinar: ");
           numero_usuario=leer.nextInt();
           //numero_usuario=Integer.parseInt(leer.nextLine());
            if (numero_random == numero_usuario) {
                System.out.println("\nHAS ACERTADO EL NÚMERO!");
                input_error=false;
                intentos+=1;
            }
            else{
                System.out.println("\nEl número introducido es "+((numero_usuario>numero_random)? "MAYOR al número a adivinar." : "MENOR al número a adivinar"));
                intentos+=1;
            }
            
            
        } catch(InputMismatchException e){
            System.out.println("No se ingresó un número. Por favor, ingrese un número (Input Mismatch Exception)");
             input_error=true;
            intentos+=1;
            //Para usar con numero_usuario=leer.nextInt(); y que no se forme un bucle infinito
            //String d=leer.next();
            leer.nextLine();
        }
        catch (NumberFormatException e) {
            System.out.println("No se ingresó un número. Por favor, ingrese un número (Number Format Exception)");
            input_error=true;
            intentos+=1;
        }
        } while (input_error==true);
        
        System.out.println("Intentos para adivinar del usuario: "+ intentos);
        
      
       
       
     
     
    }

}
