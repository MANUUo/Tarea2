package tarea2;

import java.util.Scanner;

/**
 *
 * @author Manuel López
 */
public class Tarea2 {

    /* Escaner */
    public static Scanner datos = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcion;
        /* Menú */
        do{
        System.out.println("========Calculadora========");
        System.out.println("Que operacion desea realizar?");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicacion (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Salir");
        System.out.println("===========================");
        System.out.println("Elige una opcion: ");
        opcion = datos.nextInt();
        operaciones(opcion); 
        } while (opcion != 5);
    }
    
    /* Menú de Operaciones */
    public static void operaciones(int _opcion){
        
        double resultado;
        double num1;
        double num2;
        
        switch(_opcion){
            case 1:
                System.out.println("Suma!");
                System.out.println("Ingrese el primer numero a sumar:");
                num1 = datos.nextDouble();
                System.out.println("Ingrese el otro numero a sumar:");
                num2 = datos.nextDouble();
                resultado = num1 + num2;
                System.out.println("La suma de: " + num1 + " y " + num2 + " es de: " + resultado);
                break;
            case 2:
                System.out.println("Resta!");
                System.out.println("Ingrese el primer numero:");
                num1 = datos.nextDouble();
                System.out.println("Ingrese el otro numero (sustraendo):");
                num2 = datos.nextDouble();
                resultado = num1 - num2;
                System.out.println("La resta de: " + num1 + " y " + num2 + " es de: " + resultado);
                break;
            case 3:
                System.out.println("Multiplicacion!");
                System.out.println("Ingrese el primer numero a multiplicar:");
                num1 = datos.nextDouble();
                System.out.println("Ingrese el otro numero a multiplicar:");
                num2 = datos.nextDouble();
                resultado = num1 * num2;
                System.out.println("La multiplicacion de: " + num1 + " y " + num2 + " es de: " + resultado);
                break;
            case 4:
                System.out.println("Division!");
                System.out.println("Ingrese el primer numero (dividendo):");
                num1 = datos.nextDouble();
                do {
                System.out.println("Ingrese el otro numero (divisor):");
                num2 = datos.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error: El divisor no puede ser cero. Intente nuevamente.");
                    }
                } while (num2 == 0);
                resultado = num1 / num2;
                System.out.println("La suma de: " + num1 + " y " + num2 + " es de: " + resultado);
                break;
        }
    }
}
