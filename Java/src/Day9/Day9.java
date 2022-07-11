package Day9;
/*
 * Reto #9
 * CÓDIGO MORSE
 * Fecha publicación enunciado: 02/03/22
 * Fecha publicación resolución: 07/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */


public class Day9 {

    private static char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0'};
    private static String[] morseLetters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","|","  "};

    //Respetando espacios
    public static String morseToString(String morse){
        String res = "";
        String[] words = morse.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals("")) {
                res += " ";
            }
            for (int k = 0; k < morseLetters.length; k++) {
                if(words[i].equals(morseLetters[k])){
                    res += letters[k];
                }
            }
        }
        return res;
    }

    public static String stringToMorse(String string){
        string = string.toLowerCase();
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == ' ') { //Para espacio
                res += "  ";
            }
            for (int j = 0; j < letters.length; j++) {
                if(string.charAt(i) == letters[j]){
                    res += morseLetters[j] + " ";
                }
            }
        }
        return res;
    }


    //Sirve para palabras sueltas, las frases no contienen espacios
    public static String morseToString2(String morse){
        String res = "";
        String[] words = morse.split(" ");
        //Separo las letras
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < morseLetters.length; j++) {
                if(words[i].equals("  ")){
                    res += " ";
                }else{
                    if(words[i].equals(morseLetters[j])){ //Correspondiente indice
                        res += letters[j];
                    }
                }
            }
        }
        return res;
    }

    /*public static void morseToString2(String m){
        String res = "";
        String cur = "";
        String[] words1 = m.split("  ");
        for (int i = 0; i < words1.length; i++) {
            System.out.println(words1[i]);
        }
        for (int i = 0; i < words1.length; i++) {
            for (int j = 0; j < words1[i].length(); j++) {
                if(words1[i].charAt(j) != ' ') {
                    cur += words1[i].charAt(j);
                }else{
                    res += morseToString(cur);
                    cur = "";
                }
                res += " ";
            }
            res += " ";
        }
        System.out.println(res);
    }*/


    public static void main(String[] args) {
        System.out.println(morseToString(".... . .-.. .-.. ---  .-- --- .-. .-.. -.."));
        System.out.println(morseToString("-- .- -.. .-. .. -..  .. ...  .. -.  ... .--. .- .. -."));

        System.out.println(morseToString2("... -.-. .... --- --- .-.."));
        System.out.println(morseToString2("... .--. .- .. -."));

        System.out.println(stringToMorse("Alice"));
        System.out.println(stringToMorse("school"));
        System.out.println(stringToMorse("Hello World"));

    }
    
}