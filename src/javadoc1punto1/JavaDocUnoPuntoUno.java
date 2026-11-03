/**
 * Clase de utilidades que proporciona métodos estáticos para operaciones comunes,
 * como comprobaciones matemáticas, cálculos geométricos y manipulación de cadenas.
 * 
 * @author cdelb
 * @version 1.0
 */
public class Utilidades {

    /**
     * Comprueba si un número entero es par.
     * 
     * @param numero El número entero que se desea comprobar.
     * @return true si el número es par, false en caso contrario.
     */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    /**
     * Determina cuál es el mayor de tres números enteros dados.
     * 
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @param c Tercer número entero.
     * @return El valor mayor de los tres números.
     */
    public static int mayorDeTres(int a, int b, int c) {
        int mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        return mayor;
    }

    /**
     * Calcula el área de un rectángulo a partir de su base y su altura.
     * 
     * @param base   La base del rectángulo (en unidades de longitud).
     * @param altura La altura del rectángulo (en unidades de longitud).
     * @return El área calculada del rectángulo.
     */
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    /**
     * Comprueba si una cadena de texto empieza por una letra determinada.
     * 
     * @param texto La cadena de texto a evaluar.
     * @param letra El carácter con el que se desea comprobar si empieza el texto.
     * @return true si el texto comienza con la letra especificada (distinguiendo mayúsculas/minúsculas), false en caso contrario.
     */
    public static boolean empiezaPor(String texto, char letra) {
        return texto.charAt(0) == letra;
    }

    /**
     * Muestra por consola la tabla de multiplicar de un número del 1 al 10.
     * 
     * @param numero El número del cual se va a generar e imprimir la tabla de multiplicar.
     */
    public static void mostrarTabla(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    /**
     * Método principal (punto de entrada) de la aplicación para probar las funcionalidades.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        System.out.println("¿7 es par? " + esPar(7));
        System.out.println("Mayor de 4, 9 y 2: " + mayorDeTres(4, 9, 2));
        System.out.println("Área de 5 x 3: " + areaRectangulo(5, 3));
        System.out.println("¿\"Hola\" empieza por H? "
                + empiezaPor("Hola", 'H'));
        mostrarTabla(3);
    }
}