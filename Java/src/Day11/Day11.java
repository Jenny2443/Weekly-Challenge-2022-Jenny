package Day11;
/*
 * Reto #11
 * ELIMINANDO CARACTERES
 * Fecha publicación enunciado: 14/03/22
 * Fecha publicación resolución: 21/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Day11 {
    //Comprobar si el char esta en el str
    public static boolean esta(String str,char c){
        str = str.toLowerCase();
        boolean esta = false;
        int i = 0;
        while(i < str.length() && !esta){
            if(str.charAt(i) == c){
                esta = true;
            }else{
                i++;
            }
        }
        return esta;
    }

    //out1
    public static String out1(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        String out1 = "";
        for (int i = 0; i < str1.length(); i++) {
            if(!esta(str2,str1.charAt(i))){
                out1 += str1.charAt(i);
            }
        }
        return out1;
    }

    //out2
    public static String out2(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        String out2 = "";
        for (int i = 0; i < str2.length(); i++) {
            if(!esta(str1,str2.charAt(i))){
                out2 += str2.charAt(i);
            }
        }
        return out2;
    }

    //out1 y out2
    public static void newString(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        String out1 = out1(str1,str2);
        String out2 = out2(str1,str2);
        System.out.println("Out1: " + out1);
        System.out.println("Out2: " + out2);
    }


    public static void main(String[] args) {
        //TEST
        System.out.println(out1("hola","olu")); //ha
        System.out.println(out1("julio","sjfi")); //ulo
        System.out.println(out1("Judia","Vuelo")); //jdia

        System.out.println("---------");

        System.out.println(out2("hola","olu")); //u
        System.out.println(out2("julio","sjfi")); //sf
        System.out.println(out2("Judia","Vuelo")); //velo

        System.out.println("---------");

        newString("hola","olu"); //ha, u
        newString("julio","sjfi"); //ulo, sf
        newString("Judia","Vuelo"); //jdia, velo
    }
}
