#!/bin/bash

declare -i numero=10 

	read -p "ingrese un numero entero: "

if ((numero >= 10))

then

	echo "el numero ingresado es $numero ."
fi
