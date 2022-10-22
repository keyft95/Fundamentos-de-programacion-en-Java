import java.io.*;

public class KeyshaMoralesQuiros_Tarea2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {
        int puntosAcumuladosPorInfracciones;
        int totalAPagar = 0;
        char clienteBCR;
        int vigenciaLicencia = 0;

        out.println("Requisitos para renovar su licencia: \nCédula al día y enbuen estado\nVigente dictamen médico digital para licencia\nMultas pendientes pagas\nNo haber llegado a los 12 puntos en infracciones de tránsito acumuladas.");
        
        out.println("Digite la cantidad de puntos acumulados por infracciones:");
        puntosAcumuladosPorInfracciones = Integer.parseInt(in.readLine());

        if (puntosAcumuladosPorInfracciones < 12) {
            out.println("Puede renovar licencia");

            if (puntosAcumuladosPorInfracciones <= 4){
                totalAPagar = 5000;
                vigenciaLicencia = 6;
            } else {
                if (puntosAcumuladosPorInfracciones >= 5 && puntosAcumuladosPorInfracciones<=8){
                    totalAPagar = 10000;
                    vigenciaLicencia = 4;                    
                } else {
                    if (puntosAcumuladosPorInfracciones>= 9 && puntosAcumuladosPorInfracciones <= 11){
                        totalAPagar = 10000;
                        vigenciaLicencia = 3;

                    }
                }
            }

            out.println("Es cliente BCR?");
            clienteBCR = in.readLine().charAt(0);
            if(clienteBCR =='S'|| clienteBCR == 's'){
                out.println("El total a pagar es "+ (totalAPagar + 4200) + " colones. Su licencia tendrá vigencia por "+ vigenciaLicencia + " años.");

            } else {
                out.println("El total a apagar es " + totalAPagar + " colones. Su licencia tendrá vigencia por " + vigenciaLicencia + " años.");
            }


        } else {
            out.println("Lo lamento, no puede renovar su licencia, esta se encuentra suspendida.");
        }


        
    }
}
