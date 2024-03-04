Console.Clear();

for (int i = 0, j = 8; i < 6; i++, j--)
{
    //System.Console.WriteLine("i: " + i);
    System.Console.WriteLine("j: " + j);
}
System.Console.WriteLine();

for (int i = 5; i >= 0; i--)
{
    System.Console.Write(i + " ");
}
System.Console.WriteLine();
System.Console.WriteLine();

for (int i = 0, j = 0; i < 10 && j < 7; i++, j++)
{
    System.Console.Write("i:" + i);
    System.Console.WriteLine(" j:" + j);
}