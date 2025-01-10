public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Correcto!!");
        mostrarSaludo();
        mostrarSaludoParam("Jose");//llamadas dinámicas dependiendo del valor del parámetro
        int anyo = recuperarAnyo();
        System.out.println(anyo);//si solo se llama, el valor se pierde pq no lo capturamos
        int valor = numeroDoble(5);
        System.out.println(valor);//llamadas dinámicas dependiendo del valor del parámetro
        int suma = sumarNumeros(4, 5);
        System.out.println(suma);
        comprobarParImpar(3);
        int valor1 = 0;
        int valor2 = 78;
        int valor3 = -15;
        System.out.println("El número " + valor1 + " es " + comprobarSigno(valor1) + ", el número " + valor2 + " es " + comprobarSigno(valor2) +
         ", y el número " + valor3 + " es " + comprobarSigno(valor3) + ".");
    }

    //metodo void que muestre un saludo
    public static void mostrarSaludo() {
        //Instrucciones
        System.out.println("Soy la primera función void");
    }

    //metodo con return
    public static int recuperarAnyo() {
        //Instrucciones
        return 2025;
    }

    //metodo void con parametro
    public static void mostrarSaludoParam(String nombre) {
        //Instrucciones
        System.out.println("Bienvenido/a a " + nombre);
    }

    //metodo con return con parametro
    public static int numeroDoble(int numero) {
        return numero * 2;
    }

    //metodo con return con dos parametros
    public static int sumarNumeros(int num1, int num2) {
        int sumar = num1 + num2;
        return sumar;
    }

    //funcion que indica si numero es par o impar
    public static void comprobarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }

    //Creamos una nueva función dentro de la misma clase que recibirá un número, se debe devolver si el número recibido es positivo, negativo o cero
    public static String comprobarSigno(int numero) {
        String signo = "";
        if (numero < 0) {
            signo = "NEGATIVO";
        } else if (numero > 0) {
            signo = "POSITIVO";
        } else {
            signo = "CERO";
        }
        
        return signo;
    }

}
