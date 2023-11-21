Console.Clear();
System.Console.WriteLine("Введите трехзнаное число: ");
int n = int.Parse(Console.ReadLine()!);


while (n < 100 || n > 999)
{
    System.Console.WriteLine("Ошибка !\nВведите трехзнаное число: ");
    n = int.Parse(Console.ReadLine()!);
    }

int n2 = n / 10 % 10;
int n3 = n % 10;
int result = 1;
Console.WriteLine($"{n2}{n3}");

for (int i = 1; i <= n3; i++)
{
    result = result * n2;
    /*
    1 = 1 * 6       5 = 1296 * 6    9
    2 = 6 * 6       6 = 7776 * 6
    3 = 36 * 6      7 = 46656 * 6
    4 = 216 * 6     8 = 279936 * 6
    */
}
  Console.WriteLine($"{n2}^{n3} = {result}");
