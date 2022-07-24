package Day16;
/*
 * Reto #16
 * EN MAYÚSCULA
 * Fecha publicación enunciado: 18/04/22
 * Fecha publicación resolución: 25/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Day16 {
    public static String toUpper(String str){
        String[] words = str.split(" "); //Separamos las palabras
        StringBuilder sb = new StringBuilder(); //Creamos un StringBuilder para poder concatenar las palabras
        for (String word : words) {
            sb.append(word.substring(0, 1).toUpperCase()); //Concatenamos la primera letra de cada palabra en mayúscula
            sb.append(word.substring(1)); //Concatenamos el resto de la palabra
            sb.append(" "); //Añadimos un espacio para separar las palabras
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //TEST
        System.out.println(toUpper("hola mundo"));
        System.out.println(toUpper("hola que tal"));
        System.out.println(toUpper("hello world"));
        System.out.println(toUpper("hello my name is"));
    }
}
