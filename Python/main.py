from car import Car
from account import Account
from uberX import UberX

car = Car("ABC123", Account("Pepe el conductor", "123456"))
print(vars(car))
print(vars(car.driver))

uberX = UberX("ABC123", Account("RED", "0987654"), "Chevrolet", "123456")
print(vars(uberX))
print(vars(uberX.driver))
