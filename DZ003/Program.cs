Console.Clear();

int[] FullArray(int size)
{
    int[] array = new int[size];
    for (int i = 0; i < array.Length; i++)
    {
       array[i] = new Random().Next(1, 100); 
    }
    return array;
}

void PrintArray(int[] PriArr)
{
    for (int i = 0; i < PriArr.Length; i++)
    {
        System.Console.Write(PriArr[i] + " ");
    }
    System.Console.WriteLine();
}

int lenArr = 10;
int[] arr = FullArray(lenArr);
int count = 0;
PrintArray(arr);
FindNumber(arr);

void FindNumber(int[] FinNum)
{
    for (int i = 0; i < FinNum.Length; i++)
    {
        if (FinNum[i] > 20 && FinNum[i] < 90)
        {
            count++;
        }
    }
     System.Console.Write(count);
}
