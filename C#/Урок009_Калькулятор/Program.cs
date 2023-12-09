Console.Clear();




// Калькуляьор через switch

System.Console.WriteLine("Введите первое число: ");
double a = double.Parse(Console.ReadLine()!);
System.Console.WriteLine("Введите операцию '+', '-', '*', '/' ");
string action = Console.ReadLine()!;
System.Console.WriteLine("Введите второе число: ");
double b = Convert.ToDouble(Console.ReadLine());
double result;

switch (action)
{
    case "+":
        {
            result = a + b;
            System.Console.WriteLine(result);
        }
        break;
    case "-":
        {
            result = a - b;
            System.Console.WriteLine(result);
        }
        break;
    case "*":
        {
            result = a * b;
            System.Console.WriteLine(result);
        }
        break;
    case "/":
        {
            if (b == 0)
            {
                System.Console.WriteLine("Ошибка!!! Делить на ноль нельзя");
            }
            else
            {
                result = a / b;
                System.Console.WriteLine(result);
            }
        }
        break;
    default:
        {
            System.Console.WriteLine("Ошибка!!! Такой операции нет");
        }
        break;
}




// // Калькуляьор через if, else

// System.Console.WriteLine("Введите первое число: ");
// double a = double.Parse(Console.ReadLine()!);
// System.Console.WriteLine("Введите операцию '+', '-', '*', '/' ");
// string action = Console.ReadLine();
// System.Console.WriteLine("Введите второе число: ");
// double b = Convert.ToDouble(Console.ReadLine());
// double result;


// if (action == "+")
// {
//    result = a + b;
//    System.Console.WriteLine(result);
// }
// else if (action == "-")
// {
//     result = a - b;
//    System.Console.WriteLine(result);
// }
// else if (action == "*")
// {
//     result = a * b;
//    System.Console.WriteLine(result);
// }
// else if (action == "/")
// {
//     if(b == 0)
//     {
//         System.Console.WriteLine("Ошибка!!! На ноль делить нельзя");
//     }
//     else
//     {
//          result = a / b;
//         System.Console.WriteLine(result);
//     }

// }