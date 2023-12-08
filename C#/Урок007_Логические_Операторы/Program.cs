internal class Program
{
    /*      Логические операторы

                &&      Сокращенное И
                ||      Cокращенное ИЛИ
                &       И
                |       ИЛИ
                !       НЕ (унарный)

    */

    private static void Main(string[] args)
    {
        Console.Clear();
        // bool isInfected = false;

        // if (!isInfected) // приставка не(!)
        // {
        //    System.Console.WriteLine("Персонаж здоров!");
        // }
        // else
        // {
        //     System.Console.WriteLine("Персонаж инфицирован!");
        // }


        bool isHighTemperature = true;

        bool hasNoCooling = false;

        if (isHighTemperature || hasNoCooling) 
        {
            System.Console.WriteLine("Угроза повреждения процессора!");
        }
        
    }
}