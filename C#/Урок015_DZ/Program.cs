Console.Clear();

System.Console.Write("Введите выссоту треугольника: ");

int height = int.Parse(Console.ReadLine()!);

for (int i = 0; i < height; i++)
{
    for (int j = 0; j <= i; j++)
    {
        System.Console.Write("+");
    }

    System.Console.WriteLine();
}
System.Console.WriteLine();

for (int i = 0; i < height; i++)
{
    for (int j = height; j > i; j--)
    {
        System.Console.Write("+");
    }

    System.Console.WriteLine();
}
System.Console.WriteLine();

for (int i = 0; i < height; i++)
{
    for (int j = height; j > i; j--)
    {
        System.Console.Write(" ");
    }
    for (int j = 0; j <= i; j++)
    {
        System.Console.Write("+");
    }
    System.Console.WriteLine();
}
System.Console.WriteLine();

for (int i = 0; i < height; i++)
{
    for (int j = 0; j <= i; j++)
    {
        System.Console.Write(" ");
    }
    for (int j = height; j > i; j--)
    {
        System.Console.Write("+");
    }
    System.Console.WriteLine();
}