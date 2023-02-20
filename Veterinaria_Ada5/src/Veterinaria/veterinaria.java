
package Veterinaria;

/**
 * @author Luis Caamal
 */
public class veterinaria {
    String nombre;
    String raza;
    int edad;
    String genero;
    double peso;
    int cantidad;
    double shampoo; //$72
    double jabon; //%127
    double desparasitante; //$94

    public veterinaria(String nombre, String raza, int edad, String genero, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
    }

    public veterinaria(int cantidad, double shampoo, double jabon, double desparasitante) {
        this.cantidad = cantidad;
        this.shampoo = shampoo;
        this.jabon = jabon;
        this.desparasitante = desparasitante;
    }
    
    public void mostrarconsulta(String nombre, String raza, int edad, String genero, double peso){
        System.out.println("\n--Su consulta se ha registrado con los siguientes datos--");
        System.out.println("-El nombre del Perro es "+nombre);
        System.out.println("-La Raza de "+nombre+" es "+raza);
        System.out.println("-La Edad de "+nombre+" es de "+edad+" años");
        System.out.println("-El genero de "+nombre+" es "+genero);
        System.out.println("-El peso de "+nombre+" es de "+peso+" Kg"
                + "\n");
    }
    
    public void mostrarshampoo(int cantidad, double shampoo){
        shampoo=cantidad*72;
        System.out.println("\n-El precio a pagar del Shampoo es de "+shampoo+"\n");
    }
    
    public void mostrarjabon(int cantidad, double jabon){
        jabon=cantidad*127;
        System.out.println("\n-El precio a pagar del Jabon es de "+jabon+"\n");
    }
    
    public void mostrardespa(int cantidad, double desparasitante){
        desparasitante=cantidad*94;
        System.out.println("\n-El precio a pagar por el desparasitante es de "+desparasitante+"\n");
    }
}
