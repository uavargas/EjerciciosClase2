/*
* Área y Perímetro de un Rectángulo
Crea un programa que calcule el área y el perímetro de un rectángulo.
* Solicita al usuario la longitud y el ancho del rectángulo
*
* */

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        // instanciamos un objeto de la clase Scanner
        Scanner input = new Scanner(System.in);
        double longitud, ancho, area, perimetro;

        System.out.print("Ingrese el valor de la longitud del Rectangulo: ");
        longitud = input.nextDouble();

        System.out.print("Ingrese el valor del ancho del Rectangulo: ");
        ancho = input.nextDouble();

        // Hallar el perimetro
        perimetro = (longitud * 2) + (ancho * 2);
        area = longitud * ancho;


        System.out.printf("El perimetro del retangulo que tiene de ancho de %.1f Cm  y una de longitud %.1f Cm es: %" +
                        ".1f Cm \n",
                ancho,
                longitud,
                perimetro );

        System.out.printf("El area del retangulo que tiene de ancho de %.1f Cm  y una de longitud %.1f Cm es: %" +
                        ".1f Cm\u00B2 \n",
                ancho,
                longitud,
                area );


    }
}
