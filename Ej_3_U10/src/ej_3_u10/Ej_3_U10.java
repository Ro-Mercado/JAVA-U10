

package ej_3_u10;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ej_3_U10 {

    /**
     * @param args the command line arguments
     * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese dos números: ");
        String cadenaNumero=leer.next();
        String cadenaNumero2=leer.next();
        try {
            int numero1= Integer.parseInt(cadenaNumero);
            int numero2= Integer.parseInt(cadenaNumero2);
            int division=numero1/numero2;
            System.out.println("Resultado de la división: "+division);
        } catch (InputMismatchException e) {
            System.out.println("Excepción Mismatch");
        }catch (NumberFormatException e1){
            System.out.println("Excepción Number Format.\n"+ e1.getMessage());
        }catch (ArithmeticException e2){
            System.out.println("Excepción Aritmética.\n"+e2.getMessage());
        }
        
    }

}
