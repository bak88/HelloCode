// // Вид 1
// void Method1() // ничего не возвращают и ничего непринимают
// {
//      System.Console.WriteLine("Автор ...");
// }
// Method1();

// // Вид 2
// void Method2( string msd) // ничего не возвращают, но принимают аргументы
// {
// System.Console.WriteLine(msd);
// }
// Method2("Hello");

// void Method2_1(string msd, int count)
// {
//     int i = 0;
//     while (i < count)
//     {
//         System.Console.WriteLine(msd);
//         i++;
//     }
// }
// Method2_1(msd: "Teckst", count: 4);
// Method2_1(count: 4, msd: "new Teckst");

// // Вид 3
// int Method3() // метод возвращает, аргументы не принимает
// {
//     return DateTime.Now.Year;
// }

// int year = Method3();
// System.Console.WriteLine(year);

// //Вид 4
// string Method4(int count, string text) // что то принимают и что то возвращают
// {
//     string result = String.Empty; //пустая строка

//     for (int i = 0; i < count; i++)
//     {
//         result = result + text;
//     }
//     return result;
// }
// string res = Method4(10 , " Ты сможешь");
// System.Console.WriteLine(res);

// for (int i = 2; i <= 10; i++) // таблица умножения
// {
//     for (int j = 2; j <= 10; j++)
//     {
//         System.Console.WriteLine($"{i} * {j} = {i * j}");
//     }
//     System.Console.WriteLine();
// }

// string text = "- Я думаю, - сказал князь, улыбаясь, - что, "
//             + "ежели бы вас послали вместо нашего милого Винценгероде,"
//             + "вы бы взяли приступом согласие прусского короля. "
//             + "Вы так краснореивы. Вы дадите мне чаю?";

// string Replace(string text, char oldValue, char newValue)
// {
//     string result = String.Empty; 
    
//     int length = text.Length;
//     for (int i = 0; i < length; i++)
//     {
//         if (text[i] == oldValue)
//         {
//             result = result + $"{newValue}";
//         }
//         else
//         {
//             result = result + $"{text[i]}";
//         }
//     }
//     return result;
// }

// string newText = Replace(text, ' ', '|');
// System.Console.WriteLine(newText);

// System.Console.WriteLine();
// newText = Replace(newText, 'к', 'К');
// System.Console.WriteLine(newText);

int[] arr = {42, 1, 27, 31, 26, 14, 95, 80, 46, 95, 5, 38, 24, 21, 8};

void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        System.Console.Write($"{array[i]} ");
    }
    System.Console.WriteLine();
}

void NumberSort(int[] array)
{
    for (int i = 0; i < array.Length - 1; i++)
    {
        int min = i;

        for (int j = i + 1; j < array.Length; j++)
        {
            if (array[j] < array[min])
            {
                min = j;
            }
        }
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
}
PrintArray(arr);
NumberSort(arr);

PrintArray(arr);