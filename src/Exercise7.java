/*
* Calculadora Básica
Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma,
*  resta, multiplicación y división con esos números. Muestra los resultados en la consola.
* */

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        // instanciamos un objeto de la clase Scanner
        Scanner input = new Scanner(System.in);

        // Declaramos las variables de tipo int para capturar los valores que el usuario ingresa y realizar las
        // operaciones.
        int number1, number2;

        //Solicitamos el primer Valor
        System.out.print("Ingrese el primer valor: ");
        //Capturamos el valor en la variable previamennte declarada number1
        number1 = input.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        number2 = input.nextInt();

        // Mostramos en pantalla el resultado de: as operaciones de suma,
        //  resta, multiplicación y división
        System.out.printf("El resultado de la suma entre %d y %d es: %d \n", number1,number2, number1+number2 );
        System.out.printf("El resultado de la resta entre %d y %d es: %d \n", number1,number2, number1-number2 );
        System.out.printf("El resultado de la multiplicacion entre %d y %d es: %d \n", number1,number2,
                number1*number2 );
        System.out.printf("El resultado de la division entre %d y %d es: %d \n", number1,number2, number1/number2 );
    }
}
