
/*
    конвертация строки
    класс Convert
*/
internal class Program
{
    private static void Main(string[] args)
    {
        Console.Clear();

        // string str1 = "3";
        // string str2 = "6";
        // System.Console.WriteLine(str1 + str2);

       
    string str;

        int a;
        double b;

        System.Console.WriteLine("Введите число 1: ");

        str = Console.ReadLine()!;

        a = Convert.ToInt32(str);

        System.Console.WriteLine("Введите число 2: ");

        str = Console.ReadLine()!;

        b = Convert.ToDouble(str);

        System.Console.WriteLine($"{a + b}");
    }
}