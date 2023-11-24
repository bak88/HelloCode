// // Задача 1

// Console.Clear();

// int lenArr = 10;
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
// {
//     for (int i = 0; i < FinNum.Length; i++)
//     {
//         if (FinNum[i] > 20 && FinNum[i] < 90)
//         {
//             count++;
//         }
//     }
//      System.Console.Write(count);
// }

// // Задача 2

// Console.Clear();

// int count = 0;
// int lenArr = 10;
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
//     for (int i = 0; i < EvenNum.Length; i++)
//     {
//         if(EvenNum[i] % 2 == 0)
//         count++;
//     }
//     System.Console.WriteLine($"{count} Четных числа");
// }
