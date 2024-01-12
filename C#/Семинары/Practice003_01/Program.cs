// Задайте массив. Напишите программу, которая определяет, 
// присутствует ли заданное число в массиве. Программа 
// должна выдать ответ: Да/Нет.

// Примеры

// [1 3 4 19 3], 8 => Нет
// [-4 3 4 1], 3 => Да 

Console.Clear();
 int[] FillArray(int size)
 {
    int[] array = new int[size];
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(-5, 6);
    }
    return array;
 }

 void PrintArray(int[] inArray)
 {
    for (int i = 0; i < inArray.Length; i++)
    {
        System.Console.Write(inArray[i] + " ");
    }
    System.Console.WriteLine();
 }

 void FindNumberInArray(int num, int[] ar)
{
    bool flag = false;
    foreach (int item in ar)
    {
        if (item == num)
        {
            flag = true;
        }
    }
    if (flag)
    {
        System.Console.WriteLine("yes");
    }
    else
    {
        System.Console.WriteLine("no");
    }
}

 int lenghtArray = 8;
 int[] arr = FillArray(lenghtArray);
 PrintArray(arr);

 int lenghtArray2 = 12;
 int[] arr2 = FillArray(lenghtArray2);
 PrintArray(arr2);

System.Console.WriteLine("Введите число");
int number = int.Parse(Console.ReadLine()!);
FindNumberInArray(number, arr);


