// //Задача 1


// Console.Clear();
// System.Console.WriteLine("Введите число");
// int firstNumber = int.Parse(Console.ReadLine()!);

// if (firstNumber % 7 == 0 && firstNumber % 23 == 0)
// {
//     System.Console.WriteLine($"Да {firstNumber} кратно");    
// } 
// else
// {
//     System.Console.WriteLine($"Нет, {firstNumber} не кратно");
// }


// //Задача 2
// Console.Clear();
// System.Console.WriteLine("Введите координату х: ");
// int x = int.Parse(Console.ReadLine()!);
// System.Console.WriteLine("Введите координату y: ");
// int y = int.Parse(Console.ReadLine()!);
// while (x == 0 || y == 0)
// {
//     System.Console.WriteLine("Введите координату не равную 0!");
//     System.Console.WriteLine();
//     System.Console.WriteLine("Введите координату х: ");
//     x = int.Parse(Console.ReadLine()!);
//     System.Console.WriteLine("Введите координату y: ");
//     y = int.Parse(Console.ReadLine()!);
// }
// if (x > 0 && y > 0)
// {
//     System.Console.WriteLine("Координаты принадлежат 1ой четверти");
// }
// else if (x < 0 && y > 0)
// {
//     System.Console.WriteLine("Координаты принадлежат 2ой четверти");
// }
// else if (x < 0 && y < 0)
// {
//     System.Console.WriteLine("Координаты принадлежат 3ей четверти");
// }
// else if (x > 0 && y < 0)
// {
//     System.Console.WriteLine("Координаты принадлежат 4ой четверти");
// }


// //Задача 3
// Console.Clear();
// System.Console.WriteLine("Введите число от 10 до 99");
// int n = int.Parse(Console.ReadLine()!);
// while (n < 10 || n > 99)
// {
//     System.Console.WriteLine("Ошибка!\nВведите число от 10 до 99");
//     n = int.Parse(Console.ReadLine()!);
// }
//  int n2 = n / 10;
//  int n3 = n % 10;

//  if (n2 < n3)
//  {
//     System.Console.WriteLine(n3);
//  }
//  else if (n2 > n3)
//  {
//     System.Console.WriteLine(n2);
//  }
//  else
//  {
//     System.Console.WriteLine(n2);
//  }


// // Задача 4 
// Console.Clear();
// System.Console.WriteLine("Введите натурально число");
// int n = int.Parse(Console.ReadLine()!);

// while (n <= 0)
// {
//     System.Console.WriteLine("Ошибка!\nВведите натуральное число");
//     n = int.Parse(Console.ReadLine()!);
// }
// while (n > 0)
// {
//     int x = n % 10;
//     System.Console.Write($"{x}, ");
//     n /= 10;
// }
