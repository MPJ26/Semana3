package tarea;
import java.util.Scanner;
public class simple {
    public static void main (String[] args){
         //declarar variables 
        int numero;
        Scanner lectura= new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingresa un numero entero: ");
        numero=lectura.nextInt();
        //proceso de datos
        if(numero%2==0){
        System.out.println("El numero es par");
        }
        if(numero%2!=0){
        System.out.println("El numero es impar");            
        }               
        lectura.close();        
    }
}
