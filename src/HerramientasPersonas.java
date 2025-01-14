public class HerramientasPersonas {

    public static String getLetraNIF(int numeroDni) {
        
        int resultado = numeroDni - ((numeroDni / 23) * 23);
        String letra = "";

        //Segunda version
        String secuencia = "TRWAGMYFPDXBNJZSQVHLCKET";

        letra = String.valueOf(secuencia.charAt(resultado));

        // Primera version
        // if (resultado == 0) {
        //     letra = "T";
        // } else if (resultado == 1) {
        //     letra = "R";
        // } else if (resultado == 2) {
        //     letra = "W";
        // } else if (resultado == 3) {
        //     letra = "A";
        // } else if (resultado == 4) {
        //     letra = "G";
        // } else if (resultado == 5) {
        //     letra = "M";
        // } else if (resultado == 6) {
        //     letra = "Y";
        // } else if (resultado == 7) {
        //     letra = "F";
        // } else if (resultado == 8) {
        //     letra = "P";
        // } else if (resultado == 9) {
        //     letra = "D";
        // } else if (resultado == 10) {
        //     letra = "X";
        // } else if (resultado == 11) {
        //     letra = "B";
        // } else if (resultado == 12) {
        //     letra = "N";
        // } else if (resultado == 13) {
        //     letra = "J";
        // } else if (resultado == 14) {
        //     letra = "Z";
        // } else if (resultado == 15) {
        //     letra = "S";
        // } else if (resultado == 16) {
        //     letra = "Q";
        // } else if (resultado == 17) {
        //     letra = "V";
        // } else if (resultado == 18) {
        //     letra = "H";
        // } else if (resultado == 19) {
        //     letra = "L";
        // } else if (resultado == 20) {
        //     letra = "C";
        // } else if (resultado == 21) {
        //     letra = "K";
        // } else if (resultado == 22) {
        //     letra = "E";
        // } else if (resultado == 23) {
        //     letra = "T";
        // }

        return letra;
    }

    //Metodo para recibir un DNI/NIF y nos devuelva si es válido o no.
    public static boolean validarNIF(String nif) {

        int longitud = nif.length() - 1;
        int valorDni = Integer.parseInt(nif.substring(0, longitud));

        boolean dniValido = nif.endsWith(getLetraNIF(valorDni));

        return dniValido;
    }

    public static String getDiaNacimiento(int dia, int mes, int any) {

        String[] diaSemana = {"sábado", "domingo", "lunes", "martes", "miércoles", "jueves", "viernes"};
        
        if (mes == 1) {
            mes = 13;
            any--;
        } else if (mes == 2) {
            mes = 14;
            any--;
        }

        int calculo1, calculo2, calculo3, calculo4, calculo5, calculo6, resultado;

        calculo1 = (mes + 1) * 3 / 5;
        calculo2 = any / 4;
        calculo3 = any / 100;
        calculo4 = any / 400;
        calculo5 = dia + (mes * 2) + any + calculo1 + calculo2 - calculo3 + calculo4 + 2;
        calculo6 = calculo5 / 7;
        resultado = calculo5 - (calculo6 * 7);

        String diaUsuario = diaSemana[resultado];

        return diaUsuario;
    }
}
