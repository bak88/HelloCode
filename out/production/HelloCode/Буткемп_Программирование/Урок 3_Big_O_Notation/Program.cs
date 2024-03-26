// Console.Clear();
// int n = 5;
// int [] array = new int[n];
// for(int i = 0; i < n; i++)
//     {
//         array[i] = Convert.ToInt32(Console.ReadLine());
//     }
//     Console.Write("[" + string.Join(", ", array) + "]");
//     System.Console.WriteLine();

// // Сложность алгоритма или (Онатация(О))   O(1) - это кол-во действий что бы узнать конечный результат

// // [4, 5, 3, 1, 2]
// // O(n)
// // [1, 2, 3, 4, 5] - O(n*log n) <- алгоритм быстрой сортировки 
// // ((1 + n)/2)*n -> ((1 + 5) / 2 * 5)   O(1)
// // n < n * log(n) + 1

// int sum = 0;
// for (int i = 0; i < n; i++)
// {
//     sum += array[i];
// }
// System.Console.WriteLine(sum);
int n = Convert.ToInt32(Console.ReadLine());
int[,] matrix = new int[n, n];
for (int i = 0; i < n; i++)
{
    for(int j = i; j < n; j++)
    {
                   
        matrix[i, j] = (i + 1) * (j + 1);
        matrix[j, i] = (i + 1) * (j + 1);
        
    }
    System.Console.WriteLine();
}
for (int i = 0; i < n; i++)
{
    for(int j = 0; j < n; j++)
    {      
        System.Console.Write(matrix[i, j]); 
        System.Console.Write("\t");
        
    }
    System.Console.WriteLine();
}