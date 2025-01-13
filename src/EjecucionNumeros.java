import java.util.Scanner;

/*Ejercicio:
 *
 * Vamos a tener 2 clases
 * 1 EvaluacionNumeros: que tendrá dos métodos
 *  - mayorDosNumeros(num1, num2), devolverá el mayor de dos números.
 *  - menorDosNumeros(num1, num2), devolverá el menor de dos números.
 *  - evaluarTresNumeros(num1, num2, num3), recibirá tres números y nos mostrará el número mayor, el número menor y el intermedio.
 * 2 EjecucionNumeros: que tendrá el método main() donde pediremos dos números y llamaremos a los métodos de la clase EvaluacionNumeros.
 */
public class EjecucionNumeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Indica un primer número:");
        String dato = scan.nextLine();
        int numero1 = Integer.parseInt(dato);

        System.out.println("Indica un segundo número:");
        dato = scan.nextLine();
        int numero2 = Integer.parseInt(dato);

        System.out.println("Indica un tercer número:");
        dato = scan.nextLine();
        int numero3 = Integer.parseInt(dato);

        System.out.println("El número mayor entre " + numero1 + " y " + numero2 + " es: " + EvalucionNumeros.mayorDosNumeros(numero1, numero2));
        System.out.println("El número menor entre " + numero1 + " y " + numero2 + " es: " + EvalucionNumeros.menorDosNumeros(numero1, numero2));
        EvalucionNumeros.evaluarTresNumeros(numero1, numero2, numero3);

        scan.close();
    }
}
