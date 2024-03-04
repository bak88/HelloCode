

internal class Program
{
    private static void Main(string[] args)
    {
        Console.Clear();

        // for (int i = 1; i <= 3; i++)
        // {
        //     System.Console.WriteLine("цикл 1 итерация №: " + i);

        //     for (int j = 1; j <= 5; j++)
        //     {
        //         System.Console.WriteLine("\tцикл 2 итерация №: " + j);

        //         for (int k = 1; k <= 2; k++)
        //         {
        //             System.Console.WriteLine("\t\tцикл 3 итерация №: " + k);
        //         }
        //     }
        // }

        System.Console.WriteLine("Введите высоту прямоугольника");

        int height = int.Parse(System.Console.ReadLine());

        System.Console.WriteLine("Введите ширену прямоугольника");

        int width = int.Parse(System.Console.ReadLine());

        for (int j = 0; j < height; j++)
        {                 
            for (int i = 0; i < width; i++)
            {
                System.Console.Write("#");
            }
            System.Console.WriteLine();
        }

    }
}