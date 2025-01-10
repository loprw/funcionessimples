import java.util.Scanner;

public class FinViernes {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Introduce un número:");
        //Capturamos el String numerico que el usuario ha introducido
        String dato = scan.nextLine();

        //Convertimos el texto a número
        int numero = Integer.parseInt(dato);

        System.out.println("El número " + numero + " es " + evaluarNumero(numero) + ".");

        scan.close();
    }
    
    public static String evaluarNumero(int numero) {
        String signo = "";
        if (numero > 0) {
            signo = "POSITIVO";
        } else if (numero < 0) {
            signo = "NEGATIVO";
        } else {
            signo = "CERO";
        }
        
        return signo;
    }
}
