

package ej_1_u10;

import Entidad.Persona;


public class Ej_1_U10 {

    /**
     * @param args the command line arguments
     * EJ-7-POO
     */
    public static void main(String[] args) {
      Persona[] vector = new Persona[4];
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        // Persona p1=new Persona();
        //p1.crearPersona();
        Persona pers=null;
        
        try {
            pers.esMayorEdad();
        } catch (NullPointerException e) {
          
           // System.out.println(""+ e.getMessage());
           System.out.println("Error: "+e.fillInStackTrace());
        }
       /* for (int i = 0; i < 4; i++) {
           Persona p=new Persona();
           System.out.println(" ");
           p.crearPersona();
           System.out.println("\nCalculo de IMC \n");
            switch (p.calcularIMC()) {
                case 0:
                    System.out.println("Persona con peso ideal\n");
                    c1++;
                    break;
                case 1:
                    System.out.println("Persona con sobrepeso\n");
                    c2++;
                    break;
                case -1:
                    System.out.println("Persona debajo de su peso ideal\n");
                    c3++;
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("CALCULO DE EDAD ");
           if(p.esMayorEdad()!=true) {
               System.out.println("La persona es menor de edad\n");
               c4++;
           } else {
               System.out.println("La persona es mayor a 18\n");
               c5++;
            }
           vector[i]=p;
         }
        System.out.println("PORCENTAJES");
        System.out.println("Personas por debajo de su peso ideal: "+((c3*100)/4)+"%");
        System.out.println("Personas con sobrepeso: "+((c2*100)/4)+"%");
        System.out.println("Personas con su peso ideal: "+((c1*100)/4)+"%");
        System.out.println("Personas mayores a 18: "+((c5*100)/4)+"%");
        System.out.println("Personas menores de edad: "+((c4*100)/4)+"%");*/
    }
    
 }


