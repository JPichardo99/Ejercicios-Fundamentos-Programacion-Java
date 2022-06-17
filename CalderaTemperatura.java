/*
Realizar un programa que simule un pequeño monitoreo en la temperatura de una
caldera, dicha temperatura sera calculada de forma aleatoria y si la temperatura
si la temperatura esta dentro del rango de 20 a 29 entonces es una temperatura estable,
si la temperatura esta dentro del rango de 30 a 59 entonces es una alerta amarilla y la
temperatura estara sobre el limite, si la temperatura esta dentro del rango de 60 y 79 
entonces es una alerta roja y la temperatura sera excesiva y si la temperatura es mayor
o igual a 80 entonces sera una alerta negra y el programa terminara.
*/
public class CalderaTemperatura {
    float a_temperatura = 20, a_variTemperatura;
    boolean a_paro;
    public static void main(String[] args) {
        CalderaTemperatura v_objeto = new CalderaTemperatura();
        v_objeto.m_geneTempAleatoria();
        v_objeto.m_alertas();
        v_objeto.m_veriCaldera();
    }

    void m_geneTempAleatoria() {
        a_variTemperatura = (float) ((Math.random() * 1000 - 500) / 100);
        a_temperatura += a_variTemperatura;
    }

    void m_alertas() {
        if (a_temperatura >= 80) {
            a_paro = true;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("ALERTA NEGRA");
            System.out.println("PARO TOTAL !LA TEMPERATURA ES PELIGROSA!");
            System.out.println("LA TEMPERATURA ES:" + a_temperatura);
            System.out.println("***********");
	    System.exit(0);
        } else if (a_temperatura >= 60 && a_temperatura <= 79) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("ALERTA ROJA");
            System.out.println("!LA TEMPERATURA ES EXCESIVA!");
            System.out.println("LA TEMPERATURA ES:" + a_temperatura);
            System.out.println("***********");
        } else if (a_temperatura >= 30 && a_temperatura <= 59) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("ALERTA AMARILLA");
            System.out.println("TEMPERATURA SOBRELIMITE");
            System.out.println("LA TEMPERATURA ES:" + a_temperatura);
            System.out.println("*********");
        } else if (a_temperatura >= 20 && a_temperatura <= 29 ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("TEMPERATURA ESTABLE");
            System.out.println("LA TEMPERATURA ES:" + a_temperatura);
            System.out.println("*********");
        }
    }

    void m_veriCaldera() {
        a_paro = false;
        float v_valoAbs;
        v_valoAbs = (float) (Math.abs(a_variTemperatura));
        while (a_paro == false) {
            if (a_variTemperatura < 0 || v_valoAbs < a_temperatura) {
            } else {
                a_temperatura += a_variTemperatura;
            }
            m_geneTempAleatoria();
            m_alertas();
        }
    }
}