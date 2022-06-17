/*
Realizar un programa que simule un pequeño juego de dados
en donde el valor de los datos seran generados de forma aleatoria
dentro de la clase dado, el usuario debera de ingresar un apuesta
(numero entero) y si la suma de los dos dados es igual a 5, 7 0 9
entonces su apuesta se duplicara pero si la suma de los datos es igual
a 12 entonces su apuesta se triplicara.
*/
import java.util.Scanner;
public class JuegoDados {
    float a_apuesta;
    dado a_dado1, a_dado2;
    Scanner entrada;
    public static void main(String[] args) {
        JuegoDados v_objeto;
        v_objeto = new JuegoDados();
        v_objeto.entrada = new Scanner(System.in);
        v_objeto.a_dado1 = new dado();
        v_objeto.a_dado2 = new dado();
        v_objeto.m_ingreApuesta();
        v_objeto.m_lanzDados();
        v_objeto.m_verifiTriunfo();
    }

    void m_ingreApuesta() {
        System.out.print("Ingresa apuesta: ");
        a_apuesta = entrada.nextFloat();
    }

    void m_lanzDados() {
        a_dado1.m_geneValor();
        a_dado2.m_geneValor();
        System.out.println("-----Valor dados-----");
        System.out.println("valor dado1: " + a_dado1.a_valor);
        System.out.println("****************");
        System.out.println("valor dado2: " + a_dado2.a_valor);
        System.out.println("****************");
    }

    void m_verifiTriunfo() {
        int v_resultado;
        v_resultado = a_dado1.a_valor + a_dado2.a_valor;
        System.out.println("-----suma de dados-----");
        System.out.println("la suma es: " + v_resultado);
        System.out.println("--");
        switch (v_resultado) {
            case 5:
                System.out.println("Ganaste el doble!!");
                System.out.println("Saldo: " + a_apuesta * 2);
                break;
            case 7:
                System.out.println("Ganaste el doble!!");
                System.out.println("Saldo: " + a_apuesta * 2);
                break;
            case 9:
                System.out.println("Ganaste el doble!!");
                System.out.println("Saldo: " + a_apuesta * 2);
                break;
            case 12:
                m_lanzDados();
                v_resultado = a_dado1.a_valor + a_dado2.a_valor;
                if (v_resultado == 5 || v_resultado == 7 || v_resultado == 9) {
                    System.out.println("Ganaste el triple!!");
                    System.out.println("Saldo: " + a_apuesta * 3);
                }
                break;
            default:
                a_apuesta = 0;
                System.out.println("PERDISTE");
                System.out.println("Saldo: " + a_apuesta);
        }
    }
}