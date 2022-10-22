import java.io.*;


public class Ejemplo01 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out =System.out;

    public static void main(String[] args) throws Exception {
        out.println("Hello, World!");
    

        String nombreCompleto = "Keysha Morales Quiros";
        String novio = "Jimmi Vila CCopa";

        out.print(nombreCompleto + " y " + novio);
    }
}
