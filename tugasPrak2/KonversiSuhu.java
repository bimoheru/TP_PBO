package tugasPrak2;

public class KonversiSuhu {
     public static void main(String[] args) {
        double C = 10, F = 15, R = 5;
        
        double cToF = (C * 9/5) + 32, fToC = (F - 32) * 5/9;
        double cToR =  C * 4/5, rToC = R * 5/4;
        double fToR = (F - 32) * 4/9, rToF = (R * 9/4) + 32;
        
        

        System.out.println("Celsius ke Fahrenheit: " + cToF);
        System.out.println("Fahrenheit ke Celsius: " + fToC);
        
        System.out.println("\nCelsius ke Reamur: " + cToR);
        System.out.println("Reamur ke Celsius: " + rToC);
        
        System.out.println("\nFahrenheit ke Reamur: " + fToR);
        System.out.println("Reamur ke Fahrenheit: " + rToF);
    }
}
