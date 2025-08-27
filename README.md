cadena1 = "santiago"
print("capitalize", cadena1.capitalize())

cadena2 = "SoS"
print("casefold", cadena2.casefold())

print(cadena2.center(5,'*'))

menus = ['Menu ATM','Depositar','Retirar','Consultar']
for menu in menus :
    print(menu.center(20,'-'))

    cadena3 = "Hola mundo"
    print(cadena3.count("e",3,30))
