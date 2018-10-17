number1 = int(input("ingrese un numero: "))
number2 = int(input("ingrese un numero: "))

option = int(input("ingrese operacion (1 suma / 2 resta / 3 multiplicacion / 4 division): "))

if option == 1:
	result = number1 + number2
elif option == 2:
	result = number1 - number2
elif option == 3:
	result = number1 * number2
elif option == 4:
	result = number1 / number2

print ("el resultado es :",result)

