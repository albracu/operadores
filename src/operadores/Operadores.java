package operadores;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        int primernumero, segundonumero, resultadosuma, resultadoresta, resultadomult, resultadodiv;
        primernumero = 10;
        segundonumero = 3;
        resultadosuma = primernumero + segundonumero;
        resultadoresta = primernumero - segundonumero;
        resultadomult = primernumero * segundonumero;
        resultadodiv = primernumero / segundonumero;

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Marque el numero deacuerdo a la operacion: \n 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division");

        for ( int i = 0; i < 10; i++ ) {

            int value = ingreso.nextInt();

            if ( value != 0) {

                switch (value) {

                    case 1:
                        System.out.println("El resultado de la Suma es: " + resultadosuma);
                        break;

                    case 2:
                        System.out.println("El resultado de la Resta es: " + resultadoresta);
                        break;

                    case 3:

                        System.out.println("El resultado de la Multiplicacion es: " + resultadomult);
                        break;

                    case 4:
                        System.out.println("El resultado de la Division es: " + resultadodiv);
                        break;

                    default:
                        System.out.println("El valor ingresado no es permitido o marque 0 para salir ");
                        break;

                }
            }else {
                System.out.println("Hasta luego!! ");
            }
        }
    }
}
