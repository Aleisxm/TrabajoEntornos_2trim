// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.*;

public class Calculadora {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion = "";
        do {
            System.out.println("La calculadora tiene las siguientes opciones: ");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("0.Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextLine().trim();
            double sum1 = 0;
            double sum2 = 0;
            double sum3 = 0;
            switch (opcion) {

                case "1":
                    System.out.print("Escribe el primer numero: ");
                    sum1 = sc.nextInt();
                    System.out.print("Escribe el segundo numero: ");
                    sum2 = sc.nextInt();
                    sum3 = Sumar.Sumar(sum1, sum2);
                    System.out.println(sum1 + " + " + sum2 + " = " + sum3);
                    break;

                case "2":
                    System.out.print("Escribe el primer numero: ");
                    sum1 = sc.nextInt();
                    System.out.print("Escribe el segundo numero: ");
                    sum2 = sc.nextInt();
                    sum3 = Restar.Restar(sum1, sum2);
                    System.out.println(sum1 + " - " + sum2 + " = " + sum3);
                    break;

                case "3":
                    System.out.print("Escribe el primer numero: ");
                    sum1 = sc.nextInt();
                    System.out.print("Escribe el segundo numero: ");
                    sum2 = sc.nextInt();
                    sum3 = Multiplicar.Multiplicar(sum1, sum2);
                    System.out.println(sum1 + " * " + sum2 + " = " + sum3);
                    break;

                case "4":
                    System.out.print("Escribe el primer numero: ");
                    sum1 = sc.nextInt();
                    System.out.print("Escribe el segundo numero: ");
                    sum2 = sc.nextInt();
                    if (sum2 == 0) {
                        sum3 = 0;
                    } else {
                        sum3 = Dividir.Dividir(sum1, sum2);
                        System.out.println(sum1 + " / " + sum2 + " = " + sum3);
                    }
                    break;
                case "0":
                    System.out.println("Terminamos");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (!opcion.equals("0"));
    }

}
