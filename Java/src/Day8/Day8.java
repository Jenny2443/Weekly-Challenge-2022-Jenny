package Day8;
/*
 * Reto #8
 * DECIMAL A BINARIO
 * Fecha publicación enunciado: 18/02/22
 * Fecha publicación resolución: 02/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Day8 {
   /* public static int decToBin(int num){
        /*if(num == 0){
            return 0;
        }else {
            return decToBin((int) num / 2) + num % 2;
        }
    }*/

    /*public static int decimalToBin(int n){
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += n % 2;
            n = n / 2;
        }
        return res;
    }*/

    public static void decimalToBin(int n){
        int[] res = new int[10];
        int i = 0;
        while(n > 0){
            res[i] = n % 2; //Resto
            n = n / 2;
            i++;
        }
        for (int j = i-1; j >= 0; j--) { //Recorro el array de atras para adelante porq los numeros los he añadido al reves
            System.out.print(res[j]);
        }

        }

    public static void main(String[] args) {
        decimalToBin(17);
        System.out.println();
        decimalToBin(21);
        System.out.println();
        decimalToBin(4);
    }
}
