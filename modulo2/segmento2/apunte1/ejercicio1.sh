#!/bin/bash
declare barrio=""
read -p "ingrese barrio: "

declare direccion
read -p "ingrese direccion: "

declare entrecalle1
read -p "ingrese entrecalle1: "

declare entrecalle2
read -p "ingrese entrecalle2: "

echo "la comisaria de $barrio se encuentra en la $direccion entre $entrecalle1 y $entrecalle2 ."
