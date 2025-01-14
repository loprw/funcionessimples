import java.util.Scanner;

/*
 * Crear dos clases, EjecutarPersonas y HerramientasPersonas.
 * En EjecutarPersonas se pedirán los datos para y los resultados de los métodos de HerramientasPersonas
 * En HerramientasPersonas tendremos 3 métodos:
 *  - getLetraNIF, donde pasamos un numero de dni y nos devuelve la letra asociada.
 *  - validarNIF, donde pasamos un dni completo y nos indica si es correcto.
 *  - getDiaNacimiento, donde pasamos una fecha de nacimiento y devuelve un día de la semana.
 * 
 * Los cálculos para el último método son los siguientes.
 * 
 * Lo primero de todo, si el mes es enero, se restará uno al año y el número de mes será 13.
 * Si el mes es febrero, se restará uno al año, y el número de mes será 14.
 * 
 * Los cálculos a realizar son:
 * 1- Multiplicar mes más 1 por 3 y dividirlo entre 5.
 * 2- Dividir el año entre 4.
 * 3- Dividir el año entre 100.
 * 4- Dividir el año entre 400.
 * 5- Sumar el día, el doble del mes, el año, el resultado del primer cálculo, el resultado del segundo cálculo, restar el resultado del tercer
 * cálculo y sumar el resultado del cuarto cálculo más 2.
 * 6- Dividir el resultado del quinto cálculo entre 7.
 * 7- Restar el número del paso 5 al número del paso 6 multiplicado por 7.
 * 8- Miramos la tabla y vemos a qué día corresponde el resultado del séptimo cálculo.
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

        System.out.println("Indica una fecha, siendo D día, M mes y A año; con el formato DD/MM/AAAA." +
        "\nPor ejemplo, el 1 de enero de 2009 es 01/01/2009.");
        String fechaUsuario = scan.nextLine();
        int dia, mes, any;
        String[] fechaBruta = fechaUsuario.split("/");
        dia = Integer.parseInt(fechaBruta[0]);
        mes = Integer.parseInt(fechaBruta[1]);
        any = Integer.parseInt(fechaBruta[2]);

        System.out.println("La fecha " + fechaUsuario + " es, fue o será un día " + HerramientasPersonas.getDiaNacimiento(dia, mes, any) + ".");

        scan.close();
    }
}
