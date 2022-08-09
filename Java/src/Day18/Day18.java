package Day18;
/*
 * Reto #18
 * TRES EN RAYA
 * Fecha publicación enunciado: 02/05/22
 * Fecha publicación resolución: 09/05/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea una función que analice una matriz 3x3 compuesta por "X" y "O" y retorne lo siguiente:
 * - "X" si han ganado las "X"
 * - "O" si han ganado los "O"
 * - "Empate" si ha habido un empate
 * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta. O si han ganado los 2.
 * Nota: La matriz puede no estar totalmente cubierta. Se podría representar con un vacío "", por ejemplo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Day18 {
    final static int CONTEO_PARA_GANAR = 3;
    final static int FILAS = 3;
    final static int COLUMNAS = 3;
    final static char JUGADOR_X = 'X';
    final static char JUGADOR_O = 'O';
    final static char ESPACIO_VACIO = ' ';

    //Print tablero
    static void imprimirTablero(char[][] tablero) {
        System.out.print("\n");
        // Imprimir encabezado
        System.out.print("| ");
        for (int x = 0; x < COLUMNAS; x++) {
            System.out.printf("|%d", x + 1);
        }
        System.out.print("|\n");
        for (int y = 0; y < FILAS; y++) {
            System.out.printf("|%d", y + 1);
            for (int x = 0; x < COLUMNAS; x++) {
                System.out.printf("|%c", tablero[y][x]);
            }
            System.out.print("|\n");
        }
    }
    /*
    Funciones de conteo. Simplemente cuentan cuántas piezas del mismo jugador están
    alineadas
    */

    static int contarHaciaArriba(int x, int y, char jugador, char[][] tablero) {
        int yInicio = (y - CONTEO_PARA_GANAR >= 0) ? y - CONTEO_PARA_GANAR + 1 : 0;
        int contador = 0;
        for (; yInicio <= y; yInicio++) {
            if (tablero[yInicio][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
        }
        return contador;
    }

    static int contarHaciaDerecha(int x, int y, char jugador, char[][] tablero) {
        int xFin = (x + CONTEO_PARA_GANAR < COLUMNAS) ? x + CONTEO_PARA_GANAR - 1 : COLUMNAS - 1;
        int contador = 0;
        for (; x <= xFin; x++) {
            if (tablero[y][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
        }
        return contador;
    }

    static int contarHaciaArribaDerecha(int x, int y, char jugador, char[][] tablero) {
        int xFin = (x + CONTEO_PARA_GANAR < COLUMNAS) ? x + CONTEO_PARA_GANAR - 1 : COLUMNAS - 1;
        int yInicio = (y - CONTEO_PARA_GANAR >= 0) ? y - CONTEO_PARA_GANAR + 1 : 0;
        int contador = 0;
        while (x <= xFin && yInicio <= y) {
            if (tablero[y][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
            x++;
            y--;
        }
        return contador;
    }

    static int contarHaciaAbajoDerecha(int x, int y, char jugador, char[][] tablero) {
        int xFin = (x + CONTEO_PARA_GANAR < COLUMNAS) ? x + CONTEO_PARA_GANAR - 1 : COLUMNAS - 1;
        int yFin = (y + CONTEO_PARA_GANAR < FILAS) ? y + CONTEO_PARA_GANAR - 1 : FILAS - 1;
        int contador = 0;
        while (x <= xFin && y <= yFin) {
            if (tablero[y][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
            x++;
            y++;
        }
        return contador;
    }

    // Indica si el jugador gana según funciones de conteo
    static boolean winner(char jugador, char[][] tablero) {
        int y;
        for (y = 0; y < FILAS; y++) {
            int x;
            for (x = 0; x < COLUMNAS; x++) {
                if (
                                contarHaciaArriba(x, y, jugador, tablero) >= CONTEO_PARA_GANAR ||
                                contarHaciaDerecha(x, y, jugador, tablero) >= CONTEO_PARA_GANAR ||
                                contarHaciaArribaDerecha(x, y, jugador, tablero) >= CONTEO_PARA_GANAR ||
                                contarHaciaAbajoDerecha(x, y, jugador, tablero) >= CONTEO_PARA_GANAR) {
                    return true;
                }
            }
        }
        // Terminamos de recorrer y no conectó
        return false;
    }


    public static void main(String[] args) {
        //TEST
        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'X', 'O', 'X'}
        };
        System.out.println(winner('O', board));

        board = new char[][]{
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'X', 'O', 'X'}
        };
        System.out.println(winner('X', board));

        board = new char[][]{
                {'X', 'O', 'X'},
                {'O', 'O', 'O'},
                {'X', 'O', 'X'}
        };
        System.out.println(winner('O', board));

        board = new char[][]{
                {'X', 'O', 'O'},
                {'O', 'X', 'O'},
                {'O', 'O', 'X'}
        };
        System.out.println(winner('X', board));
    }
}