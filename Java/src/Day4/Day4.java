package Day4;
/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

/*
* Triangulo -> base * altura /2
* Cuadrado -> lado^2
* Rectangulo-> base altura
* */
public class Day4 {
    public static double areaPoligono(Poligono p){
        return p.area();
    }

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10,5);
        Triangulo t2 = new Triangulo(5,2);
        System.out.println(areaPoligono(t1));
        System.out.println(areaPoligono(t2));

        System.out.println("---------");

        Rectangulo r1 = new Rectangulo(5,7);
        Rectangulo r2 = new Rectangulo(2,2);
        System.out.println(areaPoligono(r1));
        System.out.println(areaPoligono(r2));

        System.out.println("---------");

        Cuadrado c1 = new Cuadrado(4);
        Cuadrado c2 = new Cuadrado(3);
        System.out.println(areaPoligono(c1));
        System.out.println(areaPoligono(c2));
    }
}
