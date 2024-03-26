Console.Clear();

// // Задача 1: Задайте двумерный массив символов 
// // (тип char [,]). Создать строку из символов этого массива. 

// Console.Clear();
// char[,] matrix = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
// foreach (char item in matrix)
// {
//     System.Console.Write($"{item}");
// }



// // Задача 2: Задайте строку, содержащую латинские буквы 
// // в обоих регистрах. Сформируйте строку, в которой все 
// // заглавные буквы заменены на строчные. 


// System.Console.WriteLine("Введите строку: ");
// string str = Console.ReadLine()!;
// string new_str = string.Empty;
// for ( int i = 0; i < str.Length; i++ )
//     {
//         if ( char.IsUpper(str[i]))  // Показывает, относится ли указанный символ в указанной позиции 
//         {                           // в указанной строке к категории букв верхнего регистра.
//             new_str += char.ToLower(str[i]); // Преобразует значение указанного символа Юникода 
//         }                                     //в его эквивалент в нижнем регистре
//         else 
//         {
//             new_str += str[i];
//         }        
//     }
//     Console.WriteLine(new_str);



// Задача 3: Задайте произвольную строку. Выясните, 
// является ли она палиндромом.

System.Console.WriteLine("Введите строку палиндром: ");
string str = Console.ReadLine()!;
bool isPalindrome = IsPalindrome(str);
Console.WriteLine(isPalindrome ? "Да" : "Нет");

bool IsPalindrome(string str)
{
    string normalized = new
    string(str.Where(char.IsLetterOrDigit).ToArray()).ToLower();
    return normalized.SequenceEqual(normalized.Reverse());
}