#!/bin/bash

declare -i numero=0
read -p "ingrese un numero: "

resto = numero % 2

if ((resto >= 0))

	echo "es par"
else:
	echo "es impar"
