// Console.Clear();
// string name = "Inan"; // у сторк есть индексы
// System.Console.WriteLine(name[3]); // Вызывая сторку с индексом она сохр. как char




// // Напишите программу, которая принимает на вход число.посчитайте сумму чисел этого числа
// Console.Clear();
// System.Console.WriteLine("Введите число: ");
// string number = Console.ReadLine()!; // "234567"
// int result = 0;
// for (int i = 0; i < number.Length; i++)
// {
//     result += (Convert.ToInt32(number[i].ToString()));
//     // number[i] -- char
//     // number[i].ToString() -- строка
//     // (Convert.ToInt32(number[i].ToString())) -- integer
// }
// System.Console.WriteLine(result);




// // Задача 2: Задайте массив на 10 целых чисел и найдите кол-во четных чисел
//  void InputArray(int[] array)
//  {
//     for (int i = 0; i < array.Length; i++)
//     {
//         array[i] = new Random().Next(-20, 21);
        
//     }
    
//  }

//  int resNumbers(int[] array)
//  {  
//     int count = 0;
//     foreach (int item in array)
//     {
//         if (item % 2 == 0)
//         {
//             count++;
//         }
//     }
//     return count;
//  }

//  int[] array = new int[10];
//  InputArray(array);
//  System.Console.WriteLine($"Начальный массив: [{string.Join(", ", array)}]");
//  System.Console.WriteLine($"{resNumbers(array)}");
 
 
 
//Задача 3
//Дано натуральное число в диапазоне от 1 до 100 000. 
//Создайте массив, состоящий из цифр этого числа. 
//Старший разряд числа должен располагаться на 0-м индексе массива, младший – на последнем. 
//Размер массива должен быть равен количеству цифр.

// Console.Clear();
// int number = new Random().Next(1, 100001);
// int n = number; // копия данного числа, что бы изменять
// int count = 0; // счетчик который будет считать кол-во чисел
// while (n > 0)
// {
//     n /= 10;
//     count++;
// }
// System.Console.WriteLine(number);
// System.Console.WriteLine(count);

// int[] array = new int[count];
// while (count > 0)
// {
//     array[count - 1] = number % 10;
//     number /= 10; // удаление последней цифры из числа
//     count--;
// }
// System.Console.WriteLine($"Результат: [{string.Join(", ", array)}]");




// //Задача 3
// // Задайте двумерный массив. Найдите элементы, у которых оба индекса чётные, 
// // и замените эти элементы на их квадраты.


// void InputMatrix(int[,] matrix)
// {
//     for (int i = 0 ; i < matrix.GetLength(0); i++)
//     {
//         for (int j = 0; j < matrix.GetLength(1); j++)
//         {
//              matrix[i, j] = new Random().Next(1, 31);
//         }
        
//     }
// }

// void PrintMatrix(int[,] matrix)
// {
//     for (int i = 0; i < matrix.GetLength(0); i++)
//     {
//         for (int j = 0; j < matrix.GetLength(1); j++)
//         {
//             System.Console.Write($"{matrix[i, j]}\t");
//         }
//         System.Console.WriteLine();
//     }
    
// }

// void replaceMatrix(int[,] matrix)
// {
//     for (int i = 0; i < matrix.GetLength(0); i+=2)
//     {
//         for (int j = 0; j < matrix.GetLength(1); j+=2)
//         {
//             matrix[i, j] = matrix[i, j] * matrix[i, j];
//         }
//     }
// }


// Console.Clear();
// System.Console.WriteLine("Введите размер двумерного массива: ");
// int[] size = Console.ReadLine()!.Split().Select(x => int.Parse(x)).ToArray();
// // Console.ReadLine()! "4 5"
// // .Split() "4", "5" В () по умол. пробел. Разделяет строку на числа
// // .Select(x => int.Parse(x)) 4, 5 Возвращает числа
// // .ToArray() [4, 5] Возвращает массив
// int[,] matrix = new int[size[0], size[1]];
// InputMatrix(matrix); 
// System.Console.WriteLine("Начальный массив: ");
// PrintMatrix(matrix);
// replaceMatrix(matrix);
// System.Console.WriteLine("Конечный массив: ");
// PrintMatrix(matrix);



// Задача 4
//Задайте двумерный массив. 
//Найдите сумму элементов, находящихся на главной диагонали (с индексами (0,0); (1;1) и т.д.
// Console.Clear();
// int number = new Random().Next(1, 100001);
// int n = number; // копия данного числа, что бы изменять
// int count = 0; // счетчик который будет считать кол-во чисел
// while (n > 0)
// {
//     n /= 10;
//     count++;
// }
// System.Console.WriteLine(number);
// System.Console.WriteLine(count);

// int[] array = new int[count];
// while (count > 0)
// {
//     array[count - 1] = number % 10;
//     number /= 10; // удаление последней цифры из числа
//     count--;
// }
// System.Console.WriteLine($"Результат: [{string.Join(", ", array)}]");



 // //Задача 5
 // // Задайте двумерный массив. Найдите элементы, у которых оба индекса чётные, 
 // // и замените эти элементы на их квадраты.


// void InputMatrix(int[,] matrix)
// {
//     for (int i = 0 ; i < matrix.GetLength(0); i++)
//     {
//         for (int j = 0; j < matrix.GetLength(1); j++)
//         {
//              matrix[i, j] = new Random().Next(1, 11);
//         }
        
//     }
// }

// void PrintMatrix(int[,] matrix)
// {
//     for (int i = 0; i < matrix.GetLength(0); i++)
//     {
//         for (int j = 0; j < matrix.GetLength(1); j++)
//         {
//             System.Console.Write($"{matrix[i, j]}\t");
//         }
//         System.Console.WriteLine();
//     }
    
// }

// int SumElement(int[,] matrix)
// {
//     int sum = 0;
//     for (int i = 0; i < matrix.GetLength(0); i++)
//     {
//         for (int j = 0; j < matrix.GetLength(1); j++)
//         {
//             if (i == j)
//             {
//                 sum += matrix[i, j];
//             }
//         }
//     }
//     return sum;
// }


// Console.Clear();
// System.Console.WriteLine("Введите размер двумерного массива: ");
// int[] size = Console.ReadLine()!.Split().Select(x => int.Parse(x)).ToArray();
// int[,] matrix = new int[size[0], size[1]];
// InputMatrix(matrix); 
// System.Console.WriteLine("Начальный массив: ");
// PrintMatrix(matrix);
// System.Console.WriteLine($"Сумма эл-ов главной диагонали {SumElement(matrix)}");




// Задача 6
//Задайте двумерный массив из целых чисел. Сформируйте новый 
//одномерный массив, состоящий из средних арифметических 
//значений по строкам двумерного массива. 

void InputMatrix(int[,] matrix)
{
    for (int i = 0 ; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
             matrix[i, j] = new Random().Next(1, 11);
        }
        
    }
}

void PrintMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            System.Console.Write($"{matrix[i, j]}\t");
        }
        System.Console.WriteLine();
    }
    
}

double[] AVG(int[,] matrix) //AVG - среднее арифметическое число
{
    double[] avg_array = new double[matrix.GetLength(0)];
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        double sum = 0;
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            sum += matrix[i, j];
        }
        avg_array[i] = sum / matrix.GetLength(1);
    }
    return avg_array;
}


Console.Clear();
System.Console.WriteLine("Введите размер двумерного массива: ");
int[] size = Console.ReadLine()!.Split().Select(x => int.Parse(x)).ToArray();
int[,] matrix = new int[size[0], size[1]];
InputMatrix(matrix); 
System.Console.WriteLine("Начальный массив: ");
PrintMatrix(matrix);
System.Console.WriteLine($"Ср. арифметическое строк: [{string.Join(", ", AVG(matrix))}]");
