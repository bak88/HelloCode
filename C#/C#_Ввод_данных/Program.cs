/*
   Ввод данных в консоль
*/


internal class Program
{
    private static void Main(string[] args)
    {
        string data;

        data = Console.ReadLine()!;

        System.Console.WriteLine("Привет "+ data + "!!!");
    }
}