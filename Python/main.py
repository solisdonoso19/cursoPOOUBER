#importando la clase car al proyecto
from car import Car 

car = Car();
car.license = "AMS23"
car.driver = "Carlos"
car.passegenger = 2
print(vars(car))

car2 = Car();
car2.license = "QWR344"
car2.driver = "Ivan"
car2.passegenger = 3
print(vars(car2))