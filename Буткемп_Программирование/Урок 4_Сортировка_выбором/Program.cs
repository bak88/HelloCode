// Сортировка Выбором О(n^2)

/*
[45, 23, -10, 5, 3, 9, 1]
min = -10
[-10, 23, 45, 5, 3, 9, 1]
min = 1
[-10, 1, 45, 5, 3, 9, 23]
min = 3
[-10, 1, 3, 5, 45, 9, 23]
min = 5
[-10, 1, 3, 5, 45, 9, 23]
min = 9
[-10, 1, 3, 5, 9, 45, 23]
min = 23
[-10, 1, 3, 5, 9, 23, 45]
*/

// void InpunArray(int[] array)
// {
//     for (int i = 0; i < array.Length; i++)
//     {
//         array[i] = new Random().Next(-20, 21);
//     }
// }

// int[] sortVibor(int[] array)
// {
//     for(int i = 0; i < array.Length; i++)
//     {
//         int min = i;// предполжим 0 индекс есть минимум
//         for (int j = i; j < array.Length; j++) // i = j цикл проверяет не отсортированую часть миссива
//         {
//             if(array[j] < array[min])
//             {    
//                 min = j;
//             }
//         }
//         if (array[min] == array[i])
//         {
//             continue;
//         }
//         int temp = array[i];
//         array[i] = array[min];
//         array[min] = temp;
//     }
//     return array;
// }

// Console.Clear();
// System.Console.WriteLine("Введите колво эл-ов массива: ");
// int n = int.Parse(Console.ReadLine()!);
// int[] array = new int[n];
// InpunArray(array);
// System.Console.WriteLine($"[{string.Join(", ", array)}]");
// System.Console.WriteLine(string.Join(", ", sortVibor(array)));

int[] InputSort(int[] array)
{  
    int min;
    int temp;
    for (int i = 0; i < array.Length; i++)
    {
        min = i;
        for (int j = i; j < array.Length; j++)
        {
            if (array[j] < array[min])
            {
                min = j;
            }        
        }
        temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
    return array;
}

void InpunArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(-20, 21);
    }
}
Console.Clear();
System.Console.WriteLine("Введите колво эл-ов массива: ");
int n = int.Parse(Console.ReadLine()!);
int[] array = new int[n];
InpunArray(array);
System.Console.WriteLine($"[{string.Join(", ", array)}]");
System.Console.WriteLine(string.Join(", ", InputSort(array)));