package Day2;
/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Fecha publicación enunciado: 10/01/22
 * Fecha publicación resolución: 17/01/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Day2 {
    /*
    * Como fibonacci empieza con 0 (n0) y 1(n1), para los 50 numeros un for()
    * el numero fibonacci es n0 + n1 y actualizo los valores de n0 y n1 para la siguiente vuelta
    * */
    public static void fibonacci(){
        double n0 = 0;
        double n1 = 1;
        double nfib;
        for (int i = 0; i < 50; i++) {
            System.out.println(n0);
            nfib = n0 + n1;
            n0 = n1;
            n1 = nfib;
        }
    }

    public static void main(String[] args) {
        fibonacci();
    }
}
