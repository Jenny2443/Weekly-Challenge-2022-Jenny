import Polygon


class Rectangle(Polygon):
    def __init__(self, width, height):
        super()
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height
