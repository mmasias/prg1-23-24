import java.util.Scanner;

public class Reto5 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

      
        int mayor = numero1 > numero2 ? numero1 : numero2;

        
        System.out.println("El mayor de los dos números es: " + mayor);

        
        scanner.close();
    }
}