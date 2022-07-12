package Day10;
/*
 * Reto #10
 * EXPRESIONES EQUILIBRADAS
 * Fecha publicación enunciado: 07/03/22
 * Fecha publicación resolución: 14/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Day10 {
    public static boolean parethesisClosed(String s){
        int open = 0;
        int closed = 0;
        for (int i = 0; i < s.length(); i++) { //Conteo de abiertos y cerrados
            if(s.charAt(i) == '('){
                open++;
            }else if(s.charAt(i) == ')'){
                closed++;
            }
        }
        return open == closed;
    }

    public static boolean bracesClosed(String s){
        int open = 0;
        int closed = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{'){
                open++;
            }else if(s.charAt(i) == '}'){
                closed++;
            }
        }
        return open == closed;
    }

    public static boolean balanced(String s){
        return parethesisClosed(s) && bracesClosed(s); //Se tienen q cumplir los 2
    }


    public static void main(String[] args) {
        System.out.println(parethesisClosed("(fjskle)"));
        System.out.println(parethesisClosed("(f(jsk)le)"));

        System.out.println(bracesClosed("{}{dfds}"));
        System.out.println(bracesClosed("{{dfds}"));
        System.out.println(bracesClosed("{(}{dfds)}"));

        System.out.println(balanced("(fjskle)"));
        System.out.println(balanced("{dfds}"));
        System.out.println(balanced("{(}{dfds)}"));

    }
    
}
