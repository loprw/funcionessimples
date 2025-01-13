import java.util.Scanner;

public class InicioLunes {

    //clase ejecutable pq tiene main.
    public static void main(String[] args) {
        //creamos un scan para pedir datos al usuario
        Scanner scan = new Scanner(System.in);

        //Mostramos un mensaje al usuario para pedir un número
        System.out.println("Indica un número");
        //Capturamos lo que ha escrito el usuario
        String entrada = scan.nextLine();
        //declaramos un int y guardamos en él el valor indicado por el usuario en entrada
        int numero = Integer.parseInt(entrada);

        //si estamos en la propia clase donde está el método, solo tenemos que escribir el nombre del método
        String respuesta = evaluarNumero(numero);
        System.out.println("El número " + numero + " es " + respuesta + ".");

        scan.close();
    }

    //Creamos funcion/metodo que recibira un número y nos devolverá un texto: POSITIVO,  NEGATIVO o CERO
    public static String evaluarNumero(int num) {
        if (num > 0) {
            return "POSITIVO";
        } else if (num < 0) {
            return "NEGATIVO";
        } else {
            return "CERO";
        }
    }
}
