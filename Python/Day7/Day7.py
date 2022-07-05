"""
/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
"""

def punctuation(word):
    punctuation_chars = [".", ",", ":", ";", "!", "¡", "?", "¿", "(", ")", "{", "}", "[", "]", "-"]
    new_word = ""
    for char in word:
        # Si el caracter en la frase se encuentra dentro del listado de puntuación, lo elimina
         if char in punctuation_chars:
             char = ""

        # Concatena el caracter en un String.
         new_word += char
    return new_word.lower().split(" ")

def countWords(s):
    words = punctuation(s) # split string into list of words
    res = {} # create empty dictionary
    for word in words: 
        if word in res: # if word is already in dictionary increment its value
            res[word] += 1
        else: # if word is not in dictionary add it with value 1
            res[word] = 1
    return res

print(countWords("Hola mundo"))
print(countWords("Y así como suele decirse el gato al rato, el rato a la cuerda, la cuerda al palo; daba el arriero a Sancho, Sancho a la moza, la moza a él, el ventero a la moza"))