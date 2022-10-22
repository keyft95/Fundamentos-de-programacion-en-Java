import java.io.*;
public class KeyshaMoralesQuiros_Tarea1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

        public static void main(String[] args) throws Exception {
        
        double salarioMensual;
        double salariosPendientes;
        double vacacionesNoGozadas;
        double aguinaldoProporcional;
        double preaviso;
        double cesantia;
        double mesesPendientes;

        double liquidacionTotal;

        out.println("Digite el salario Mensual");
        salarioMensual = Double.parseDouble(in.readLine());

        out.println("Digitela cantidad de meses pendientes");
        mesesPendientes = Double.parseDouble(in.readLine());

        salariosPendientes = salarioMensual * mesesPendientes;
        vacacionesNoGozadas = salarioMensual / 30 * 14;
        aguinaldoProporcional = salarioMensual / 12;
        preaviso = salarioMensual;
        cesantia = salarioMensual / 30 *20 *2;
        liquidacionTotal = salariosPendientes + vacacionesNoGozadas + aguinaldoProporcional + preaviso + cesantia;

        out.println("El salario pendiente es: "+ salariosPendientes + " colones");
        out.println("Las Vacaciones no gozadas son: " + vacacionesNoGozadas + " colones");
        out.println("El Aguinaldo proporcional es: "+ aguinaldoProporcional + " colones");
        out.println("El preaviso es: " + preaviso + " colones");
        out.println("La Cesantía son: " + cesantia + " colones");
        out.println("El total a liquidar es " + liquidacionTotal + " colones para el empleado");


    }
}
