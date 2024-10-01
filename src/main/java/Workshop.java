import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

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

            // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
            // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
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
            boolean intercambio;

            // Recorrer el arreglo
            for (int i = 0; i < n - 1; i++) {
                intercambio = false;  // Inicializar la bandera de intercambio
                // Comparar elementos adyacentes
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        // Intercambiar los elementos si están en el orden incorrecto
                        int Sol = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = Sol;
                        intercambio = true;  // Marcar que se ha realizado un intercambio
                    }
                }
            }
            // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
            // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
            return new int[0];
        }

        // Método que elimina los duplicados de un arreglo
        public int[] eliminarDuplicados ( int[] arreglo){

           return new int[0];
            // TODO: Implementar el método para eliminar los duplicados de un arreglo.
            // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        }

        // Método que combina dos arreglos en uno solo
        public int[] combinarArreglos ( int[] arreglo1, int[] arreglo2){

            int[] vectorResultado = new int[10]; // Crear un vector para almacenar el resultado
            for (int i = 0; i < 10; i++) {
                vectorResultado[i] = arreglo1[i] + arreglo2[i]; // Sumar elementos correspondientes
            }
            return vectorResultado;
            // TODO: Implementar el método para combinar dos arreglos en uno solo.
            // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        }

        // Método que rota un arreglo n posiciones
        public int[] rotarArreglo ( int[] arreglo, int posiciones){

            int longitud = arreglo.length;

            int[] nuevoArreglo = new int[longitud];

            for (int i = 0; i < longitud; i++) {
                // Calcular la nueva posición
                int nuevaPosicion = (i + posiciones) % longitud;
                nuevoArreglo[nuevaPosicion] = arreglo[i];
            }

            return nuevoArreglo;  // Devolver el nuevo arreglo desplazado
            // TODO: Implementar el método para rotar un arreglo n posiciones.
            // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].

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
            // TODO: Implementar el método para validar un correo electrónico.
            // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
            return false;
        }

        // Método que calcula el promedio de una lista de números

        public double promedioLista (List < Integer > lista) {
            // TODO: Implementar el método para calcular el promedio de una lista de números.
            // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
            return 0.0;
        }

        // Método que convierte un número en su representación binaria
        public String convertirABinario ( int numero){
            // TODO: Implementar el método para convertir un número en su representación binaria.
            // Ejemplo: Si numero = 10, el resultado debería ser "1010".
            return "";
        }

        // Método que convierte un número en su representación hexadecimal
        public String convertirAHexadecimal ( int numero){
            // TODO: Implementar el método para convertir un número en su representación hexadecimal.
            // Ejemplo: Si numero = 255, el resultado debería ser "FF".
            return "";
        }

        // Método para el juego de piedra, papel, tijera, lagarto, Spock
        public String jugarPiedraPapelTijeraLagartoSpock (String eleccionUsuario){
            // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
            // Las reglas del juego son:
            // - Piedra vence a Tijera y Lagarto
            // - Papel vence a Piedra y Spock
            // - Tijera vence a Papel y Lagarto
            // - Lagarto vence a Spock y Papel
            // - Spock vence a Tijera y Piedra


            // El método debe retornar un mensaje indicando el resultado del juego.
            // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
            return "";
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

