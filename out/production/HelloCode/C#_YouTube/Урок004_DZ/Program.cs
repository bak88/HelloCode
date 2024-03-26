Console.Clear();

// // Напишите программу, вычисляющиую среднее фрифмитическое двух чисел.

// System.Console.WriteLine("Введите число 1: ");
// double firstValue =  Convert.ToDouble(Console.ReadLine()!);

// System.Console.WriteLine("Введите число 2: ");
// double secondValue = double.Parse(Console.ReadLine()!);

// double result = (firstValue + secondValue) / 2;

// System.Console.Write("Ответ: ");
// System.Console.WriteLine(result);



// // Введите три числа и выведите на экран значение суммы и произведения этих чисел

// System.Console.WriteLine("Введите число 1: ");
// double firstValue = Convert.ToDouble(Console.ReadLine()!);

// System.Console.WriteLine("Введите число 2: ");
// double secondValue = double.Parse(Console.ReadLine()!);

// System.Console.WriteLine("Введите число 3: ");
// double thirdValue = Convert.ToDouble(Console.ReadLine()!);

// double sumResult = firstValue + firstValue + thirdValue;

// double multResult = firstValue * firstValue * thirdValue;

// System.Console.WriteLine($"Ответ: {firstValue} + {secondValue} + {thirdValue} = {sumResult}");
// System.Console.Write($"Ответ: {firstValue} * {secondValue} * {thirdValue} = {multResult}");



// Напишите простой конвертер валют. Валюты заданы хардкодом и не изменяются.

System.Console.WriteLine("Курс 1 Доллара США = 3,16 Белоруского рубля\nВведите сумму в рублях ");
int a = Convert.ToInt32(Console.ReadLine()!);

double result = a / 3.16;

System.Console.WriteLine($"Сумма в USD = {result}");

 