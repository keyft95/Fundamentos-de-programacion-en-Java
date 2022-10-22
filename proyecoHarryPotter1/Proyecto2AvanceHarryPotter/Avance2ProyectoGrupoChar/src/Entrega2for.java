import java.io.*;
public class Entrega2for { // Cambiado igual al nombre del archivo
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception{
        String equipo1 = "",equipo2 = "", resultadoGeneral = "", resultadoJuego = "";
        

        int numeroJuegos = 0, marcadorEquipo1 = 0, marcadorEquipo2 = 0;
                
        int puntajeTotal = 0, juego;
        
        String snitchEquipo1 = "", snitchEquipo2 = "";
        
        out.println("Equipo: ");
        equipo1 = in.readLine();
        out.println("Numero de Juegos: ");
        numeroJuegos = Integer.parseInt(in.readLine());
        if (numeroJuegos > 0) {
            for (juego = 1; juego <= numeroJuegos; juego++) {
                out.println("Juego " + juego + " contra: ");
                equipo2 = in.readLine();
                out.println("Marcador de " + equipo1 + ": ");
                marcadorEquipo1 = Integer.parseInt(in.readLine());
                puntajeTotal = marcadorEquipo1 + puntajeTotal;
                out.println("Atrapo " + equipo1 + " la Snitch (si o no)?: ");
                snitchEquipo1 = in.readLine();
                snitchEquipo1 = snitchEquipo1.toLowerCase();
                out.println("Marcador de " + equipo2 + ": ");
                marcadorEquipo2 = Integer.parseInt(in.readLine());
                out.println("Atrapo " + equipo2 + " la snitch (si o no)?: ");
                snitchEquipo2 = in.readLine();
                snitchEquipo2 = snitchEquipo1.toLowerCase();
        
                if (snitchEquipo1.equalsIgnoreCase("si")) 
                {
                    resultadoJuego = equipo1 + " vs " + equipo2 + ": " + marcadorEquipo1 + "*" + " - " + marcadorEquipo2;
                } 
                else 
                {
                    resultadoJuego = equipo1 + " vs " + equipo2 + ": " + marcadorEquipo1 + " - " + marcadorEquipo2 + "*";
                }
                resultadoGeneral = ( resultadoGeneral + resultadoJuego + "\n");      

            }
        } 
        else 
        {
           out.println("No hay datos para leer");
        }
        out.println(resultadoGeneral);
        out.println("El puntaje Total del " + equipo1 + " es: " + puntajeTotal);
        
    }
}
