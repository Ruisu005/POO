
package Calculadora;

/**
 * @author Luis Caamal
 */
public class calculadora {
    double suma, resta, multi, divi;
    double num1, num2;
        
    //Metodo Constructor

    public calculadora(double suma, double resta, double multi, double divi) {
        this.suma = suma;
        this.resta = resta;
        this.multi = multi;
        this.divi = divi;
    }

    public calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void mostrarsuma(double num1, double num2){
        suma=(num1+num2);
        System.out.println("-El resultado se la suma es: "+suma);
    }
    
    public void mostrarresta(double num1, double num2){
        resta=num1-num2;
        System.out.println("-El resultado se la resta es: "+resta);
    }
    
    public void mostrarmulti(double num1, double num2){
        multi=num1*num2;
        System.out.println("-El resultado se la Multiplicacion es: "+multi);
    }
    
    public void mostrardivi(double num1, double num2){
        divi=num1/num2;
        System.out.println("-El resultado se la division es: "+divi);
    }
    }
