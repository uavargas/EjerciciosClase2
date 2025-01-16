/*
Conversión de Temperaturas
Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin.
Usa las siguientes fórmulas:

Fahrenheit = Celsius * 9/5 + 32
Kelvin = Celsius + 273.15
* */


import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        // instanciamos un objeto de la clase Scanner
        Scanner input = new Scanner(System.in);
        double gradosCelsius;
        System.out.print("Ingrese el valor en grados Celsius: ");
        gradosCelsius = input.nextDouble();

        //Proceso de las operaciones de conversion de la temperatura
        double fahrenheit = gradosCelsius * 9/5 + 32;
        double kelvin     = gradosCelsius + 273.15;

        // Mostramos los resultados de las conversiones

        System.out.printf("%.1f grados Celsius equivalen a %.1f grados Fahrenheit y a %.1f grados kelvin",
                gradosCelsius,fahrenheit,kelvin);




    }




}
