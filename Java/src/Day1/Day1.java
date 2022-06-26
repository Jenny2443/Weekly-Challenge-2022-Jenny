package Day1;

import java.util.Arrays;

public class Day1 {
    /*
     * Reto #1
     * ¿ES UN ANAGRAMA?
     * Fecha publicación enunciado: 03/01/22
     * Fecha publicación resolución: 10/01/22
     * Dificultad: MEDIA
     * AUTOR: Jennifer Zhao Jin
     *
     * Enunciado: Escribe una función que reciba dos palabras (String)
     * y retorne verdadero o falso (Bool) según sean o no anagramas.
     * Un Anagrama consiste en formar una palabra reordenando
     * TODAS las letras de otra palabra inicial.
     * NO hace falta comprobar que ambas palabras existan.
     * Dos palabras exactamente iguales no son anagrama.
     *
     * Información adicional:
     * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
     * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
     * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
     * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
     *
     */

    /**PLANTEAMIENTO
     * Comprobar q no es la misma palabra y misma longitud
     * Con función auxiliar contamos frecuencia de letra
     * Recorremos viendo que cada frecuencia de cada letra coincide en ambas palabras
     * */
    /*public static boolean esAnagrama(String palabra1,String palabra2){
       if(palabra1.toLowerCase().equals(palabra2.toLowerCase())){
           return false;
       }else{
           Arrays.sort(palabra1.toLowerCase().toCharArray());
           Arrays.sort(palabra2.toLowerCase().toCharArray());
           return palabra1.equals(palabra2);
       }
    }*/

    public static int frecueciaChar(char letra,String palabra){
        int total = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.toLowerCase().charAt(i) == letra){
                total++;
            }
        }
        return total;
    }

    public static boolean esAnagrama(String palabra1, String palabra2){
        if(palabra1.equals(palabra2) || palabra1.length() != palabra2.length()){
            return false;
        }else{
            boolean loEs = true;
            int i = 0;
            while(i < palabra1.length() && loEs){
                if(frecueciaChar(palabra1.toLowerCase().charAt(i),palabra1) != frecueciaChar(palabra1.toLowerCase().charAt(i),palabra2)){
                    loEs = false;
                }else{
                    i++;
                }
            }
            return loEs;
        }
    }

    public static void main(String[] args) {
        System.out.println(frecueciaChar('r',"Roma"));
        System.out.println(esAnagrama("Ropa","Amor"));
    }

}
