import java.io.*;


public class Ejemplo02 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) {
        int dividendo = 3;
        int divisor = 6;
        int result = (dividendo / divisor) * 10;

        out.print(result);
        
    }
    
}
