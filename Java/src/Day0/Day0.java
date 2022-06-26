package Day0;

public class Day0 {
    /*
     * Reto #0
     * EL FAMOSO "FIZZ BUZZ"
     * Fecha publicación enunciado: 27/12/21
     * Fecha publicación resolución: 03/01/22
     * Dificultad: FÁCIL
     * AUTOR: JENNIFER ZHAO JIN
     *
     * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     *
     * Información adicional:
     * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
     * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
     * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
     * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
     *
     */

    /*PLANTEAMIENTO
    *   Se realiza un bucle para q vaya desde el 1-100,
    *   comprobando si es divisible entre 5 y 3 ya que es la condición
    *   más restrictiva, posteriormente pasamos a 5 y 3 y sino el nº
    * */

    public static void FizzBuzz(){
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){ //Tambien i % 15 == 0
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz();
    }
}
