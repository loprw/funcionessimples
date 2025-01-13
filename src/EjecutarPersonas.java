import java.util.Scanner;

/*
 * Crear dos clases, EjecutarPersonas y HerramientasPersonas.
 * En EjecutarPersonas se pedirán los datos para y los resultados de los métodos de HerramientasPersonas
 * En HerramientasPersonas tendremos 3 métodos:
 *  - getLetraNIF, donde pasamos un numero de dni y nos devuelve la letra asociada.
 *  - validarNIF, donde pasamos un dni completo y nos indica si es correcto.
 *  - 
 */

public class EjecutarPersonas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el numero el NIF: ");
        String textoDni = scan.nextLine();
        int numeroDni = Integer.parseInt(textoDni);

        String letraDni = HerramientasPersonas.getLetraNIF(numeroDni);
        System.out.println("La letra del DNI " + numeroDni + " es " + letraDni + ".");

        System.out.println("Introduzca un NIF completo: ");
        String textoNif = scan.nextLine();

        System.out.println("¿Es válido el NIF? " + (HerramientasPersonas.validarNIF(textoNif)?"Sí.":"No."));

        scan.close();
    }
}
