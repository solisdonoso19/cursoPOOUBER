#importando la clase car al proyecto
from car import Car 
from account import Account

if __name__ == "__main__":

    print("Hola mundo")

    car = Car("CU1123", Account("Carlos Solis", "65433"))
    print(vars(car))
    print(vars(car.driver))