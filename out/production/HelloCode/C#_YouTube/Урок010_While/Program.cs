Console.Clear();

System.Console.WriteLine("Введите первое число диапазона: ");
int first = int.Parse(Console.ReadLine()!);
System.Console.WriteLine("Введите второе число диапазона: ");
int limit = int.Parse(Console.ReadLine()!);

uint countEven = 0;
uint countOdd = 0;
int resultEven = 0;
int resultOld = 0;


while (first <= limit)
{
    
    if (first % 2 == 0)
    {
        resultEven += first;
        countEven++;
    }
    else 
    {
        resultOld += first;
        countOdd++;
    }
    first++;
}
System.Console.WriteLine($"Количество четных числа: {countEven}");
System.Console.WriteLine($"Сумма четных числа: {resultEven}");
System.Console.WriteLine($"Количество нечетных числа: {countOdd}");
System.Console.WriteLine($"Сумма нечетных числа: {resultOld}");
