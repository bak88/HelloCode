using System;

namespace MyApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // int[] myArray = new int[5] {12, 123, 31, 34, 543};

            // myArray[1] = 3;

            // myArray[0] = 10;

            // int a = myArray[0];

            // System.Console.WriteLine(myArray[1]); // Элемент массива

            // System.Console.WriteLine(a); // Присвоение в переменную эл-нт массива

            // System.Console.WriteLine(myArray.Length); //Длина массива


            int[] myArray = Enumerable.Repeat(5, 10).ToArray();

            /*
                Используем класс Enumerable и вызываем метод Repeat
                повторяет элемент 5, 10 раз. После вызываем метод ToArray()
            */

            int[] myArray = Enumerable.Range(4, 5).ToArray();

            /*
                Используем класс Enumerable и вызываем метод Range
                где начало заполнения массива начинается с 4 и заполняется на 5 эл-ов.
                После вызываем метод ToArray()
            */

        }
    }
}