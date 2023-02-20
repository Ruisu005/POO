
package Veterinaria;

import java.util.Scanner;

/**
 * @author Luis Caamal
 */
public class ClasePrincipal {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("-En que lo puedo ayudar? "
                + "\n-1. Consultar"
                + "\n-2. Comprar"
                + "\n-3. Salir");
        int opcion=entrada.nextInt();
        
        if (opcion==1){
            System.out.println("\n-Cual es el nombre de su perro? ");
            String nom=entrada.next();
            System.out.println("-Cual es la Raza de "+nom);
            String raz=entrada.next();
            System.out.println("-Que edad tiene "+nom);
            int ed=entrada.nextInt();
            System.out.println("-Cual es el genero de "+nom);
            String gen=entrada.next();
            System.out.println("-Cual es el peso de "+nom);
            double pes=entrada.nextDouble();
            veterinaria vete1=new veterinaria(nom, raz, ed, gen, pes);
            vete1.mostrarconsulta(nom, raz, ed, gen, pes);
        }
        else
            if(opcion==2){
                System.out.println("\n-Que desea comprar? "
                        + "\n-1. Shampoo"
                        + "\n-2. Jabon"
                        + "\n-3. Desparasitante");
                int prod=entrada.nextInt();
                
                if (prod==1){
                    System.out.println("\n-Cualtos desea comprar? ");
                    int cant=entrada.nextInt();
                    veterinaria shampoo=new veterinaria(cant, cant, cant, cant);
                    shampoo.mostrarshampoo(cant, cant);
                }
                else
                    if(prod==2){
                        System.out.println("\n-Cauntos desea comprar? ");
                        int cant=entrada.nextInt();
                        veterinaria jabon=new veterinaria(cant, cant, cant, cant);
                        jabon.mostrarjabon(cant, cant);
                    }
                else
                        if (prod==3){
                            System.out.println("\n-Cauntos desea comprar? ");
                            int cant=entrada.nextInt();
                            veterinaria desparasitante=new veterinaria(cant, cant, cant, cant);
                            desparasitante.mostrardespa(cant, cant);
                        }
            }
        else
                if (opcion==3){
                    System.exit(0);
                }
    }
}
