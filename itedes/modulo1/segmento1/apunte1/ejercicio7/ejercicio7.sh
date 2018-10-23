#!/bin/bash

declare -i number1=0
read -p "ingrese numero: " 

declare -i number2=0
read -p "ingrese otro numero: "

declare -i result=$((number1 / number2))

echo "el resultado de la suma es: $result"

