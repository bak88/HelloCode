//Console.Clear();

// bool accessAllowed;

// string storedPassword = "qwerty";
// string enterPassword = Console.ReadLine()!;

// // // Пример 1 через if, else
// // if (storedPassword == enterPassword)
// // {
// //     accessAllowed = true;
// // }
// // else
// // {
// //     accessAllowed = false;
// // }

// // // Пример 2 через Тернарный оператор

// accessAllowed = enterPassword == storedPassword ? true : false;

// System.Console.WriteLine(accessAllowed);


int inputData = int.Parse(Console.ReadLine()!);

int outputData = inputData < 0 ? 1 : inputData;

System.Console.WriteLine(outputData);