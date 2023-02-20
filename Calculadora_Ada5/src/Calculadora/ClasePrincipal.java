
package Calculadora;
import java.util.Scanner;

/**
 * @author Luis Caamal
 */
public class ClasePrincipal {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("-Que Operacion desea realizar? "
                + "\n-1. Suma"
                + "\n-2. Resta"
                + "\n-3. Multiplicion"
                + "\n-4. Division");
                double opcion=entrada.nextDouble();
                
                if (opcion==1){
                System.out.println("-Dame un Numero: ");
                double numero1=entrada.nextDouble();
                System.out.println("-Dame otro Numero: ");
                double numero2=entrada.nextDouble();
                calculadora cal1=new calculadora(numero1, numero2);
                cal1.mostrarsuma(numero1, numero2);
            }
                else
                    if(opcion==2){
                        System.out.println("-Dame un Numero: ");
                        double numero1=entrada.nextDouble();
                        System.out.println("-Dame otro Numero: ");
                        double numero2=entrada.nextDouble();
                        calculadora cal2=new calculadora(numero1, numero2);
                        cal2.mostrarresta(numero1, numero2);
                    }
                    else
                        if(opcion==3){
                            System.out.println("-Dame un Numero: ");
                            double numero1=entrada.nextDouble();
                            System.out.println("-Dame otro Numero: ");
                            double numero2=entrada.nextDouble();
                            calculadora cal3=new calculadora(numero1, numero2);
                            cal3.mostrarmulti(numero1, numero2);
                        }
                    else
                            if(opcion==4){
                                System.out.println("-Dame un Numero: ");
                                double numero1=entrada.nextDouble();
                                System.out.println("-Dame otro Numero: ");
                                double numero2=entrada.nextDouble();
                                calculadora cal4=new calculadora(numero1, numero2);
                                cal4.mostrardivi(numero1, numero2);
                            }
            }
        }
