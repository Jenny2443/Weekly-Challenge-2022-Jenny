package Day7;

/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */


public class Day7 {
    //Aux
    public static int repWord(String word, String s){
        int res = 0;
        String[] wordArray = s.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        for (int i = 0; i < wordArray.length; i++) {
            if(word.toLowerCase().equals(wordArray[i])){
                res++;
            }
        }
        return res;
    }

    //Sin tener en cuenta signos
    public static void countWords(String s){
        int res = 0;
        s = s.toLowerCase(); //Minuscula para evitar problemas
        String[] arrayWords = s.split(" "); //Cojo cada palabra para el array
        for (int i = 0; i < arrayWords.length; i++) {
            res = repWord(arrayWords[i], s); //Funcion auxiliar para conteo especifico
            System.out.println(arrayWords[i] + " " + res);
        }

    }
    //Teniendo en cuenta
    public static void countWords2(String s){
        int res = 0;
        s = s.toLowerCase();
        String[] array = s.replaceAll("[^a-zA-Z ]",
                "").toLowerCase().split("\\s+");
                //Arra dividido por espacios remplazando cualquier simbolo de puntuacion por vacio
            for (int i = 0; i < array.length; i++) {
                res = repWord(array[i],s);
                System.out.println(array[i] + " " + res);
        }
    }

    public static void main(String[] args) {
       //countWords("Hello World Hello");
       //countWords("Y así como suele decirse el gato al rato, el rato a la cuerda, la cuerda al palo; daba el arriero a Sancho, Sancho a la moza, la moza a él, el ventero a la moza");
        countWords2("Hello, World Hello:");
    }
}
