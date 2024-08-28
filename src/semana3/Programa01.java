
package semana3;
import java.util.Scanner;
public class Programa01 {
    public static void main (String[] args){
        //declarar variables 
        int n1,n2,n3,n4;
        String mensaje;
        Scanner lectura= new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingresa cuarto número: ");
        n4=lectura.nextInt();
        //proceso de datos
        mayor=n1;
        if(n2>mayor){
            mayor=n2;
        }
        if (n3>mayor){
            mayor=n3;
        }
        if (n4>mayor){
            mayor=n4;
                    
        }
        //salida de datos
        System.out.println("El numero mayor es: "+mayor);
                
    }
}
