/*
Realizar un programa que en base a la opcion seleccionada por el usuario
realice las acciones necesarias como pueden ser el generar un numero 
aleatorio de cuatro cifras entre un rango de 0 y 1, generar un aleatorio
entre un rango N y un rango M o generar letras mayusculas entre un rango
aleatorio.
*/
import java.util.Scanner;
public class Aleatorios {
Scanner entrada;
int a_op, a_puntInicio, a_puntFinal;
String a_resultado;
    public static void main(String[] args) {
        Aleatorios v_objeto2;
        v_objeto2 = new  Aleatorios();
        v_objeto2.entrada = new Scanner(System.in);
        v_objeto2.m_pedirDatos();
        switch(v_objeto2.a_op){
            case 1: v_objeto2.m_aleato0y1();
            break;
            case 2: v_objeto2.m_aleatoMyN();
            break;
            default:v_objeto2.m_aleatoLetras();
        }
        System.out.println(v_objeto2.a_resultado);
    }

    void m_pedirDatos(){
        System.out.println("OPCIONES");
        System.out.println("ALEATORIO ENTRE 0 Y 1 CON CUATRO CIFRAS...............1");
        System.out.println("ALEATORIO ENTRE N Y M...............2");
        System.out.println("ALEATORIO ENTRE LETRAS MAYUSCULAS...............3");
        a_op = entrada.nextInt();
    }

    void m_aleato0y1(){
    a_resultado = (Math.floor(Math.random()*10000)/1000)+"";
    }
    
    void m_aleatoMyN(){
        System.out.println("RANGO INICIAL");
        a_puntInicio = entrada.nextInt();
        System.out.println("RANGO FINAL");
        a_puntFinal = entrada.nextInt();
        a_resultado = (int)(Math.random()*100000%(a_puntInicio-a_puntFinal)+a_puntFinal)+"";
    
    }

    void m_aleatoLetras(){
    String v_letras = "ABCDEFGHIJKLNMOPQRST";
    int v_posicion;
    v_posicion = (int) (Math.random()*1000)%27;
    a_resultado += v_letras.CharAt(v_posicion)+"";
    /**/
    v_posicion = (int) (Math.random()*1000)%27;
    a_resultado += v_letras.CharAt(v_posicion)+"";
    /**/
    v_posicion = (int) (Math.random()*1000)%27;
    a_resultado += v_letras.CharAt(v_posicion)+"";
    }
}