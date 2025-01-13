public class Calculadora {

    //Esta clase es una herramienta, por si misma no sirve de nada, necesita una clase con método main
    //Simplemente tendrá un método o varios para realizar operaciones matemáticas
    public static void mostrarMenu() {
        System.out.println("------------------");
        System.out.println("Seleccione una opción:");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("------------------");
    }

    public static int sumarNumeros(int num1, int num2) {
        int operacion = num1 + num2;
        return operacion;
    }

    public static int restarNumeros(int num1, int num2) {
        int operacion = num1 - num2;
        return operacion;
    }

    public static int multiplicarNumeros(int num1, int num2) {
        int operacion = num1 * num2;
        return operacion;  
    }

    public static int dividirNumeros(int num1, int num2) {
        int operacion = num1 / num2;
        return operacion;  
    }
}
