package Day19;
/*
 * Reto #19
 * CONVERSOR TIEMPO
 * Fecha publicación enunciado: 09/05/22
 * Fecha publicación resolución: 16/05/22
 * Dificultad: FACIL
 *
 * Enunciado: Crea una función que reciba días, horas, minutos y segundos (como enteros) y retorne su resultado en milisegundos.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Day19 {
    /*
    * 1 día tiene 86400000 milisegundos
    * 1 hora tiene 3600000 milisegundos
    * 1 minuto tiene 60000 milisegundos
    * 1 segundo tiene 1000 milisegundos
     * */
    public static long toMilliseconds(int days, int hours, int minutes, int seconds) {
        return (days * 86400 + hours * 3600 + minutes * 60 + seconds) * 1000;
    }

    public static void main(String[] args) {
        //TEST
        System.out.println(toMilliseconds(0, 0, 0, 0)); // 0
        System.out.println(toMilliseconds(0, 0, 0, 1)); // 1000
        System.out.println(toMilliseconds(0, 0, 1, 0)); // 60000
        System.out.println(toMilliseconds(0, 1, 0, 0)); // 3600000
        System.out.println(toMilliseconds(1, 0, 0, 0)); // 86400000
        System.out.println(toMilliseconds(1, 1, 1, 1)); // 90061000
        System.out.println(toMilliseconds(1, 2, 2, 1)); // 93721000
    }
}
