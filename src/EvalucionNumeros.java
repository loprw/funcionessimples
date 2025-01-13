public class EvalucionNumeros {

    public static int mayorDosNumeros(int num1, int num2) {
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int menorDosNumeros(int num1, int num2) {
        if (num1 <= num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void evaluarTresNumeros(int num1, int num2, int num3) {
        //Declaramos variables para guardar los números.
        // int numMayor = 0;
        // int numMenor = 0;
        // int numIntermedio = 0;

        //Encontramos numero mayor
        // if (mayorDosNumeros(num1, num2) == num1) {
        //     if (mayorDosNumeros(num1, num3) == num1) {
        //         numMayor = num1;
        //     } else {
        //         numMayor = num3;
        //     }
        // } else {
        //     if (mayorDosNumeros(num2, num3) == num2) {
        //         numMayor = num2;
        //     } else {
        //         numMayor = num3;
        //     }
        // }

        // //Encontramos numero menor
        // if (menorDosNumeros(num1, num2) == num1) {
        //     if (menorDosNumeros(num1, num3) == num1) {
        //         numMenor = num1;
        //     } else {
        //         numMenor = num3;
        //     }
        // } else {
        //     if (menorDosNumeros(num2, num3) == num2) {
        //         numMenor = num2;
        //     } else {
        //         numMenor = num3;
        //     }
        // }

        // //Encontramos numero intermedio
        // if (numMayor == num1 && numMenor == num2) {
        //     numIntermedio = num3;
        // } else if (numMayor == num1 && numMenor == num3) {
        //     numIntermedio = num2;
        // } else if (numMayor == num2 && numMenor == num1) {
        //     numIntermedio = num3;
        // } else if (numMayor == num1 && numMenor == num3) {
        //     numIntermedio = num2;
        // } else if (numMayor == num3 && numMenor == num2) {
        //     numIntermedio = num1;
        // } else if (numMayor == num2 && numMenor == num3) {
        //     numIntermedio = num1;
        // } else if (numMayor == num3 && numMenor == num1) {
        //     numIntermedio = num2;
        // }

        //Forma más elegante

        int numMayor, numMenor, numIntermedio;

        //determinar mayor
        if (num1 >= num2 && num1 >= num3) {
            numMayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            numMayor = num2;
        } else {
            numMayor = num3;
        }

        //determinar menor
        if (num1 <= num2 && num1 <= num3) {
            numMenor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            numMenor = num2;
        } else {
            numMenor = num3;
        }

        //determinar intermedio
        int suma = num1 + num2 + num3;
        numIntermedio = suma - numMayor - numMenor;

        //Pintamos resultado
        System.out.println("El número mayor es " + numMenor + ", el número menor es " + numMenor + " y el número intermedio es " + numIntermedio + ".");
    }
}
