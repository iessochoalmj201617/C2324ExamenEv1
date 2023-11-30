/**
 * 2.	Crea un programa (clase con main) que cree un empleado, muestre por pantalla sus datos,
 * le suba el sueldo y muestre de nuevo sus datos
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Trabajador pepito=new Trabajador("Pepe Pómez",28123456742L,TipoTrabajador.BECARIO);
        pepito.imprimirEmpleado();
        pepito.ascenderEmpleado();
        pepito.imprimirEmpleado();
    }
}
