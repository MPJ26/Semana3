
package semana3;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args){
        //declarar variables
        int num;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingrese su edad: ");
        num=lectura.nextInt();
        //proceso de datos
        if (num>0){
            mensaje="Número positivo";
        }else if(num<0){   
            mensaje="Número negativo";
        }else {
            mensaje="Número Neutro";
        }
        //salida de datos
        System.out.println(mensaje);
    }
}
