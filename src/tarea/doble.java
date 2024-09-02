package tarea;
import java.util.Scanner;
public class doble {
    public static void main(String[] args){
          //declarar variables 
        int edad;
        String mensaje;
        Scanner lectura= new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingresa la edad: ");
        edad=lectura.nextInt();
        //proceso de datos
        if (edad<12 || edad>65){
            mensaje="La entrada cuesta 5 soles";         
        }else {
            mensaje="La entrada cuesta 10 soles";
        }
        //salida de datos    
        System.out.println(mensaje);
                
    }
}
