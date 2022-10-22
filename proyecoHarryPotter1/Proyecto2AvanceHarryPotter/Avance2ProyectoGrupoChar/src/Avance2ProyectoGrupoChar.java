import java.io.*;
public class Avance2ProyectoGrupoChar {
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {


        String equipo1="", equipo2="", snitchEquipo1="", snitchEquipo2="", resultadoGeneral="";

        int numeroJuegos=0, marcadorEquipo1=0,marcadorEquipo2=0,puntajeTotal=0, juego=1,resultadoJuego=0;

        out.println("Equipo");
        equipo1=in.readLine();

        out.println("Número de juegos");
        numeroJuegos=Integer.parseInt(in.readLine());

        
        if(numeroJuegos>0){

            while(juego<=numeroJuegos){

                out.println("Juego "+juego+"contra:");
                equipo2=in.readLine();

                out.println("Marcador de "+equipo1+".");
                marcadorEquipo1= Integer.parseInt(in.readLine());

                puntajeTotal= puntajeTotal+marcadorEquipo1;

                out.println("Atrapó "+equipo1+ "la Snitch? (SI o NO");
                snitchEquipo1= in.readLine();

                out.println("Marcador de "+ equipo2+".");
                marcadorEquipo2= Integer.parseInt(in.readLine());

                out.println("Atrapó "+ equipo2+" la Snitch? (SI o NO");
                snitchEquipo2=  in.readLine();

                if(snitchEquipo1.equalsIgnoreCase("SI")){

                    out.println(equipo1 + "vs "+ equipo2 + ":"+ marcadorEquipo1+"*"+ "-"+ marcadorEquipo2);

                }else{

                    out.println(equipo1+ "vs"+ equipo2+ ":"+ marcadorEquipo1+"-"+ marcadorEquipo2+"*");


                }
                
                resultadoGeneral= resultadoGeneral+ resultadoJuego;

                juego++;

            }

            out.println("El puntaje total del "+ equipo1+ "es: "+ puntajeTotal);


        }else{
            out.println("No hay datos para leer");
        }
        



    }
        
}

