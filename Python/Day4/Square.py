import Polygon

class Square(Polygon):
    def __init__(self,side):
        super()
        self.side = side
    
    def area(self):
        return self.side * self.side