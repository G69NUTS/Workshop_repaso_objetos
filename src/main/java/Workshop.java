import java.util.*;
import java.util.regex.Pattern;

import static java.lang.System.*;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] resultados = new int[limite];
        for (int i = 0; i < limite; i++) {
            resultados[i] = numero * (i + 1);
        }
            return resultados;
        }

        // Método que calcula el factorial de un número entero
        public int factorial (int n){
            int Factorial = 1;
            for (int i = 1; i <= n; i++) {
                Factorial *= i;
            }
            return Factorial;
        }

        // Método que verifica si un número es primo
        public boolean esPrimo ( int numero){
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }

        // Método que genera una serie de Fibonacci
        public int[] serieFibonacci ( int n){

            int[] fibonacci = new int[n];

            if (n > 0) {
                fibonacci[0] = 0;
            }
            if (n > 1) {
                fibonacci[1] = 1; 
            }
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            return fibonacci;
        }

        // Método que suma todos los elementos de un arreglo
        public int sumaElementos ( int[] arreglo){
            int Total=0;
        for (int j : arreglo) {
                Total += j;
            }
            return Total;

        }

        // Método que calcula el promedio de los elementos de un arreglo
        public double promedioElementos ( int[] arreglo) {
             int suma=0;
            for (int j : arreglo) {
                suma += j;
            }
            double promedio = (double) suma / arreglo.length;

            return (double) promedio;
        }

        // Método que encuentra el elemento mayor en un arreglo
        public int encontrarElementoMayor ( int[] arreglo){
            int mayor = arreglo[0];
            for (int i = 1; i < arreglo.length; i++) {
                if (arreglo[i] > mayor) {
                    mayor = arreglo[i];
                }
            }
            return mayor;
        }

        // Método que encuentra el elemento menor en un arreglo
        public int encontrarElementoMenor ( int[] arreglo){

            int menor = arreglo[0];

            for (int i = 1; i < arreglo.length; i++) {
                if (arreglo[i] < menor) {
                    menor = arreglo[i];
                }
            }

            return menor;
        }

        // Método que busca un elemento en un arreglo
        public boolean buscarElemento ( int[] arreglo, int elemento){

            for (int j : arreglo) {
                if (j == elemento) {
                    return true;
                }
            }
            return false;
        }

        // Método que invierte un arreglo
        public int[] invertirArreglo ( int[] arreglo){
            int [] arregloInvertido = new int[arreglo.length];
            for (int i = 0; i < arreglo.length; i++) {
                arregloInvertido[i] = arreglo[arreglo.length - 1 - i];
            }
            return arregloInvertido;
        }

        // Método que ordena un arreglo en orden ascendente
        public int[] ordenarArreglo ( int[] arreglo){

            int n = arreglo.length;

            for (int j = 0; j < n - 1; j++) {
                for (int i = 0; i < n - 1 - j; i++) {
                    if (arreglo[i] > arreglo[i + 1]) {
                        int Sol = arreglo[i];
                        arreglo[i] = arreglo[i + 1];
                        arreglo[i + 1] = Sol;
                    }
                }
            }
            return arreglo;
        }

        // Método que elimina los duplicados de un arreglo
        public int[] eliminarDuplicados ( int[] arreglo){

            Set<Integer> conjunto = new LinkedHashSet<>();

            // Añadimos cada elemento del arreglo al conjunto (los duplicados se eliminan automáticamente)
            for (int num : arreglo) {
                conjunto.add(num);
            }

            // Convertimos el conjunto nuevamente a un arreglo
            int[] arregloSinDuplicados = new int[conjunto.size()];
            int i = 0;
            for (int num : conjunto) {
                arregloSinDuplicados[i++] = num;
            }

            return arregloSinDuplicados;

            // TODO: Implementar el método para eliminar los duplicados de un arreglo.
            // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        }

        // Método que combina dos arreglos en uno solo
        public int[] combinarArreglos ( int[] arreglo1, int[] arreglo2){

            int[] arregloCombinado = new int[arreglo1.length + arreglo2.length];

            // Copiamos los elementos del primer arreglo en el nuevo arreglo
            arraycopy(arreglo1, 0, arregloCombinado, 0, arreglo1.length);

            // Copiamos los elementos del segundo arreglo en el nuevo arreglo, después del primero
            arraycopy(arreglo2, 0, arregloCombinado, arreglo1.length + 0, arreglo2.length);

            return arregloCombinado;

        }

        // Método que rota un arreglo n posiciones
        public int[] rotarArreglo ( int[] arreglo, int posiciones){
            int tamaño = arreglo.length;
            if (posiciones < 0) {
                posiciones = tamaño + (posiciones % tamaño);
            } else {
                posiciones = posiciones % tamaño;
            }
            int[] arregloRotado = new int[tamaño];
            for (int i = 0; i < tamaño; i++) {
                arregloRotado[(i + posiciones) % tamaño] = arreglo[i];
            }
            return arregloRotado;
        }

        // Método que cuenta los caracteres en una cadena
        public int contarCaracteres (String cadena){
            return cadena.length();
        }

        // Método que invierte una cadena
        public String invertirCadena (String cadena){

            StringBuilder cadenaInvertida = new StringBuilder();

            for (int i = cadena.length() - 1; i >= 0; i--) {
                cadenaInvertida.append(cadena.charAt(i));
            }
            return cadenaInvertida.toString();

        }

        // Método que verifica si una cadena es un palíndromo
        public boolean esPalindromo (String cadena){

            String cadenaLimpiada = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            StringBuilder cadenaInvertida = new StringBuilder();

            for (int i = cadenaLimpiada.length() - 1; i >= 0; i--) {
                cadenaInvertida.append(cadenaLimpiada.charAt(i));
            }

            return cadenaLimpiada.contentEquals(cadenaInvertida);
        }

        // Método que cuenta el número de palabras en una cadena
        public int contarPalabras (String cadena){

            String[] palabras = cadena.trim().split("\\s+");

            return palabras.length > 0 && !palabras[0].isEmpty() ? palabras.length : 0;

        }

        // Método que convierte una cadena a mayúsculas
        public String convertirAMayusculas (String cadena){
            // TODO: Implementar el método para convertir una cadena a mayúsculas.
            // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
            return cadena.toUpperCase();
        }

        // Método que convierte una cadena a minúsculas
        public String convertirAMinusculas (String cadena){
            return cadena.toLowerCase();
        }

        // Método que reemplaza una subcadena en una cadena por otra subcadena
        public String reemplazarSubcadena (String cadena, String antiguaSubcadena, String nuevaSubcadena){
            return cadena.replace(antiguaSubcadena,nuevaSubcadena);
        }

        // Método que busca una subcadena en una cadena y retorna su índice
        public int buscarSubcadena (String cadena, String subcadena){
            return cadena.indexOf(subcadena);
        }

        // Método que valida un correo electrónico
        public boolean validarCorreoElectronico (String correo){

            String regex = "^[\\w-.]+@[\\w-]+\\.[a-z]{2,}$";

            // Utiliza Pattern para validar el correo según la expresión regular
            return Pattern.matches(regex, correo);


            // TODO: Implementar el método para validar un correo electrónico.
            // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        }

        // Método que calcula el promedio de una lista de números

        public double promedioLista (List < Integer > lista) {
            if (lista.isEmpty()) {
                return 0;
            }
            int suma = 0;
            for (int numero : lista) {
                suma += numero;
            }
            return (double) suma / lista.size();

        }

        // Método que convierte un número en su representación binaria
        public String convertirABinario ( int numero){
            if (numero < 0) {
                return "-" + Integer.toBinaryString(Math.abs(numero));
            } else {
                return  Integer.toBinaryString(numero);
            }

        }

        // Método que convierte un número en su representación hexadecimal
        public String convertirAHexadecimal ( int numero){
            if(numero<0){
                return "-" + Integer.toHexString(Math.abs(numero));
            }else{
            return Integer.toHexString(numero);
            }
        }

        // Método para el juego de piedra, papel, tijera, lagarto, Spock
        public String jugarPiedraPapelTijeraLagartoSpock (String eleccionUsuario){

            String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
            String eleccionComputadora = obtenerEleccionComputadora(opciones);

            // Retorna el resultado del juego dependiendo de las elecciones
            if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
                return "Empate, ambos eligieron " + eleccionUsuario;
            }

            // Verifica si el usuario ganó
            if (ganoUsuario(eleccionUsuario, eleccionComputadora)) {
                return "Ganaste, " + eleccionUsuario + " vence a " + eleccionComputadora;
            } else {
                return "Perdiste, " + eleccionComputadora + " vence a " + eleccionUsuario;
            }
        }

    // Método para verificar si el usuario gana según las reglas del juego
    private static boolean ganoUsuario(String usuario, String computadora) {
        return switch (usuario.toLowerCase()) {
            case "piedra" -> computadora.equals("Tijera") || computadora.equals("Lagarto");
            case "papel" -> computadora.equals("Piedra") || computadora.equals("Spock");
            case "tijera" -> computadora.equals("Papel") || computadora.equals("Lagarto");
            case "lagarto" -> computadora.equals("Spock") || computadora.equals("Papel");
            case "spock" -> computadora.equals("Tijera") || computadora.equals("Piedra");
            default -> false; // Si la elección del usuario no es válida
        };
    }

    private static String obtenerEleccionComputadora(String[] opciones) {
        Random random = new Random();
        int indice = random.nextInt(opciones.length);
        return opciones[indice];
    }

        public String pptls2 (String game[]){
            //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
            return "";
        }

        public double areaCirculo ( double radio){
            double AREAR = 0;
            AREAR = Math.PI * Math.pow(radio, 2);
            return AREAR;
        }

        public String zoodiac ( int day, int month) {
            return "";

        }

}

