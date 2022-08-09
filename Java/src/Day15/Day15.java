package Day15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Date;

/*
 * Reto #15
 * ¿CUÁNTOS DÍAS?
 * Fecha publicación enunciado: 11/04/22
 * Fecha publicación resolución: 18/04/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea una función que calcule y retorne cuántos días hay entre dos cadenas de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se lanzará una excepción.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Day15 {
    final static String FORMATO_FECHA = "dd/MM/yyyy";

    //Check si la fecha es correcta según el patrón

    public static boolean esFechaValida(String fecha) {
        try {
            LocalDate.parse(fecha, DateTimeFormatter.ofPattern(FORMATO_FECHA));
            return true;
        } catch (DateTimeParseException e) { //Error si no se puede transformar la fecha correctamente
            return false;
        }
    }

    public static void diasEntreFechas(String fecha1, String fecha2) throws ParseException {
        if (!esFechaValida(fecha1) || !esFechaValida(fecha2)) { //Si alguna de las fechas no es válida lanza una excepción
            throw new ParseException("Fecha inválida", 0);
        }
        LocalDate fecha1Local = LocalDate.parse(fecha1, DateTimeFormatter.ofPattern(FORMATO_FECHA)); //Convierte la fecha1 a LocalDate con el patrón de fecha
        LocalDate fecha2Local = LocalDate.parse(fecha2, DateTimeFormatter.ofPattern(FORMATO_FECHA));
        System.out.println(Math.abs(fecha1Local.until(fecha2Local, java.time.temporal.ChronoUnit.DAYS)));
    }


    public static void main(String[] args) throws ParseException {
        diasEntreFechas("12/04/2020", "12/04/2020");
        diasEntreFechas("12/03/2020", "12/04/2021");
        diasEntreFechas("12/04/2021", "12/04/2022");
        diasEntreFechas("12/04/2022", "15/04/2022");
    }
}
