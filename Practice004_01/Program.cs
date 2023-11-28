// Массивы
 
// Console.Clear();
// System.Console.WriteLine("Введите длину массива: ");
// int n = int.Parse(Console.ReadLine()!);
// int[]array = new int[n];
// for (int i = 0; i < array.Length; i++)
// {
//     array[i] = new Random().Next(1, 11);
//     System.Console.Write($"{array[i]} ");
// }

// System.Console.WriteLine(string.Join(", ", array));/* Вывод заданного 
// массива без цикла for, если массив пустой будут нули */

// // Пример 1 заполнение массива целыми числами
// Console.Clear();
// System.Console.Write("Pls enter number array: ");
// int n = int.Parse(Console.ReadLine()!);
// int[] array = new int[n];
// System.Console.WriteLine($"Начальный массив: [{string.Join(", ", array)}]");

// for (int i = 0; i < array.Length; i++)
// {
//     array[i] = new Random().Next(-10, 11);
// }
// System.Console.WriteLine($"Конечный массив: [{string.Join(", ", array)}]");


// // Пример 2 заполнение массива вещественными числами
// Console.Clear();
// System.Console.Write("Pls enter number array: ");
// int n = int.Parse(Console.ReadLine()!);
// double[] array = new double[n];
// System.Console.WriteLine($"Начальный массив: [{string.Join(", ", array)}]");

// for (int i = 0; i < array.Length; i++)
// {
//     array[i] = Math.Round(new Random().NextDouble() * (30 - 20) + 20, 2);
//     // Random.NextDouble() - заполняется от 0 до 1
//     // от 20 до 30
//     // Random().NextDouble() * (enb - start) + start;
// }
// System.Console.WriteLine($"Конечный массив: [{string.Join(", ", array)}]");



// Функции и процедуры

// void test(ref int m) // КОгда видим void это процедура
// {
//     m = m + 10;
// }

// Console.Clear();
// int n = 7;
// test(ref n);
// System.Console.WriteLine(n);


// int MaxNumber(int a, int b)
// {
//     if (a > b)
//     {
//         return a;
//     }
//     else
//     {
//         return b;
//     }
// }

// Console.Clear();
// System.Console.WriteLine("Введите 1ое число: ");
// int n = int.Parse(Console.ReadLine()!);
// System.Console.WriteLine("Введите 2ое число: ");
// int m = int.Parse(Console.ReadLine()!);
// System.Console.WriteLine($"Максимальное значение: {MaxNumber(n, m)}");

//Задача 1

// void inputArray(int[] array)
// {
//     for (int i = 0; i < array.Length; i++)
//     {
//         array[i] = new Random().Next(1, 101);
//     }
// }

// bool isPrime(int n)
// {
//     for (int i = 2; i < n / 2; i++)
//     {
//         if (n % i == 0)
//         {
//             return false;
//         }
//     }
//     return true;
// }

// Console.Clear();
// System.Console.Write("Введите кол-во эл-ов массива: ");
// int n = int.Parse(Console.ReadLine()!);
// int[] array = new int[n];
// inputArray(array);
// System.Console.WriteLine($"Начальный массив: [{string.Join(", ", array)}]");
// for (int i = 0; i < array.Length; i++)
// {
//     if (isPrime(array[i]) == true)
//     {
//         System.Console.Write($"{array[i]} ");
//     }
// }


// // Задача 2
 
//  void inputArray(int[] array)
// {
//     for (int i = 0; i < array.Length; i++)
//     {
//         array[i] = new Random().Next(1, 101);
//     }
// }

// int isCheck(int[] array)
// {   
//     int count = 0;
//     foreach (int element in array)
//     {
//         if (element % 10 == 1 && element % 7 == 0)
//         {
//             count++;
//         }
//     }
//     return count;
// }

// Console.Clear();
// System.Console.Write("Введите кол-во эл-ов массива: ");
// int n = int.Parse(Console.ReadLine()!);
// int[] array = new int[n];
// inputArray(array);
// System.Console.WriteLine($"Начальный массив: [{string.Join(", ", array)}]");
// System.Console.WriteLine($"Результат: {isCheck(array)}");


// Задача 3

 void inputArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(0, 10);
    }
}


int forminNumber(int[] array)
{
    int result = 0;
    int i = array.Lenght - 1;
    foreach (int item in array)
    {
        result += item * Convert.ToInt32(Math.Pow(10, i));
        i--; 
    }
    return result;
}


Console.Clear();
System.Console.Write("Введите кол-во эл-ов массива: ");
int n = int.Parse(Console.ReadLine()!);
while (n < 0 || n > 8)
{
    System.Console.Write("Ошибка!!! Введите число от 0 до 8: ");
    n = int.Parse(Console.ReadLine()!);
}
int[] array = new int[n];
inputArray(array);
System.Console.WriteLine($"Начальный массив: [{string.Join(", ", array)}]");

