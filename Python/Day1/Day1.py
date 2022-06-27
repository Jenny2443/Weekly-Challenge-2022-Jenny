"""
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
     """

"""PLANTEAMIENTO
- Comprobar si es la misma palabra-> False
- Comprobar longitud != -> False
- lower() para hacerlo minuscula / sorted() para colocarlos en orden alfabetico
    Comprobar si son iguales
"""

def isAnagram(palabra1,palabra2):
    loEs = True
    if(palabra1.lower() == palabra2.lower()):
        loEs = False
    elif(len(palabra1) != len(palabra2)):
        loEs = False
    elif(sorted(palabra1.lower()) != sorted(palabra2.lower())):
        loEs = False
    return loEs

print(isAnagram("Amor","RoMa"))
print(isAnagram("torta","por"))
print(isAnagram("Hola","Hola"))
print(isAnagram("tarta","torta"))
print(isAnagram("Alto","Talo"))