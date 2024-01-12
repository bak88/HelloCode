Console.Clear();
System.Console.WriteLine("Enter 1st number");
int number = int.Parse(Console.ReadLine()!);
number = Math.Abs(number); // Модуль числа |-5| = 5
if (number < 100)
{
    System.Console.WriteLine("Third numbers is not");
}
else
{
    System.Console.WriteLine(number % 1000 / 100);
}