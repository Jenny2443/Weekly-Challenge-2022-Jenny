"""
/*
 * Reto #9
 * CÓDIGO MORSE
 * Fecha publicación enunciado: 02/03/22
 * Fecha publicación resolución: 07/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
"""

"""letters = { "a", "b", 'c', 'd', 'e', 'f','g', 'h', 'i', 'j', 'k', 'l',
'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x',
'y', 'z', '1', '2', '3', '4','5', '6', '7', '8', '9', '0'}"""
letters = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
           "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"]

morseLetters = [".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|", "  "]


def textToMorse(t):
    t = t.lower() #a minuscula para poder reconocerlo
    res = ""
    for i in range(0, len(t)):
        if t[i] == " ": #añadir los espacios
            res += "  "
        for j in range(0, len(letters)):
            if t[i] == letters[j]: #comparacion de letras
                res += morseLetters[j] + " "
    return res


def morsetoText(s):
    s = s.split(" ") #Separar por espacios / letras
    res = ""
    for i in range(0, len(s)):
        if s[i] == '': #adicion de espacios
            res += " "
        for j in range(0, len(morseLetters)):
            if s[i] == morseLetters[j]: #comparacion de puntos y rayas
                res += letters[j]
    return res


print(textToMorse("Hello World"))
print(textToMorse("Codificar codigo"))
print(morsetoText(".... . .-.. .-.. ---  .-- --- .-. .-.. -.."))
print(morsetoText("-.-. --- -.. .. ..-. .. -.-. .- .-.  -.-. --- -.. .. --. ---"))