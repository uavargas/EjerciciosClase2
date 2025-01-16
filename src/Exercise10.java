/*
Media Aritmética
Crea un programa que calcule la media aritmética de tres números introducidos por el usuario.
* */


import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        // instanciamos un objeto de la clase Scanner
        Scanner input = new Scanner(System.in);
        // Declaramos la 3 variables que van a contener los 3 numeros que ingresa el usuario
        int number1, number2, number3;
        double  mediaAritmetica;

        System.out.print("Ingrese el primer numero: ");
        number1 = input.nextInt();
        System.out.print("Ingrese el primer numero: ");
        number2 = input.nextInt();
        System.out.print("Ingrese el primer numero: ");
        number3 = input.nextInt();

        mediaAritmetica = (number1 + number2 + number3) /3;

        System.out.printf("La media aritmética de %d, %d y %d es: %.0f " , number1,number2,number3,mediaAritmetica);
    }
}
