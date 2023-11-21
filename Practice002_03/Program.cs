Console.Clear();
System.Console.WriteLine("Enter 1st number");
int firstNumber = int.Parse(Console.ReadLine()!);
System.Console.WriteLine("Enter 2st number");
int secondNumber = int.Parse(Console.ReadLine()!);
if (firstNumber % secondNumber == 0)
{
    System.Console.WriteLine("yes");    
} else
{
    System.Console.WriteLine($"no, {firstNumber % secondNumber}");
}