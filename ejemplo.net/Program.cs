using System;

namespace ejemplo.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("ingrese una opcion (1,2 o 3): ");
			int opcion= int.Parse(Console.ReadLine());

			if(opcion == 1)
			{
				Console.WriteLine("elijio 1");
			}else if (opcion == 2)
			{
				Console.WriteLine("elijio 2");
			}else if (opcion == 3)
			{
			 	Console.WriteLine("elijio 3");
			}else
			{
				Console.WriteLine("opcion invalida");
			}
        }
    }
}
