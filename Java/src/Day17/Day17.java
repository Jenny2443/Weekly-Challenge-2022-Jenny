package Day17;
/*
 * Reto #17
 * LA CARRERA DE OBSTÁCULOS
 * Fecha publicación enunciado: 25/04/22
 * Fecha publicación resolución: 02/05/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla) será correcto y no
 *        variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Day17 {
    public static void completed(String[] actions, String track){
        boolean complete = true;
        String res = "";
        int i = 0;
        while(i < actions.length && complete){
            if(actions[i].equals("jump") && track.charAt(i) != '|'){
                res += "x";
                complete = false;
            }else if(actions[i].equals("run") && track.charAt(i) != '_'){
                res += "/";
                complete = false;
            }else{
                res += track.charAt(i);
                i++;
            }
        }
        System.out.println("Complete: " + complete);
        System.out.println("Track: " + res);
    }

    public static void main(String[] args) {
        //TEST
        String[] action1 = {"jump","jump","run"};
        String track1 = "_|_";
        completed(action1,track1);

        String[] action2 = {"jump","run","run"};
        String track2 = "|__";
        completed(action2,track2);

        String[] action3 = {"run","run","run"};
        String track3 = "__|";
        completed(action3,track3);

        String[] action4 = {"run","run","run","jump","run","jump"};
        String track4 = "___|_|";
        completed(action4,track4);
    }
}
