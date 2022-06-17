/*
Realizar un programa que determine si los angulos ingresados por el usuario 
corresponden a los angulos de un triangulo rectangulo (todos sus angulos son
de 90 grados), o sin corresponden a los angulos de un triangulo obtuso (todos 
sus angulos son mayores a 90 grados) o si corresponde (caso else) a los angulos
de un triangulo acutangulo.
*/
import java.util.Scanner;
public class TriangulosAngulos {
float a_angulo1 ,a_angulo2, a_angulo3;
boolean a_bandera;
Scanner entrada;
    public static void main(String[] args) {
        TriangulosAngulos  v_objeto1;
        v_objeto1 = new TriangulosAngulos();
           v_objeto1.entrada = new Scanner(System.in);
           v_objeto1.m_pedirDatos();
           v_objeto1.m_veriFormTriangulo();
           if (v_objeto1.a_bandera){
           v_objeto1.m_tipoTriangulo();
           }
           else {
               System.out.println("NO SE PUEDE CREAR EL TRIANGULO CON ESOS DATOS");
           }
    }
    /**/
     void m_pedirDatos(){
               System.out.println("ingresa el primer angulo:");
               a_angulo1 = entrada.nextFloat();
               System.out.println("ingresa el segundo angulo:");
               a_angulo2 = entrada.nextFloat();
               System.out.println("ingresa el tercer angulo:");
               a_angulo3 = entrada.nextFloat();
    }
    /**/
    void m_veriFormTriangulo(){
        if (a_angulo1 >0 || a_angulo2 > 0 || a_angulo3 > 0) {
           if(a_angulo1+a_angulo2+a_angulo3 == 180){
               a_bandera = true;
           }
           else {
               a_bandera = false;
           }
        }
        else {
            a_bandera = false;
        }
    }
    void m_tipoTriangulo(){
        if (a_angulo1 == 90 || a_angulo2 == 90 || a_angulo3 == 90) {
            System.out.println("ES UN TRIANGULO RECTANGULO ");
        }
        else if(a_angulo1 > 90 || a_angulo2 > 90 || a_angulo3 > 90) {
            System.out.println("ES UN TRIANGULO OBTUSO");
        }
        else {
        System.out.println("ES UN TRIANGULO ACUTANGULO");
        }
   }
}