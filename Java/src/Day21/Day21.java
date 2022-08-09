package Day21;
/*
 * Reto #21
 * CALCULADORA .TXT
 * Fecha publicación enunciado: 23/05/22
 * Fecha publicación resolución: 01/06/22
 * Dificultad: MEDIA
 *
 * Enunciado: Lee el fichero "Challenge21.txt" incluido en el proyecto, calcula su resultado e imprímelo.
 * - El .txt se corresponde con las entradas de una calculadora.
 * - Cada línea tendrá un número o una operación representada por un símbolo (alternando ambos).
 * - Soporta números enteros y decimales.
 * - Soporta las operaciones suma "+", resta "-", multiplicación "*" y división "/".
 * - El resultado se muestra al finalizar la lectura de la última línea (si el .txt es correcto).
 * - Si el formato del .txt no es correcto, se indicará que no se han podido resolver las operaciones.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

import com.sun.jdi.IntegerType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day21 {

    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("/Users/jenny2443/Code/Weekly-Challenge-2022-Jenny/Java/src/Day21/Calc.txt"); //Creacion del file
        try {
            Scanner scannerFile = new Scanner(myFile); //Creacion del scanner q va a leer el file
            while (scannerFile.hasNextLine()) { //Mientras haya lineas en el file se añade a string para separarlos
                String line = scannerFile.nextLine();
                //String[] numbers = line.split(""); //Separacion de los numeros y operaciones
                String[] numbers = new String[line.length()];
                for (int i = 0; i < line.length(); i++) {
                    numbers[i] = line.substring(i, i + 1);
                }
                for (int i = 0; i < numbers.length; i++) {
                    System.out.print(numbers[i]);
                }
                int result = 0;
                for (int i = 0; i < numbers.length; i++) {
                    if(numbers[i].equals("+")){
                        result += Integer.parseInt(numbers[i+1]);
                    }else if(numbers[i].equals("-")){
                        result -= Integer.parseInt(numbers[i+1]);
                    }else if(numbers[i].equals("*")){
                        result *= Integer.parseInt(numbers[i+1]);
                    }else if(numbers[i].equals("/")){
                        result /= Integer.parseInt(numbers[i+1]);
                    }else{
                        result += Integer.parseInt(numbers[i]);
                    }
                }
                System.out.println(result);
                /*String[] ops = new String[numbers.length - 1];
                for (int i = 0; i < numbers.length; i++) {
                    ops[i] = numbers[i + 1];
                }
                for (int i = 0; i < ops.length; i++) {
                    System.out.println("ops" + ops[i]);
                }*/



                /*
                int result = 0;
                for (int i = 0; i < numbers.length; i++) { //Bucle para operaciones comprobando el input
                    if (numbers[i].equals("+")) {
                        result += Integer.parseInt(numbers[i + 1]);
                    } else if (numbers[i].equals("-")) {
                        result -= Integer.parseInt(numbers[i + 1]);
                    } else if (numbers[i].equals("*")) {
                        result *= Integer.parseInt(numbers[i + 1]);
                    } else if (numbers[i].equals("/")) {
                        result /= Integer.parseInt(numbers[i + 1]);
                    } else { //Si es numero se añade a result
                        result = Integer.parseInt(numbers[i]);
                    }
                }
                System.out.println(result);*/
            }
        } catch (Exception e) {
            System.out.println("No se han podido resolver las operaciones");
        }


    }

}
