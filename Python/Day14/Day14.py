"""

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
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */


"""

def length(n):
    res = 0
    while n != 0:
        res += 1
        n = n // 10 #Div entera
    return res

def isArmstrong(n):
    primNumber = n #Para q se guarde el valor inicial
    l = length(n)
    res = 0
    while n != 0:
        remainder = n % 10
        res += remainder**l
        n = n // 10
    return res == primNumber


#TEST
"""print(length(123))
print(length(1))
print(length(4983757))"""

print(isArmstrong(371)) #T
print(isArmstrong(12)) #F
print(isArmstrong(1253)) #F
print(isArmstrong(153)) #T