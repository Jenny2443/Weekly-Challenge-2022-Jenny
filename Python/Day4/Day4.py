"""
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
 """
from abc import ABC,abstractmethod
class Polygon(ABC):
    @abstractmethod
    def area(self):
        pass

class Triangle(Polygon):
    def __init__(self,base,height):
        super()
        self.base = base
        self.height = height

    def area(self):
        return (self.base * self.height) / 2

class Rectangle(Polygon):
    def __init__(self,width,height):
        super()
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

class Square(Polygon):
    def __init__(self,side):
        super()
        self.side = side

    def area(self):
        return self.side * self.side

#if __name__ = '__main__'
myTriangle = Triangle(2,5)
mySquare = Square(3)
myRectangle = Rectangle(2,6)

print("Triangule:",myTriangle.area())
print("Square: ",mySquare.area())
print("Rectangle: ",myRectangle.area())