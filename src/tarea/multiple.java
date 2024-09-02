package tarea;
import java.util.Scanner;
public class multiple {
    public static void main (String[] ars){
          //declarar variables 
        int edad;
        String mensaje = null;
        Scanner lectura= new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingresa la edad: ");
        edad=lectura.nextInt();
        //proceso de datos
        if (edad>=0 && edad<=12){
            mensaje="niño";
        }else if (edad>=13 && edad<=19){
            mensaje="adolescente"; 
        }else if (edad>=20 && edad<=64){
            mensaje="adulto";
        }else if (edad>=65){
            mensaje="adulto mayor";
        }
        //salida de datos    
        System.out.println(mensaje);          
    }
}
