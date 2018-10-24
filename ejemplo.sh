#!/bin/bash

declare -i age=0 
	read -p "edad: "

if ((age >= 18))
then
		echo "usted es mayor"
else
		echo "usted es menor"
fi

