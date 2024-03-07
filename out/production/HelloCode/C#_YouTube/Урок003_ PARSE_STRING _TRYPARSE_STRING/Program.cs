    Console.Clear();

    // // Parse
    // string str = "5";

    // int a = int.Parse(str); // Целое число

    // System.Console.WriteLine(a);


    // string str2 = "6,8";

    // double b = double.Parse(str2); // Вещественное число

    // System.Console.WriteLine(b);



    // TryParse

    string str = "1488";

    int a;

    bool result = int.TryParse(str, out a); // Принимает 2 параметра(строку и возвращаемое значение)
    // и возвращает bool(true or false)

    if (result)
    {
        System.Console.WriteLine(a);
    }
    else
    {
        System.Console.WriteLine("error");
    }
