import java.io.*;

public class Proyecto3AvanceHarryPotter { 
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int numeroDeEquipos, promedioOponentes = 0;

        out.println("Ingrese el número de equipos");

        numeroDeEquipos = Integer.parseInt(in.readLine());

        String[] equipos = new String[numeroDeEquipos];

        int[] numeroDeJuegos = new int[numeroDeEquipos];

        int[] numeroDeOponentes = new int[numeroDeEquipos];

        String[] resultados = new String[numeroDeEquipos];

        double[] puntajeTotal = new double[numeroDeEquipos];
        
        int seleccion;

        do{

            imprimirMenu();
            
            seleccion = Integer.parseInt(in.readLine());

            switch (seleccion) {

                case 1: 

                    iniciarPrograma(equipos, numeroDeJuegos, numeroDeOponentes, resultados, puntajeTotal, numeroDeEquipos);
                    break;

                
                case 2:

                    registrarArreglos(equipos, numeroDeJuegos, numeroDeOponentes, numeroDeEquipos);

                    break;

                case 3:
                    construirReporte(numeroDeEquipos, resultados, puntajeTotal, equipos);

                    break;
                    
                case 4:

                    imprimirReporteDeResultados(numeroDeEquipos, resultados);
                    
                    break;
                    
                case 5:

                    imprimirPuntajeTotal(numeroDeEquipos, puntajeTotal);
                    
                    break;
                    
                case 6:

                    promedioOponentes = calcularPromedioOponentes(numeroDeEquipos, numeroDeOponentes);
                    
                    break;
                    
                case 7:

                    imprimirEquipoMasJugado(numeroDeEquipos, numeroDeJuegos, equipos);
                    
                    break;
                    
                case 8:

                    imprimirEquipoMenorPuntaje(numeroDeEquipos, puntajeTotal, equipos);
                    
                    break;
                    
                case 9:

                    imprimirEquipoJugadosMayoresA5(equipos, numeroDeJuegos, numeroDeEquipos);
                    
                    break;
                    
                case 10:

                    imprimirEquipoOponentesMayorAlPromedio(promedioOponentes, equipos, numeroDeOponentes, numeroDeEquipos);
                    
                    break;
                    

                case 11:
                    out.println("Adiós :)");
                    break;
            }

        }while(seleccion!= 11);
    }



    static void imprimirMenu () {

        out.println("1. Inicia el programa");
        out.println("2. Registrar la información de los arreglos");
        out.println("3. Construir el reporte de resultados");
        out.println("4. Imprimir el reporte de resultados");
        out.println("5. Imprimir el puntaje total");
        out.println("6. Calcular el promedio de oponentes");
        out.println("7. Imprimir el nombre del equipo que ha jugado más partidos en todo el torneo");
        out.println("8. Imprimir el nombre del equipo con menor puntaje en todo el torneo");
        out.println("9. Imprimir los nombres de los equipos que han jugado 5 partidos o más");
        out.println("10. Imprimir el nombre de los equipos que tengan más oponentes que el promedio de oponentes de todo el torneo");
        out.println("11. Salir");

    } 

    static void iniciarPrograma(String[] equipos, int[] numeroDeJuegos, int[] numeroDeOponentes, String[] resultados, double[] puntajeTotal, int numeroDeEquipos ){

        int contador= 0;

        while(contador < numeroDeEquipos){

            equipos[contador] ="";

            numeroDeJuegos[contador] = 0;

            numeroDeOponentes[contador] = 0;

            resultados[contador] = "";

            contador++;

        }
    }

    static void registrarArreglos(String[] equipos, int[] numeroDeJuegos, int[] numeroDeOponentes, int numeroDeEquipos) throws IOException{

        int contador = 0;

        while(contador < numeroDeEquipos){

            out.println("Ingrese el nombre del equipo " + (contador+1));
            equipos[contador] = in.readLine();

            out.println("Ingrese la cantidad de juegos del equipo " + equipos[contador]);
            numeroDeJuegos[contador] = Integer.parseInt(in.readLine());

            out.println("Ingrese la cantidad de oponentes del equipo "+ equipos[contador]);
            numeroDeOponentes[contador] = Integer.parseInt(in.readLine());

            contador++;
        }

    }

    static void construirReporte(int numeroDeEquipos, String[] resultados, double[] puntajeTotal, String[] equipos)throws IOException{

        int contador = 0, juegosEjecutados, numeroDeOponentes;

        while(contador < numeroDeEquipos){

            double puntaje = 0;

            out.println("Ingrese el puntaje de todos los partidos de " + equipos[contador]);
            puntaje = Integer.parseInt(in.readLine());

            out.println("Ingrese los juegos ejecutados por " + equipos[contador]);
            juegosEjecutados = Integer.parseInt(in.readLine());

            out.println("Ingrese el numero de oponentes" + equipos[contador]);
            numeroDeOponentes = Integer.parseInt(in.readLine());
            
            if(juegosEjecutados >= 5){
                puntaje = puntaje++;
            }else{
                puntaje = Math.sqrt(juegosEjecutados) / 2.25;
            }

            switch(numeroDeOponentes){
                case 1:
                    puntaje = puntaje + 1/3;
                break;

                case 2:
                    puntaje = puntaje + 2/3;
                break;

                default:
                    puntaje = puntaje + 1;
                break;

            }

            puntajeTotal[contador] = puntaje;

            
            resultados[contador] = "Equipo: " + equipos[contador]+ "\nPuntaje total: " + puntajeTotal[contador] + "\nJuegos ejecutados: " + juegosEjecutados + "\nNumero de oponentes" + numeroDeOponentes;


            contador++;

        }


    }

    static void imprimirReporteDeResultados(int numeroDeEquipos,String[] resultados){

        int contador = 0;

        while(contador < numeroDeEquipos){

            out.println(resultados[contador]);

            contador++;
        }
    }

    static void imprimirPuntajeTotal(int numeroDeEquipos, double[] puntajeTotal){

        int contador = 0;

        while(contador < numeroDeEquipos){

            out.println(puntajeTotal[contador]);

            contador++;
        }
    }

    static int calcularPromedioOponentes(int numeroDeEquipos, int[] numeroDeOponentes){

        int contador = 0, suma = 0, promedio;

        while(contador < numeroDeEquipos){

            suma = suma + numeroDeOponentes[contador];

            contador++;
        }
        promedio = suma / numeroDeEquipos;

        out.println(promedio);

        return promedio;
    }

    static void imprimirEquipoMasJugado(int numeroDeEquipos, int[] numeroDeJuegos, String[] equipos){

        int contador = 0, mayor = 0;

        while(numeroDeEquipos < numeroDeEquipos){

            if(numeroDeJuegos[contador] > numeroDeJuegos[mayor]){

                mayor = contador;

                contador++;
            }

        }

        out.println(equipos[mayor]);
    }

    static void imprimirEquipoMenorPuntaje(int numeroDeEquipos, double[] puntajeTotal, String[] equipos){

        int contador = 0, menor = 0;

        while(contador < numeroDeEquipos){

            if(puntajeTotal[contador] < puntajeTotal[menor]){

                menor = contador;
            }
            contador++;
        }

        out.println(equipos[menor]);
    }

    static void imprimirEquipoJugadosMayoresA5(String[] equipos, int[] numeroDeJuegos, int numeroDeEquipos){

        int contador = 0;

        while(contador < numeroDeEquipos){

            if(numeroDeJuegos[contador] > 5){

                out.println(equipos[contador]);
            }

            contador++;
        }
    }

    static void imprimirEquipoOponentesMayorAlPromedio(int promedioOponentes, String[] equipos, int[] numeroDeOponentes, int numeroDeEquipos){
        
        int contador = 0;

        while(contador < numeroDeEquipos){

            if(numeroDeOponentes[contador] > promedioOponentes){

                out.println(equipos[contador]);

                contador++;
            }
        }
    }
}