// int number = 1;
// if (number % 2 == 0){
//  Console.Write($"Число `{number}` чётное");
//     }else{
//       Console.Write($"Число `{number}` нечётное");
//     }
  
//     System.Console.WriteLine();

Console.Clear();
System.Console.WriteLine("enter 1st number: ");
float a = float.Parse(Console.ReadLine()!);
System.Console.WriteLine("enter 2st number: ");
int b = int.Parse(Console.ReadLine()!);

System.Console.WriteLine($"{a} + {b} = {a + b}");
System.Console.WriteLine($"{a} - {b} = {a - b}");
System.Console.WriteLine($"{a} * {b} = {a * b}");
System.Console.WriteLine($"{a} / {b} = {a / b}");