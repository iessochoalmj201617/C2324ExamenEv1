/**
 * 3.	Crea un método static que devuelva un string que representa una H mediante asteriscos
 * 	Le pasamos la altura. La altura  tiene que ser mayor de 5 e impar. Si no lo cumple devuelve la cadena “altura no válida”
 * 	Por ejemplo: System.out.println(cadenaH(7)); imprime
 */
public class Ejercicio3
{
    public static void main(String[] args) {
        //prueba con altura con error
        System.out.println(cadenaH(5));
        System.out.println(cadenaH(10));
        //prueba correcta
        System.out.println(cadenaH(7));
    }
    static String cadenaH(int altura){
        String cadena="";
        //error si la altura menor o igual a 5 ó par
        if((altura<=5)||(altura%2==0))
            cadena="altura no válida";
        else{
            int centro=(altura/2)+1;
            for (int altActual=1;altActual<=altura;altActual++){
                //si no es la mitad
                if(altActual!=centro){//asterisco+(altura-2) huecos + asterisco
                    cadena+="*";
                    //imprimimos un total de altura-2 espacios
                    for (int anchActual=1;anchActual<=altura-2;anchActual++)
                        cadena+=" ";
                    cadena+="*";
                }else{//es el centro: rellenamos un total de altura con *
                    for (int anchActual=1;anchActual<=altura;anchActual++)
                        cadena+="*";
                }//if
                //siguiente línea
                cadena+="\n";
            }//for
        }//else
        return cadena;
    }
}
