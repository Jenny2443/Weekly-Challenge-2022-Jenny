#Importar la clase madre para poder heredar
import Polygon
class Triangle(Polygon):
    def __init__(self,width,height):
        super()
        self.width = width
        self.height = height
    
    def area(self):
        return (self.width * self.height) / 2
