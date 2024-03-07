// // Задача 1

// Console.Clear();

// int lenArr = 15;
// int[] arr = FullArray(lenArr);
// int count = 0;
// PrintArray(arr);
// FindNumber(arr);

// int[] FullArray(int size)
// {
//     int[] array = new int[size];
//     for (int i = 0; i < array.Length; i++)
//     {
//        array[i] = new Random().Next(1, 101); 
//     }
//     return array;
// }

// void PrintArray(int[] PriArr)
// {
//     for (int i = 0; i < PriArr.Length; i++)
//     {
//         System.Console.Write(PriArr[i] + " ");
//     }
//     System.Console.WriteLine();
// }

// void FindNumber(int[] FinNum)
// {   int count = 0;
//     for (int i = 0; i < FinNum.Length; i++)
//     {   
         
//         if (FinNum[i] > 20 && FinNum[i] < 90)
//         {
//             count++;
//         }
//     }
//      System.Console.Write($"{count} чисел в диапазоне от 20 до 90");

// }

// // Задача 2

// Console.Clear();

// int lenArr = 15;
// int[] array = RandomArray(lenArr);
// PrintArray(array);
// EvenNumbers(array);

// int[] RandomArray(int size)
// {
//     int[] array = new int[size];
//     for (int i = 0; i < array.Length; i++)
//     {
//         array[i] = new Random().Next(1, 101);
//     }
//     return array;
// }

// void PrintArray(int[] PriArr)
// {
//     for (int i = 0; i < PriArr.Length; i++)
//     {
//         System.Console.Write(PriArr[i] + " ");
//     }
//     System.Console.WriteLine();
// }
// void EvenNumbers(int[] EvenNum)
// {
//     int count = 0;
//     for (int i = 0; i < EvenNum.Length; i++)
//     {
//         if(EvenNum[i] % 2 == 0)
//         count++;
//     }
//     System.Console.WriteLine($"{count} Четных числа");
// }

// // Задача 3
// Console.Clear();

// double[] array = {2.2, 0.4, 9.11, 7.2, 78.98, 3.2, 8.9, 9,9};
// Random random = new Random();
// PrintArray(array);
// DiffArray(array);

// void PrintArray(double[] PriArr)
// {
//     for(int i = 0; i < PriArr.Length; i++)
//     {
//         PriArr[i] = random.NextDouble() * 100;
//         System.Console.WriteLine(PriArr[i] + " ");
//     }
//     System.Console.WriteLine();
// }

// void DiffArray(double[] array)
// {
//     double max = array[0];
//     double min = array[0];
//     for (int i = 0 + 1; i < array.Length; i++)
//     {
//         if (array[i] > max)
//             max = array[i];
//         if (array[i] < min)
//             min = array[i];
//     }
//     System.Console.WriteLine($"{max} - {min} = {max - min}");
 
// }
