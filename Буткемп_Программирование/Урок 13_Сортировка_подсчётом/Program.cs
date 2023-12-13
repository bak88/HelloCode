Console.Clear();

int[] array = { 0, 2, 4, 10, 20, 5, 6, 1, 2};

int[] sortedArray = CountingSortExtended(array);

//CountingSort(array);

System.Console.WriteLine(string.Join(", ", sortedArray));

void CountingSort(int[] inputArray)
{
    int[] counter = new int[10];

    for (int i = 0; i < inputArray.Length; i++)
    {
        counter[inputArray[i]]++;
    }

    int index = 0;
    for (int i = 0; i < counter.Length; i++)
    {
        for (int j = 0; j < counter[i]; j++)
        {
            inputArray[index] = i;
            index++;
        }
    }
}

int[] CountingSortExtended(int[] inputArray)
{
    int max = inputArray.Max();

    int[] sortedArray = new int[inputArray.Length];

    int[] counter = new int[max + 1];

    for (int i = 0; i < inputArray.Length; i++)
    {
        counter[inputArray[i]]++;
    }

    int index = 0;
    for (int i = 0; i < counter.Length; i++)
    {
        for (int j = 0; j < counter[i]; j++)
        {
            sortedArray[index] = i;
            index++;
        }
    }
    return sortedArray;
}