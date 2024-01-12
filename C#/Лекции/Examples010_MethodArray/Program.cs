Console.Clear();

int[] array = {1, 22, 38, 4, 25, 46, 7, 8, 69, 22};

int n = array.Length;
int find = 22; 
int index = 0;

while (index < n)
{
       if (array[index] == find)
       {
        System.Console.WriteLine(index);
        break;
       }
    index++;
}
