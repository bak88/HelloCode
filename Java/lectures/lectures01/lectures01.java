 /*
* многострояный комментарий
*/

// однострочный комментарий

package Java.lectures.lectures01;


public class lectures01 {
    public static void main(String[] args) {
// Типы данных и переменные
/*
*  Типы данных:
* 
*  - Примитивные :
*  boolean
*  int, short, long и т.д.
*  float, double
*  char
* 
*  - Ссылочные:
*  массивы
*/ 

// Операции Java
// ● Присваивание: =
// ● Арифметические: *, /, +, -, %, ++, --
// ● Операции сравнения: <, >, ==, !=, >=, <=
// ● Логические операции: ||, &&, ^, !
// ● Побитовые операции <<, >>, &, |, ^  

// int b = 10;

// b = b-- - --b;
// System.out.println(b);

// Виды спецификаторов
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме,
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений


    



// Неявная типизация
        // var a = 123;
        // System.out.println(a);
        // System.out.println(getType(a));

        // var b = 123.456;
        // System.out.println(b);

// Строки
        // String s = "qwerty";
        // System.out.println(s.charAt(2)); // Вывод ел-та с индексом 2
        // System.out.println(s.length()); // Вывод длинны строки

// Основы: классы-обертки
// Примитив Обертка
// int      Integer
// short    Short
// long     Long
// byte     Byte
// float    Float
// double   Double
// char     Character
// boolean  Boolean

// Основы: типы данных
        // System.out.println(Integer.MAX_VALUE); 
        // System.out.println(Integer.MIN_VALUE);

// Массивы

    // Одномерные
        // int[] arr = new int[10];
        // System.out.println(arr.length); // 10
        // arr = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println(arr.length); // 5

    // Многомерные 
        // int[] arr[] = new int[3][5];

        //     for (int[] line : arr) {
        //         for (int item : line) {
        //             System.out.printf("%d ", item);
        //     }
        //     System.out.println();
        // }

        // int[][] arr1 = new int[3][6];

        //     for (int i = 0; i < arr1.length; i++) {
        //         for (int j = 0; j < arr1[i].length; j++) {
        //             System.out.printf("%d ", arr1[i][j]);
        //         }
        //     System.out.println();
        // }

// Преобразования

        // int i = 123; 
        // double d = i;
        // System.out.println(i); // 123
        // System.out.println(d); // 123.0

        // d = 3.9415; 
        // i = (int)d;
        // System.out.println(d); // 3.9415
        // System.out.println(i); // 3

        // byte b = Byte.parseByte("123");
        // System.out.println(b); // 123

        // b = Byte.parseByte("1234");
        // System.out.println(b); // NumberFormatException: Value out of range

// Получение данных из терминала

    // Строки
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

    // Некоторые примитивы
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

    // Проверка на соответствие получаемого типа
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt(); // Проверка на число типа int
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();
       
    // Форматированный вывод
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);

        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res);

// Управляющие конструкции: 
    // условный оператор
        // 1 Способ
            // int a = 1;
            // int b = 2;
            // int c;
            // if (a > b) {
            // c = a;
            // } else {
            // c = b;
            // }
            // System.out.println(c);

        // 2 Способ
            // int a = 1;
            // int b = 2;
            // int c = 0;
            // if (a > b) c = a;
            // if (b > a) c = b;
            // System.out.println(c);

    // тернарный оператор
        // int a = 1;
        // int b = 2;
        // int min = a < b ? a : b; // если условие верное до ? вернется а до : , иначе вернется b
        // System.out.println(min);

// Оператор выбора

    // int mounth = 2;
    // String text = "";
    // switch (mounth) {
    //     case 1:
    //         text = "Autumn";
    //         break;
    //     default:
    //         text = "mistake";
    //         break;
    // }
    // System.out.println(text);
    // // iScanner.close();
   
        
       
            
        
          
        
    }
    
}
