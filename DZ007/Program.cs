Console.Clear();

// /*Задача 1: Задайте значения M и N. 
// Напишите программу, которая выведет все натуральные числа в промежутке от M до N. 
// Использовать рекурсию, не использовать циклы.
// */

// System.Console.WriteLine("Задайте число M: ");
// int m = int.Parse(Console.ReadLine()!);
// System.Console.WriteLine("Задайте число N: ");
// int n = Convert.ToInt32(Console.ReadLine()!);
// System.Console.WriteLine();
// System.Console.WriteLine(returnNumbers(m - 1, n));

// string returnNumbers(int a, int b)
// {
//     if (a == b)
//     {
//         return "";
//     }
//     else if (a > b)
//     {
//         return "Ошибка!!! Значение M должно быть меньше N!!!";
//     }
//     return returnNumbers(a, b - 1) + $"{b} ";
// }




// /*
//     Задача 2: Напишите программу вычисления функции Аккермана с помощью рекурсии. 
//     Даны два неотрицательных числа m и n. 
// */

// System.Console.WriteLine("Введите 1ое не отрицательное число:");
// int m = int.Parse(Console.ReadLine()!);
// System.Console.WriteLine("Введите 2ое не отрицательное число:");
// int n = Convert.ToInt32(Console.ReadLine()!);
// System.Console.WriteLine($"Функция Аккермана = {ackermannFunction(m, n)} ");

// int ackermannFunction(int m, int n)
// {
//     if (m == 0)
//     {
//         return  n + 1;
//     }
//     else if (n == 0)
//     {
//         return ackermannFunction(m - 1, 1);
//     }
//     else 
//     {
//         return ackermannFunction(m - 1, ackermannFunction(m, n - 1));
//     }

// }




// Задача 3: Задайте произвольный массив. Выведете 
// его элементы, начиная с конца. Использовать 
// рекурсию, не использовать циклы.


int size = 15;
int[] array = new int[size];
FullArray(array);
System.Console.WriteLine("Начальный массив: ");
PrintArray(array);
System.Console.WriteLine("Перевернутый массив: ");
coupArray(array);


void FullArray(int[] size)
{
    for (int i = 0; i < size.Length; i++)
    {
        array[i] = new Random().Next(1, 21);
    }
}

void PrintArray(int[] size)
{
    for (int i = 0; i < size.Length; i++)
    {
        System.Console.Write($"{array[i]} ");
    }
    System.Console.WriteLine();
}

void coupArray(int[] size, int i = 0)
{
    if (i < size.Length)
    {
        // System.Console.Write($"{size[i]} ");
        coupArray(size, i + 1);
        System.Console.Write($"{size[i]} ");

    }

}