// // Задача 1

// void InputMatrix(int[,] matrix)
// {
//     for (int i = 0; i < matrix.GetLength(0); i++)
//     {
//         for (int j = 0; j < matrix.GetLength(1); j++)
//         {
//             matrix[i, j] = new Random().Next(1, 9);
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

// int ElementArray(int[,] matrix)
// {
//     int n = 0;
//     for (int i = 0; i <  matrix.GetLength(0) ; i++)
//     {
//         for (int j = 0; j < matrix.GetLength(1) ; j++)
//         {
//             n = matrix[i , j];
//         }
//     }
//     return n;
// }

// Console.Clear();
// System.Console.WriteLine("Введите эл-ты массива: ");
// int[] size = Console.ReadLine()!.Split().Select(x => int.Parse(x)).ToArray();
// int[,] matrix = new int[size[0] + 1, size[1] + 1];
// InputMatrix(matrix);
// PrintMatrix(matrix);
// System.Console.WriteLine($"Значение эл-та: {ElementArray(matrix)}");




// // Задача 2

// void InputMatrix(int[,] matrix)
// {
//     for (int i = 0; i < matrix.GetLength(0); i++)
//     {
//         for (int j = 0; j < matrix.GetLength(1); j++)
//         {
//             matrix[i, j] = new Random().Next(1, 9);
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

// int[] ChangeArray(int[,] matrix)
// {
//     int[] array = new int[matrix.GetLength(0)];

//     for (int i = 0; i < matrix.GetLength(0); i++)
//     {
//         int temp = matrix[0, i];
//         matrix[0, i] = matrix[4, i];
//         matrix[4, i] = temp;
        
//         for (int j = 0; j < matrix.GetLength(1); j++)
//         {
            
//         }
//     }
//     return array;
// }

// Console.Clear();
// int[,] matrix = new int[5, 5];
// InputMatrix(matrix);
// PrintMatrix(matrix);
// System.Console.WriteLine();
// ChangeArray(matrix);
// PrintMatrix(matrix);




// Задача 3

void InputMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            matrix[i, j] = new Random().Next(1, 9);
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

void SmallMatrix(int[,] matrix)
{
    int index = 0; 
    int min = 0;
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        int sum = 0;
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            sum += matrix[i, j];
        }
        Console.WriteLine($"Индекс строки {i}, сумма строки = {sum}");
        if (i == 0)
        {
            min = sum;
        }
        else if (sum < min)
        {
            min = sum;
            index = i;
        }
    }
    Console.WriteLine($"Наименьшая сумма элементов равна {min}. ");
    // string line = string.Empty;
    // for (int j = 0; j < matrix.GetLength(1); j++)
    // {
    //     line += matrix[index, j] + " ";
}
          


Console.Clear();
int[,] matrix = new int[3, 5];
InputMatrix(matrix);
PrintMatrix(matrix);
System.Console.WriteLine();
SmallMatrix(matrix);


