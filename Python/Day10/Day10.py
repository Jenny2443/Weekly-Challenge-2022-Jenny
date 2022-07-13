"""

/*
 * Reto #10
 * EXPRESIONES EQUILIBRADAS
 * Fecha publicación enunciado: 07/03/22
 * Fecha publicación resolución: 14/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
"""

def balancedParenthesis(s):
    open = 0
    close = 0
    for i in range(0,len(s)):
        if s[i] == '(':
            open += 1
        elif s[i] == ')':
            close += 1
    return open == close

def balancedBraces(s):
    open = 0
    close = 0
    for i in range(0,len(s)):
        if s[i] == '{':
            open += 1
        elif s[i] == '}':
            close += 1
    return open == close

def balanced(s):
    return balancedParenthesis(s) and balancedBraces(s)

print(balancedParenthesis("(fjskle)"))
print(balancedParenthesis("(fj(skle)"))
print(balancedParenthesis("dpw()"))

print("------")

print(balancedBraces("{}{dfsd}"))
print(balancedBraces("{}{dfs}d}"))
print(balancedBraces("{}{d(fs)d}"))

print("------")

print(balanced("(fasdgh)"))
print(balanced("{fsdg}"))
print(balanced("{(}{dfgf)d)}"))

