package Day22;
/*
 * Reto #22
 * CONJUNTOS
 * Fecha publicación enunciado: 01/06/22
 * Fecha publicación resolución: 07/06/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Day22 {

    public static boolean isOnS2(String[] s1, String[] s2, String c){ //Búsqueda de String en S2
        boolean esta = false;
        int i = 0;
        while(i < s2.length && !esta){
            if(s2[i].equals(c)){
                esta = true;
            }else{
                i++;
            }
        }
        return esta;
    }

    public static boolean isOnS1(String[] s1, String[] s2, String c){ //Búsqueda de String en S1
        boolean is = false;
        int i = 0;
        while (i < s1.length && !is){
            if(s1[i].equals(c)){
                is = true;
            }else{
                i++;
            }
        }
        return is;
    }

    public static void common(boolean b, String[] s1, String[] s2){
        if(b){ //Si es true -> Result1
            String result1 = "";
            for (int i = 0; i < s2.length; i++) {
                if(isOnS2(s1,s2,s1[i])){
                    result1 += s1[i];
                }
            }
            System.out.println("Result1 " + result1);
        }else{ //Si b es false -> Result2
            String result2 = "";
            for (int i = 0; i < s2.length; i++) { //Adicion de las q stan en s1 y no en s2
                if(!isOnS2(s1,s2,s1[i])){
                    result2 += s1[i];
                }
            }
            for (int i = 0; i < s1.length; i++) { //Añadir las q stan en s2 y no en s1
                if(!isOnS1(s1,s2,s2[i])){
                    result2 += s2[i];
                }
            }
            System.out.println("Result2 "+ result2);
        }
    }

    public static void main(String[] args) {
        //TEST
        String[] s1 = {"a","b","g","e"};
        String[] s2 = {"h", "o","a", "u"};
        common(true,s1,s2);
        common(false,s1,s2);

        String[] s3 = {"h","e","l","l","o"};
        String[] s4 = {"h", "o","l", "a"};
        common(true,s3,s4);
        String[] s5 = {"h","e","l","l","o"};
        String[] s6 = {"h", "o","l", "a","a"};
        common(false,s5,s6);

        String[] s7 = {"s","t","r","i","n","g","s"};
        String[] s8 = {"p", "a","l", "a","b","r","a"};
        common(true,s7,s8);
        common(false,s7,s8);
    }
}
