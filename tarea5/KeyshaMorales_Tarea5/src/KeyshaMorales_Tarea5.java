import java.io.*;
import java.util.Arrays;

public class KeyshaMorales_Tarea5 { 
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int opcionMenu;

        int[] barcosJugador = new int[20];
        int[] barcosComputadora = new int[20];

        do{
            imprimirMenu();

            opcionMenu = Integer.parseInt(in.readLine());


            switch (opcionMenu) {

                case 1: 
                    inicializarBarcosComputadora(barcosComputadora);
                    inicializarBarcosJugador(barcosJugador);
                    break;

                case 2:
                    imprimirBarcos(barcosComputadora);                    
                    imprimirBarcos(barcosJugador);

                    break;

                case 3 :
                    out.println("de quien es el turno? 1: compu, 2 jugador");
                    int turno = Integer.parseInt(in.readLine());
                    if(turno == 1){
                        out.println(hacerDisparo(barcosJugador, obtenerIndiceAleatorio()));
                    }else{
                        out.println("inserte una posicion del 0 al 19");
                        int posicion = Integer.parseInt(in.readLine());
                        out.println(hacerDisparo(barcosComputadora, posicion));
                    }
                break;

                case 4:
                    out.println("Adiós :)");
                    break;
            }
        }while(opcionMenu !=4 );


    }

    static int obtenerIndiceAleatorio(){

        return (int) (Math.random()*100) %20;
    }

    static void inicializarBarcosComputadora(int[] barcosComputadora){

        int i = 0;

        while(i < 5){
            
            int indiceRandom = obtenerIndiceAleatorio();
            if(barcosComputadora[indiceRandom] == 0){
                barcosComputadora[indiceRandom] = i + 1;
                i++;
            }

        }

    }

    static void inicializarBarcosJugador(int[] barcosJugador) throws IOException{

        int i = 0;

        while(i < 5){
            out.println("ingrese un indice para colocar el barco " + (i+1)+" del 0 al 19");
            int indice = Integer.parseInt(in.readLine());
            if(barcosJugador[indice] == 0){
                barcosJugador[indice] = i + 1;
                i++;
            }

        }
    }

    static void imprimirMenu(){

        out.println("1. Inicializar el juego");
        out.println("2. Imprimir donde están los barcos");
        out.println("3. Jugar");
        out.println("4. Salir del juego");
        
    }

    static void imprimirBarcos(int[] barcos){

        out.println(Arrays.toString(barcos));
    }

    static int hacerDisparo(int[] barcos, int posicion){

        int resultado = -1;

        if(barcos[posicion]!= 0){

            resultado= barcos[posicion];

            barcos[posicion]= 0;
        }

        return resultado;
    }
    
}