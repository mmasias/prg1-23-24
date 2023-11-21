package reto_003;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el coste del artículo: ");
            int coste = scanner.nextInt();

            System.out.print("Ingrese la cantidad de dinero: ");
            int miDinero = scanner.nextInt();

            int vuelta = miDinero - coste;
            System.out.println("La vuelta es de: " + vuelta);

            int billete100 = vuelta / 100;
            vuelta = vuelta % 100;

            int billete50 = vuelta / 50;
            vuelta = vuelta % 50;

            int billete20 = vuelta / 20;
            vuelta = vuelta % 20;

            int billete10 = vuelta / 10;
            vuelta = vuelta % 10;

            int moneda2 = vuelta / 2;
            vuelta = vuelta % 2;

            int moneda1 = vuelta / 1;
            
            System.out.println(billete50 > 0 ? "Billetes de 100 euros: " + billete100 : "");
            System.out.println(billete50 > 0 ? "Billetes de 50 euros: " + billete50 : "");
            System.out.println(billete20 > 0 ? "Billetes de 20 euros: " + billete20 : "");
            System.out.println(billete10 > 0 ? "Billetes de 10 euros: " + billete10 : "");
            System.out.println(moneda2 > 0 ? "Monedas de 2 euros: " + moneda2 : "");
            System.out.println(moneda1 > 0 ? "Monedas de 1 euros: " + moneda1 : "");
        }
    }
}