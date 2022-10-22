
import java.io.*;
public class KeyshaMorales_JaimeVictoria_FernandaCortes_DayanaBrenes_Entrega1 {
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    
    public static void main(String[] args) throws Exception {
        

        String equipos;
        double puntajePartidos = 0; 
        double puntajeTotal;
    
        double numJuegos = 0;
        double numOponentes = 0;

        out.println( "Nombre del equipo");
        equipos = in.readLine();

        out.println("Puntaje de todos los partidos");
        puntajePartidos = Double.parseDouble(in.readLine());

        out.println("Número de juegos ejecutados");
        numJuegos = Double.parseDouble(in.readLine());

        out.println("Número de oponentes diferentes");
        numOponentes = Double.parseDouble(in.readLine());

        if (numJuegos >= 5) {
            numJuegos = 1;
        
        } else {
            numJuegos = Math.sqrt(numJuegos) / 2.25;
        }
        if (numOponentes == 1){
            numOponentes = numOponentes * (1/3);        

        } else {
            if ( numOponentes ==2){
                numOponentes = numOponentes * (2/3);
            } else {
                numOponentes = 1;
            }

            
        }
        puntajeTotal = puntajePartidos + numJuegos + numOponentes;

        out.println("El puntaje total del equipo de " + equipos + "es:" + puntajeTotal);
    }
}

