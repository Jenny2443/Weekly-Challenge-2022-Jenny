package Day12;
/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Fecha publicación enunciado: 21/03/22
 * Fecha publicación resolución: 28/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Day12 {

    static boolean palindrome(String s){
        s = s.toLowerCase();
        boolean is = true;
        int i = 0;
        int j = s.length() - 1;
        while(i <= j && is){
            char getL = s.charAt(i);
            char getJ = s.charAt(j);

            //Por si hay simbolos ignorables
            if(!(getL >= 'a' && getJ <= 'z')){
                i++;
            }else if(!(getJ >= 'a' && getL <= 'z')){
                j--;
            }else if(getL == getJ){
                i++;
                j--;
            }else{
                is = false;
            }
        }
        return is;
    }

    //OTRA
    //Uso de StringBuilder para dar vuelta al string y compararlos
    static boolean palindrome2(String s){

        if(s.isEmpty()) //Si vacio
            return true;
        String str = s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]",""); //Cambio de elementos de puntuacion

        StringBuilder reverse = new StringBuilder(str); //Creación de StringBuilder
        reverse.reverse(); //Vuelta
        String res = reverse.toString();

        return str.equals(res);
    }

    /*public static boolean palindromo(String s){
       s = s.toLowerCase();
       System.out.println(s);
       boolean is = true;
       int i = 0;
       int j = s.length() - 1;
       while(i <= j && is){
           if(s.charAt(i) == ' ' || s.charAt(i) == '.' || s.charAt(i) == ',') {
               i++;
               j--;
               System.out.println(i);
           }else if(s.charAt(i) != s.charAt(j)){
               System.out.println(i);
               System.out.println(s.charAt(i));
               System.out.println(s.charAt(s.length()-1-i));
               is = false;
           }else{
               i++;
               j--;
           }
       }
       return is;
   }*/

    public static void main(String[] args) {
        //TEST
        /*
        System.out.println(palindrome("Ana lleva al oso la avellana"));
        System.out.println(palindrome("Roma amor"));
        System.out.println(palindrome("Test palindrome"));
        System.out.println(palindrome(""));*/

        System.out.println(palindrome2("Ana lleva al oso la avellana"));
        System.out.println(palindrome2("Roma amor"));
        System.out.println(palindrome2("Test palindrome"));
        System.out.println(palindrome2(""));
    }
}
