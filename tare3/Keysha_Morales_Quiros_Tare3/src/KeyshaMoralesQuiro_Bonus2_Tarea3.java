import java.io.*;

public class KeyshaMoralesQuiro_Bonus2_Tarea3 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        String tieneBeca, tieneBecaDeportiva;
        
        int j=2019,i, montoBecaAcademica=50000,montoBecaDeportiva=80000, noBecados=0, cantEstBecaDeportiva=0,cantEstBecaAcademica=0,becados,estudianteNivel, equipo, baloncesto=0, natacion=0, ajedrez=0, sinEquipo=0, nivel1=0, nivel2=0, nivel3=0, nivel4=0, nivel5=0;
        
        double  cantEstudiantes=0, porcentajeBecados, porcentajeNoBecados, montoTotalMensualBecaAcademica, montoTotalAnualBecaAcademica, montoTotalMensualBecaDeportiva, montoTotalAnualBecaDeportiva ;
        
        

        while(j<=2021){
            i=1;

            out.println("Ingrese la cantidad de estudiantes matriculados en el año "+ j);
            cantEstudiantes= Integer.parseInt(in.readLine());


            while(i<=cantEstudiantes){
                out.println("Ingrese el Nivel del Estudiante");
                estudianteNivel=Integer.parseInt(in.readLine());

                switch(estudianteNivel){
                    case 1:
                        nivel1++;
                        break;
                    
                    case 2:
                        nivel2++;
                        break;

                    case 3:
                        nivel3++;
                        break;

                    case 4:
                        nivel4++;
                        break;

                    case 5:
                        nivel5++;
                        break; 

                }

                out.println("Ingrese el equipo del Estudiante: \n 1. Baloncesto\n 2.Natación\n 3.Ajedrez\n 4.Sin Equipo");
                equipo=Integer.parseInt(in.readLine());

                switch(equipo){
                    case 1:
                        baloncesto++;
                        break;

                    case 2:
                        natacion++;
                        break;

                    case 3:
                        ajedrez++;
                        break;

                    case 4:
                        sinEquipo++;
                        break;

                }
                out.println("Tiene beca?");
                tieneBeca= in.readLine();

                if(tieneBeca.equalsIgnoreCase("SI")){

                    out.println("Tiene beca deportiva?");
                    tieneBecaDeportiva= in.readLine();
                    
                    if(tieneBecaDeportiva.equalsIgnoreCase("SI")){

                        out.println(montoBecaDeportiva);
                        cantEstBecaDeportiva++;

                    }else{

                        out.println(montoBecaAcademica);
                        cantEstBecaAcademica++;
                    }


                }else{

                    out.println("No tiene Beca");
                    noBecados++;
                }

                i++;

            }
            out.println("El total de Estudiantes del Nivel 1 son:" + nivel1);
            out.println("El total de Estudiantes del Nivel 2 son:" + nivel2);
            out.println("El total de Estudiantes del Nivel 3 son:" + nivel3);
            out.println("El total de Estudiantes del Nivel 4 son:" + nivel4);
            out.println("El total de Estudiantes del Nivel 5 son:" + nivel5);

            becados= cantEstBecaAcademica + cantEstBecaDeportiva;
            porcentajeBecados= (becados*100)/ cantEstudiantes;
            porcentajeNoBecados=(noBecados*100)/ cantEstudiantes;

            out.println("El porcentaje de Estudiantes becados es: " + porcentajeBecados +"%");
            out.println("El porcentaje de estudiantes no becados es: " + porcentajeNoBecados +"%");

            montoTotalMensualBecaAcademica= montoBecaAcademica * cantEstBecaAcademica;
            montoTotalAnualBecaAcademica= montoTotalMensualBecaAcademica * 11;

            out.println("El monto mensual otorgado a Becas Academicas es: " + montoTotalMensualBecaAcademica + " colones");
            out.println("El monto anual otorgado a Becas Academicas es: " + montoTotalAnualBecaAcademica + " colones");

            montoTotalMensualBecaDeportiva= montoBecaDeportiva * cantEstBecaDeportiva;
            montoTotalAnualBecaDeportiva= montoTotalMensualBecaDeportiva* 11;

            out.println("El monto mensual otorgado a Becas Deportivas es: "+ montoTotalMensualBecaDeportiva + " colones");
            out.println("El monto anual otorgado a Becas Deportivas es " + montoTotalAnualBecaDeportiva + " colones");

            out.println("El total de estudiantes en el equipo de Baloncesto es "+ baloncesto);
            out.println("El total de estudiantes en el equipo de Natación es "+ natacion);
            out.println("El total de estudiantes en el equipo de Ajedrez es "+ ajedrez);
            out.println("El total de estudiantes sin equipo es "+ sinEquipo);
            out.println("El total de estudiantes matriculados en el año "+ j+ " es: "+ cantEstudiantes);

            out.println(i);
            j++;

        }
    }
  
       
    
}