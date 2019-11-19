package areacirculoapp;
import java.util.Locale;
import java.util.Scanner;

public class AreaCirculoApp {

        public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un radio");
        teclado.useLocale(Locale.US);
        double radio = teclado.nextDouble();
        
        //Formula área círculo, usamos algunos de los métodos de Math.
        double area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("El área del círculo es " + area);
      
    }
    
}
