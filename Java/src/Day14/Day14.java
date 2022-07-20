package Day14;

/*
 * Reto #14
 * ¿ES UN NÚMERO DE ARMSTRONG?
 * Fecha publicación enunciado: 04/04/22
 * Fecha publicación resolución: 11/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Armstrong (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
 *
 * 371 = 3^3 + 7^3 + 1³ y
      8208 = 8^4 + 2^4 + 0^4 + 8^4
   4210818 = 4^7 + 2^7 + 1^7 + 0^7 + 8^7 + 1^7 + 8^7
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */


public class Day14 {

    public static int expo(int x){ //Calc exponente
        int n = 0;
        while(x != 0){
            n++;
            x = x / 10;
        }
        return n;
    }

    public static int sum(int n) {
        int num = expo(n);
        int sum = 0;
        while(n != 0){
            int r = n % 10;
            sum += Math.pow(r,num);
            n = n / 10;
        }
        return sum;
    }

    public static boolean isArmstrong(int n){
       return sum(n) == n;
    }

    /* public static int sum(int n){
        int num = n;
        int length = expo(num);
        System.out.println("length: " + length);
        if(n == 0){
            return 0;
        }else{
            System.out.println(Math.pow(n % 10,length) + sum(n / 10));
            return (int) Math.pow(n % 10,length) + sum(n / 10);
        }
    }*/

    public static void div(int n){
        System.out.println(n % 10);
        System.out.println(n / 10);

    }

    public static void main(String[] args) {
        System.out.println(sum(371));
        System.out.println(sum(12));
        System.out.println(sum(1253));
        System.out.println(sum(153));

        System.out.println(isArmstrong(371)); //T
        System.out.println(isArmstrong(12)); //F
        System.out.println(isArmstrong(1253)); //F
        System.out.println(isArmstrong(153)); //T
    }
}
