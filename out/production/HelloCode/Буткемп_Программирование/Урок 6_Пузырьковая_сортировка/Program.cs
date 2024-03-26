Console.Clear();
System.Console.WriteLine("Введите кол-во эл-ов массива: ");
string str = Console.ReadLine()!;
int n = Convert.ToInt32(str);
int[] array = new int[n];

for (int i = 0; i < n; i++)
{
    array[i] = Random.Shared.Next(10);
}
System.Console.WriteLine($"[{string.Join(", ", array)}]");

for (int k = 0; k < n - 1; k++)
{
    for (int j = 0; j < n - 1 - k; j++)
    {
        if (array[j] > array[j + 1])
        {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }
}
System.Console.WriteLine($"[{string.Join(", ", array)}]");