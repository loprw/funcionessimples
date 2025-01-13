import java.util.Scanner;

public class Ejecucion {

    public static void main(String[] args) {
        
        //si necesitamos llamar a métodos/funciones de otras clases, simplemente escribimos el nombre de la clase y el método

        //preparamos el scan para pedir al usuario dos número y los almacenamos.
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduza un primer número:");
        String entrada = scan.nextLine();
        int numero1 = Integer.parseInt(entrada);
        System.out.println("Introduzca un segundo número:");
        entrada = scan.nextLine();
        int numero2 = Integer.parseInt(entrada);

        //Creamos un menú para los opciones del usuario
        // System.out.println("------------------");
        // System.out.println("Seleccione una opción:");
        // System.out.println("1.- Sumar");
        // System.out.println("2.- Restar");
        // System.out.println("3.- Multiplicar");
        // System.out.println("4.- Dividir");

        Calculadora.mostrarMenu();

        //Capturamos lo que ha escrito el usuario, y de ahí la opción escogida
        entrada = scan.nextLine();
        int opcion = Integer.parseInt(entrada);

        int resultado = 0;
        switch (opcion) {
        case 1: resultado = Calculadora.sumarNumeros(numero1, numero2); break;
        case 2: resultado = Calculadora.restarNumeros(numero1, numero2); break;
        case 3: resultado = Calculadora.multiplicarNumeros(numero1, numero2); break;
        case 4: resultado = Calculadora.dividirNumeros(numero1, numero2); break;
        }

        System.out.println("Resultado: " + resultado);

        scan.close();
    }
}
