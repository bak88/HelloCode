Console.Clear();
System.Console.WriteLine("Введите трехзнаное число: ");
int n = int.Parse(Console.ReadLine()!);


while (n < 100 || n > 999)
{
    System.Console.WriteLine("Ошибка !\nВведите трехзнаное число: ");
    n = int.Parse(Console.ReadLine()!);
}

    int n1 = n / 100;
    int n3 = n % 10;
    System.Console.WriteLine($"{n1}{n3}" );
