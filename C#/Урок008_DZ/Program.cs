Console.Clear();

// // Напишите программу, вычисляющиую среднее фрифмитическое двух чисел.

// System.Console.WriteLine("Введите число 1: ");
// string str = Console.ReadLine()!;
// double a =  Convert.ToDouble(str);

// System.Console.WriteLine("Введите число 2: ");
// string str2 = Console.ReadLine()!;
// double b = double.Parse(str2);

// double result = (a + b) / 2;

// System.Console.Write("Ответ: ");
// System.Console.WriteLine(result);



// // Введите три числа и выведите на экран значение суммы и произведения этих чисел

// System.Console.WriteLine("Введите число 1: ");
// string str = Console.ReadLine()!;
// double a = Convert.ToDouble(str);

// System.Console.WriteLine("Введите число 2: ");
// string str1 = Console.ReadLine()!;
// double b = double.Parse(str1);

// System.Console.WriteLine("Введите число 3: ");
// string str2 = Console.ReadLine()!;
// double c = Convert.ToDouble(str2);

// double result = (a + b) * c;

// System.Console.Write($"Ответ: ({a} + {b}) * {c} = {result}");



// Напишите простой конвертер валют. Валюты заданы хардкодом и не изменяются.

System.Console.WriteLine("Курс 1 Доллара США = 3,16 Белоруского рубля\nВведите сумму в рублях ");
string str = Console.ReadLine()!;
int a = Convert.ToInt32(str);

double result = a / 3.16;

System.Console.WriteLine($"Сумма в USD = {result}");

 