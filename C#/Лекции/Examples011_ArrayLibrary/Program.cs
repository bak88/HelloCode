Console.Clear();

void FillArray(int[] collection)
{
    int length = collection.Length;
    int index = 0;
    while (index < length)
    {
        collection[index] = new Random().Next(1, 10);
        index++;
    }
}

void PrintArray(int[] col)
{
    int count = col.Length;
    int pos = 0;
    while (pos < count)
    {
        System.Console.Write($"{col[pos]} ");
        pos++;
    }
}

int IndexOf(int[] collect, int find)
{
    int count = collect.Length;
    int index = 0;
    int position = -1;

    while (index < count)
    {
        if (collect[index] == find)
        {
            position = index;
            break; 
        }
        index++;
    }
    return position;
}

int[] array = new int[10];

FillArray(array); 
PrintArray(array);
System.Console.WriteLine();

int pos = IndexOf(array, 554);
System.Console.Write(pos);

