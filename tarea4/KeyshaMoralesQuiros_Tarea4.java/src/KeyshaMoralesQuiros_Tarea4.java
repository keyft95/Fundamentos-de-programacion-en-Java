import java.io.*;

public class KeyshaMoralesQuiros_Tarea4{ 
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        menu();
        
        //out.println(calcularMontoAlumbradoPublico(654));

        // out.println(calcularMontoTributoBomberos(100));

        //out.println(calcularMontoIVA(126, 23000));

        //out.println(calcularMesMayorConsumo());

        //out.println(calcularMontoEnergia(400, 400, 400));

        //imprimirEcoFactura("noviembre", 400, 200, 100);

    }
    static void menu () throws IOException {

        char opcionMenu;

        do{
            out.println("A. Calcular el mes con más consumo");
            out.println("B. Calcular la Eco-Factura del mes");
            out.println("Q. Salir");

            opcionMenu = in.readLine().charAt(0);

            opcionMenu = Character.toUpperCase(opcionMenu);

            switch (opcionMenu) {

                case 'A': 
                    out.println(calcularMesMayorConsumo());
                    break;

                case 'B':
                    out.println("Digite el mes a Facturar");
                    String mesAFacturar = in.readLine();

                    out.println("Digite el total de KWH en horario de punta");
                    double totalKWHPunta = Double.parseDouble(in.readLine());

                    out.println("Digite el total de KWH en horario de valle");
                    double totalKWHValle = Double.parseDouble(in.readLine());

                    out.println("Digite el total de KWH en horario nocturno");
                    double totalKWHNocturno = Double.parseDouble(in.readLine());

                    imprimirEcoFactura(mesAFacturar, totalKWHPunta, totalKWHValle, totalKWHNocturno);
                    break;

                case 'Q':
                    out.println("Adiós :)");
                    break;
            }

            


        }while(opcionMenu!= 'Q');
    }

    static double calcularMontoAlumbradoPublico(double totalKWHConsumidosTodoHorario){

        double  montoColonesAlumbradoPublico = totalKWHConsumidosTodoHorario * 3.37;

        return montoColonesAlumbradoPublico;
    }

    static double calcularMontoTributoBomberos(double totalKWHConsumidosTodoHorario){

        double montoColonesTributoBomberosCR;
        
        montoColonesTributoBomberosCR = totalKWHConsumidosTodoHorario * 0.175;

        return montoColonesTributoBomberosCR; 
    }

    static double calcularMontoIVA(double totalKWHConsumidosTodoHorario, double montoFacturadoPorEnergia){

        double iVATotal;

        if(totalKWHConsumidosTodoHorario >= 280){

            iVATotal = montoFacturadoPorEnergia * 0.13;

        }else{

            iVATotal = 0;

        }

        return iVATotal;
    }
    static String calcularMesMayorConsumo()throws IOException{

        int meses = 6, i = 1;
        double kWHDelMes,totalKWHMes = 0 ;
        String mesMayorConsumo = "", nombreMes = "" ;

        while (i <= meses){
            
            out.println("Digite el nombre del mes");
            nombreMes = in.readLine();

            out.println("Digite la cantidad de KWH del mes");
            kWHDelMes = Double.parseDouble(in.readLine());

            if(kWHDelMes > totalKWHMes){

                mesMayorConsumo = nombreMes;
                totalKWHMes = kWHDelMes;

            }
            i++;
        }

        return mesMayorConsumo;
    }

    static double calcularMontoEnergia( double totalKWHHorarioPunta, double totalKWHHorarioValle, double totalKWHHorarioNocturno){

        double montoFacturadoPorEnergia,montoTotalHorarioPunta, montoTotalHorarioValle, montoTotalHorarioNocturno, tarifaConsumoHorarioPuntoMenor500KWH = 167.72, tarifaConsumoHorarioValleMenor500KWH = 68.75, tarifaConsumoHorarioNocturnoMenor500KWH = 28.77, tarifaConsumoHorarioPuntoMayor500KWH = 207.39, tarifaConsumoHorarioValleMayor500KWH = 83.71, tarifaConsumHorarioNocturnoMayor500KWH = 38.74;

        if(totalKWHHorarioPunta <= 500){

            montoTotalHorarioPunta = totalKWHHorarioPunta * tarifaConsumoHorarioPuntoMenor500KWH;


        }else{

            montoTotalHorarioPunta = totalKWHHorarioPunta * tarifaConsumoHorarioPuntoMayor500KWH;

        }

        if(totalKWHHorarioValle <= 500){

            montoTotalHorarioValle = totalKWHHorarioValle * tarifaConsumoHorarioValleMenor500KWH;

        }else{

            montoTotalHorarioValle =totalKWHHorarioValle * tarifaConsumoHorarioValleMayor500KWH;

        }

        if(totalKWHHorarioNocturno<= 500){

            montoTotalHorarioNocturno = totalKWHHorarioNocturno * tarifaConsumoHorarioNocturnoMenor500KWH;

        }else{

            montoTotalHorarioNocturno = totalKWHHorarioNocturno * tarifaConsumHorarioNocturnoMayor500KWH;

        }

        montoFacturadoPorEnergia = montoTotalHorarioPunta + montoTotalHorarioValle + montoTotalHorarioNocturno;

        return montoFacturadoPorEnergia;

    }

    static void imprimirEcoFactura(String nombreMesFactura, double totalKWHHorarioPunta, double totalKWHHorarioValle, double totalKWHHorarioNocturno){

       double montoFacturadoPorEnergia, totalKWHConsumidosTodoHorario = totalKWHHorarioPunta + totalKWHHorarioValle + totalKWHHorarioNocturno, total;
       
       montoFacturadoPorEnergia = calcularMontoEnergia(totalKWHHorarioPunta, totalKWHHorarioValle, totalKWHHorarioNocturno);
        total = calcularMontoEnergia(totalKWHHorarioPunta, totalKWHHorarioValle, totalKWHHorarioNocturno) + calcularMontoAlumbradoPublico(totalKWHConsumidosTodoHorario) + calcularMontoTributoBomberos(totalKWHConsumidosTodoHorario) + calcularMontoIVA(totalKWHConsumidosTodoHorario, montoFacturadoPorEnergia);
        

        out.println("Eco-Factura");
        out.println("Nombre del Mes Facturado: "+ nombreMesFactura);
        out.println("Total de KWH consumidos en el mes: " + totalKWHConsumidosTodoHorario);
        out.println("Monto correspondiente a Energía: " + montoFacturadoPorEnergia);
        out.println("Monto correspondiente a Alumbrado Público: " + calcularMontoAlumbradoPublico(totalKWHConsumidosTodoHorario));
        out.println("Monto correspondiente al Tributo de Bomberos: " + calcularMontoTributoBomberos(totalKWHConsumidosTodoHorario));
        out.println("Monto correspondiente al IVA: " + calcularMontoIVA(totalKWHConsumidosTodoHorario, montoFacturadoPorEnergia));
        out.println("Total a Pagar en la Factura: "+ total);
    }

 
}
