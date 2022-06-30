#Import para declarar metodo abstracto
from abc import ABC, abstractmethod

class Polygon(ABC):
    @abstractmethod
    def area(self)-> float:
        pass
        