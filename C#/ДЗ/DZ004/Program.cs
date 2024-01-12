// // Задача 1
//Напишите программу, которая бесконечно запрашивает целые числа с консоли. 
//Программа завершается при вводе символа ‘q’ или при вводе числа, сумма цифр которого чётная.

// Console.Clear();

// while (true)
// {
//     System.Console.WriteLine("Введите число: ");
//     string n = Console.ReadLine()!;
        
//     if (n == "q")
//     {
//         break;
//     }
//     int num ;
//     if (int.TryParse(n, out num))
//     {
    
//     }
//     if (num % 2 == 0)
//     {
//         break;
//     }
        
// }


// // Задача 2
//Задайте массив заполненный случайными трёхзначными числами. 
//Напишите программу, которая покажет количество чётных чисел в массиве.

// void fullArray(int[] array)
// {
//     for (int i = 0; i < array.Length; i++)
//     {
//         array[i] = new Random().Next(100, 1000);
//     }
// }

// void PrintArray(int[] array)
// {
//     int count = 0;
//     for (int i = 0; i < array.Length; i++)
//     {
//         System.Console.Write($"{array[i]} ");

//         if (array[i] % 2 == 0)
//         {
//             count++;
//         }
        
//     }
//     System.Console.WriteLine($" \nЧетных числа {count}");
// }

// Console.Clear();
// int[] array = new int[10];
// fullArray(array);
// PrintArray(array);



// // Задача 3
// // Напишите программу, которая перевернёт одномерный массив 
// // (первый элемент станет последним, второй – предпоследним и т.д.)
// void fullArray(int[] array)
// {
//     for (int i = 0; i < array.Length; i++)
//     {
//         array[i] = new Random().Next(1, 11);
//     }
// }

// void PrintArray(int[] array)
// {
//     for (int i = 0; i < array.Length; i++)
//     {
//         System.Console.Write($"{array[i]} ");
//     }
// }

// void RollArray(int[] array)
// {
//     int temp;
//     for (int i = 0; i < array.Length / 2; i++)
//     {
//         temp = array[i];
//         array[i] = array[array.Length - 1 - i];
//         array[array.Length - 1 - i] = temp;
//     }
//     System.Console.WriteLine(array);
// }


// Console.Clear();
// int[] array = new int[5];
// fullArray(array);
// System.Console.WriteLine("Начальный массив: ");
// PrintArray(array);
// RollArray(array);
// System.Console.WriteLine("Превернутый массив: ");
// PrintArray(array);

