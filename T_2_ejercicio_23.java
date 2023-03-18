
package t_2_ejercicio_23;
import java.util.Scanner;
import java.util.*;


public class T_2_ejercicio_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A,B,C,X,X1,X2;
        System.out.println("Ingrese el valor de A");
        A = sc.nextFloat();
        System.out.println("Ingrese el valor de B");
        B = sc.nextFloat();
        System.out.println("Ingrese el valor de C");
        C = sc.nextFloat();
       
        if (A != 0){ 
            if ((B*B)-(4*A*C)>=0){
            X1 = (float) ((-B + Math.sqrt((B*B)-(4*A*C)))/(2*A));
            X2 = (float) ((-B - Math.sqrt((B*B)-(4*A*C)))/(2*A));
            System.out.println("Las posibles respuestas son x1=" +X1 );
            System.out.println("x2=" +X2);
            }else{
            System.out.println("No tiene solución.");
            }
        }else{
            X = (-C/B);
            System.out.println("La unica respuesta es=" +X);
            
        }
    
      
       
    }
    
}
