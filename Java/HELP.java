package Java;

import java.util.Scanner;

public class HELP {
    public static void main(String[] args) {
        
    //    int x = Integer.parseInt(строка); Где int x – это объявление целочисленной переменной x, а строка — это число заданное в виде строки (строка состоящая из цифр).
    //    int number = Integer.parseInt("321" + 0); 3210


// String Методы

    //     boolean isEmpty() Проверяет, что строка == пустая строка

    //     boolean isBlank() Проверяет, что в строке — только whitespace-символы: пробел, tab, enter и т.п.

    //     char charAt(int index) Возвращает символ, который стоит на index-позиции в строке.

    //     char[] toCharArray() Возвращает массив символов (копию), из которых состоит строка
    //     String path = console.nextLine();
    //     char[] chars = path.toCharArray();

    //     byte[] getBytes() Преобразует строку в набор байт и возвращает массив байт.

    //     String[] split(String regex) Разделяет строку на несколько подстрок.
    //     String path = "asas";
    //     String[] array = path.split("");

    //     String join(CharSequence delimiter, elements) Склеивает вместе несколько подстрок
    //     String result = String.join("\\", array);

    //     replace(" ", "||") заменяем один символ на второй
    //     String result = path.replace('/', '\\');

    //     String intern() Помещает строку в пул StringPool.

    //    String.valueOf()  Для перевода экземпляра любого Java-класса или любого примитивного типа данных к строковому представлению,
    //    String a = String.valueOf(1);

    //    int length() позволяет узнать длину строки – сколько в ней символов.
    //    String name = "Rom";
    //    int count = (name + 12).length(); 5 символов


//   Сравнение строк

    //    toLowerCase() позволяет преобразовать все символы строки в маленькие (строчные)
    //    String name = "ROM123";
    //    String name2 = name.toLowerCase(); rom123

    //    toUpperCase() позволяет преобразовать все символы строки в большие (заглавные)
    //    String name = "Rom";
    //    String name2 = name.toUpperCase();

    //    boolean startsWith(String prefix) Проверяет, что текущая строка начинается со строки prefix

    //    boolean endsWith() – проверяет, заканчивается ли эта строка указанным окончанием.
    //    String str = "sumo";
    //    String ending = "amo";
    //    System.out.println(str.endsWith(ending)); // false

    //    boolean equals() специальный метод — типа String
    //    строка1.equals(строка2)

    //    boolean equalsIgnoreCase() Сравнение строк без учета регистра
    //    строка1.equalsIgnoreCase(строка2)

    //    int compareTo(String str) Сравнивает строки лексикографически.
    //    Возвращает 0, если строки равны.
    //    Число меньше нуля, если текущая строка меньше строки-параметра.
    //    Число больше нуля, если текущая строка больше строки-параметра

    //    int compareToIgnoreCase(String str) Сравнивает строки лексикографически, игнорирует регистр.
    //    Возвращает 0, если строки равны.
    //    Число меньше нуля, если текущая строка меньше строки-параметра.
    //    Число больше нуля, если текущая строка больше строки-параметра

    //    boolean regionMatches(int toffset, String str, int offset, int len) Сравнивает части строк


// Поиск подстрок

    //    int indexOf(String str) Ищет строку str в текущей строке. Возвращает индекс первого символа встретившейся строки.
    //    int indexOf(String str, int index) Ищет строку str в текущей строке, пропустив index первых символов. Возвращает индекс найденного вхождения.
    //    int lastIndexOf(String str) Ищет строку str в текущей строке с конца. Возвращает индекс первого вхождения.
    //    int lastIndexOf(String str, int index) Ищет строку str в текущей строке с конца, пропустив index первых символов.
    //    boolean matches(String regex) Проверяет, что текущая строка совпадает с шаблоном, заданным регулярным выражением.


// Создание подстрок

    //    String substring(int beginIndex, int endIndex) Возвращает подстроку, заданную интервалом символов beginIndex..endIndex.
    //    String repeat(int count) Повторяет текущую строку count раз
    //    String replace(char oldChar, char newChar) Возвращает новую строку: заменяет символ oldChar на символ newChar
    //    String replaceFirst(String regex, String replacement) Заменяет в текущей строке подстроку, заданную регулярным выражением.
    //    String replaceAll(String regex, String replacement) Заменяет в текущей строке все подстроки, совпадающие с регулярным выражением.
    //    String toLowerCase() Преобразует строку к нижнему регистру
    //    String toUpperCase() Преобразует строку к верхнему регистру
    //    String trim() Удаляет все пробелы в начале и конце строки


// Класс StringTokenizer

    //    StringTokenizer имя = new StringTokenizer(строка, разделители)

    //    String nextToken() Возвращает следующую подстроку

    //    boolean hasMoreTokens() Проверяет, есть ли еще подстроки.


// Kласс StringFormatter

    //    String имя = String.format(шаблон, параметры)

        //    String s = String.format("Age=%d, Name=%s", age, name); Age=12, Name=Amigo
        //    %s String
        //    %d целое число: byte, short, int, long
        //    %f вещественное число: float, double
        //    %b boolean
        //    %c char
        //    %t Date
        //    %% Символ %


// Класс String Pool

    //    intern()  с помощью метода добавить две идентичные строки, метод вернет одинаковые ссылки.
    //    String a = new String("Привет");
    //    String b = new String("Привет");
    //    String t1 = a.intern();
    //    String t2 = b.intern();
    //    System.out.println(a == b); false
    //    System.out.println(t1 == t2); true


// Класс StringBuilder

    //    StringBuilder append(obj) Преобразовывает переданный объект в строку и добавляет к текущей строке
    //    StringBuilder insert(int index, obj) Преобразовывает переданный объект в строку и вставляет в текущую строку
    //    StringBuilder replace(int start, int end, String str) Заменяет часть строки, заданную интервалом start..end на переданную строку
    //    StringBuilder deleteCharAt(int index) Удаляет из строки символ под номером index
    //    StringBuilder delete(int start, int end) Удаляет из строки символы, заданные интервалом
    //    int indexOf(String str, int index) Ищет подстроку в текущей строке
    //    int lastIndexOf(String str, int index) Ищет подстроку в текущей строке с конца
    //    char charAt(int index) Возвращает символ строки по его индексу
    //    String substring(int start, int end) Возвращает подстроку, заданную интервалом
    //    StringBuilder reverse()  Разворачивает строку задом наперед.
    //    void setCharAt(int index, char) Изменяет символ строки, заданный индексом на переданный
    //    int length() Возвращает длину строки в символах






// Округление вещественных чисел

    //    Math.round() округляет число до ближайшего целого
    //    long x = Math.round(вещественное_число) результат работы этого метода — целочисленный тип long (не int).
    //    int x = (int) Math.round(вещественное_число)
    //    int x = (int) Math.round(4.1); 4
    //    int x = (int) Math.round(4.5); 5
    //    int x = (int) Math.round(4.9); 5

    //    Math.ceil() округляет число до целого вверх, примеры
    //    int x = (int) Math.ceil(4.1); 5
    //    int x = (int) Math.ceil(4.5); 5
    //    int x = (int) Math.ceil(4.9); 5

    //    Math.floor() округляет число до целого вниз, примеры:
    //    int x = (int) Math.floor(4.1); 4
    //    int x = (int) Math.floor(4.5); 4
    //    int x = (int) Math.floor(4.9); 4

    //    Хотя, для округления числа до целого вниз, использовать просто оператор приведения типа — (int):
    //    int x = (int) 4.9; 4

    //    Math.abs() вычисления модуля числа
    //
    //    double a = 1.000001;
    //    double b = 1.000002;
    //    if ( Math.abs(b - a) < 0.0001 )
    //    System.out.println("Числа равны");
    //    else
    //    System.out.println("Числа не равны");


// методы класса Scanner

    //    Scanner console = new Scanner(System.in);
    //    int a = console.nextInt();
    //    int b = console.nextInt();
    //    System.out.println(a + b);
    //
    //    nextByte() Считывает данные и преобразует их в тип byte
    //    nextShort() Считывает данные и преобразует их в тип short
    //    nextInt() Считывает данные и преобразует их в тип int
    //    nextLong() Считывает данные и преобразует их в тип long
    //    nextFloat() Считывает данные и преобразует их в тип float
    //    nextDouble() Считывает данные и преобразует их в тип double
    //    nextBoolean() Считывает данные и преобразует их в тип boolean
    //    next() Считывает одно «слово». Слова разделяются пробелами или enter
    //    nextLine() Считывает целую строку

    //    методы, которые позволяют проверить тип еще не считанных данных (чтобы знать, каким методом их считывать)
    //
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Введите число:");
    //
    //    if (sc.hasNextInt()) {
    //    int number = sc.nextInt();
    //    System.out.println("Спасибо! Вы ввели число " + number);
    //    } else {
    //    System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
    //    }
    //
    //    hasNextByte() Там тип byte? Его можно будет преобразовать к byte?
    //    hasNextShort() Там тип short? Его можно будет преобразовать к short?
    //    hasNextInt() Там тип int? Его можно будет преобразовать к int?
    //    hasNextLong() Там тип long? Его можно будет преобразовать к long?
    //    hasNextFloat() Там тип float? Его можно будет преобразовать к float?
    //    hasNextDouble() Там тип double? Его можно будет преобразовать к double?
    //    hasNextBoolean() Там тип boolean? Его можно будет преобразовать к boolean?
    //    hasNext() Там есть еще одно слово?
    //    hasNextLine() Там есть еще одна строка?

    //    useDelimiter() В этот метод передается строка, которую вы хотите использовать в качестве разделителя.
    //    Scanner scan = new Scanner("На голой ветке'" +
    //        "Ворон сидит одиноко.'" +
    //        "Осенний вечер." +
    //        "''***''" +
    //        "В небе такая луна,'" +
    //        "Словно дерево спилено под корень:'" +
    //        "Белеет свежий срез." +
    //        "''***''" +
    //        "Как разлилась река!'" +
    //        "Цапля бредет на коротких ножках,'" +
    //        "По колено в воде.");
    //
    //    scan.useDelimiter("'");
    //
    //    while (scan.hasNext()) {
    //    System.out.println(scan.next());
    //    }
    //
    //    scan.close();


// Тернарный оператор

    // Вариант первый — воспользоваться оператором if-else:
    // int age = 25;
    // int money;
    // if (age > 30)
    //    money = 100;
    // else
    //    money = 50;

    // Второй вариант — использовать тернарный оператор, то есть сокращенную запись оператора if-else:
    // int age = 25;
    // int money = age > 30 ? 100 : 50;


// Массивы

    //    Arrays.sort() выполняет сортировку массива
    //    int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
    //    Arrays.sort(numbers);

    //    Arrays.toString() для преобразования массива в строку и вывода на консоль
    //    int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
    //    System.out.println(Arrays.toString(numbers));

    //    Arrays.copyOf() мы передаем наш оригинальный массив (из которого надо скопировать значения)
    //    и длину нового массива, в который мы копируем данные. В данном случае в качестве длины
    //    мы указали numbers.length, т.к. хотим скопировать массив целиком.
    //    int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
    //    int [] numbersCopy = Arrays.copyOf(numbers, numbers.length);
    //    System.out.println(Arrays.toString(numbersCopy));
    //
    //    Если же мы хотим скопировать только несколько первых элементов,
    //    можно указать длину для нового массива меньше:
    //    int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
    //    int [] numbersCopy = Arrays.copyOf(numbers, 4);
    //    System.out.println(Arrays.toString(numbersCopy));

    //    Arrays.copyOfRange(numbers, 2,6) скопировать часть массива, но не с начала, а “из середины”
    //    int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
    //    int [] numbersCopy = Arrays.copyOfRange(numbers, 2,6);
    //    System.out.println(Arrays.toString(numbersCopy));

    //    Arrays.equals()   сравнить два массива между собой
    //    int[] numbers = {1, 2, 3};
    //    int[] numbers2 = {1, 2, 3};
    //    System.out.println(Arrays.equals(numbers, numbers2));

    //    deepEquals() для сравнения двумерных массивов
    //    deepToString() для вывода на консоль двумерных массивов
    //    int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    //    int[][] numbersCopy = Arrays.copyOf(numbers, numbers.length);
    //    System.out.println(Arrays.deepEquals(numbers, numbersCopy));
    //    System.out.println(Arrays.deepToString(numbersCopy));


// Константы  переменные, значения которых нельзя изменять

    // final тип имя = значение;

    // Обратите внимание, что final — это всего лишь защита от изменения переменной.
    // Если переменная хранит ссылку на объект, объект все-таки менять можно.
    //
    // final int[] data = {1, 2, 3, 4, 5, 6}; Создаем массив.
    //
    //data = new int[]{6, 7, 8, 9}; Так нельзя: переменная data объявлена как final.
    //
    //data[0] = 0; А так можно.
    //data[1] = 0; А так можно.
    //data[2] = 0; И так можно.


// Глобальные константы

    // для этого нужно создать статические переменные класса, а также сделать их public и final.
    // Для имен таких переменных существует специальный стиль написания: они пишутся заглавными буквами,
    // а в качестве разделителя слов выступает символ подчеркивания.
    //
    // class Solution
    // {
    //   public static final String SOURCE_ROOT = "c:\\projects\\my\\";
    //   public static final int DISPLAY_WIDTH = 1024;
    //   public static final int DISPLAY_HEIGHT = 768;
    // }








// Коллекции

    // add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
    // get(pos) – возвращает элемент из списка по указанной позиции
    // indexOf(item) – первое вхождение или -1
    // lastIndexOf(item) – последнее вхождение или -1
    // remove(pos) – удаление элемента на указанной позиции и его возвращение
    // set(int pos, T item) – softness значение item элементу, который находится на позиции pos
    // void sort(Comparator) – сортирует набор данных по правилу
    // subList(int start, int end) – получение набора данных от позиции start до end
    // clear() – очистка списка
    // toString() – «конвертация» списка в строку
    // Arrays.asList – преобразует массив в список
    // containsAll(col) – проверяет включение всех элементов из col
    // removeAll(col) – удаляет элементы, имеющиеся в col
    // retainAll(col) – оставляет элементы, имеющиеся в col
    // toArray() – конвертация списка в массив Object’ов
    // toArray(type array) – конвертация списка в массив type
    // List.copyOf(col) – возвращает копию списка на основе имеющегося
    // List.of(item1, item2,...) – возвращает неизменяемый список


// Множество коллекции Map

    // HashMap

        // Map<Integer, String> db = new HashMap<>();

        // put(K,V) – добавить пару если или изменить значение,если ключ имеется.
        // putIfAbsent(K,V) – произвести добавление если ключ не найден.
        // get(K) - получение значения по указанному ключу.
        // remove(K) – удаляет пару по указанному ключу.
        // containsValue(V) – проверка наличия значения.
        // containsKey(V) – проверка наличия ключа.
        // keySet() – возвращает множество ключей.
        // values() – возвращает набор значений.

        // HashMap<Integer, String> passportsAndNames = new HashMap<>();
        // passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        // passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        // passportsAndNames.put(8082771, "Дональд Джон Трамп");
        // passportsAndNames.put(162348, "Виктор Михайлович Стычкин"); повторный ключ перезапишет значения
        //
        // String lidiaName = passportsAndNames.get(212133);  получить значение
        // System.out.println(lidiaName);
        // passportsAndNames.remove(162348); удалить пару из словаря
        // System.out.println(passportsAndNames);
        // System.out.println(passportsAndNames.containsKey(11111)); проверяет наличие какого-то ключа
        // System.out.println(passportsAndNames.containsValue("Дональд Джон Трамп")); проверяет наличие значения

        // Set<Integer> keys = passportsAndNames.keySet(); возвращает множество ключей.
        // System.out.println("Ключи: " + keys);
        //
        // ArrayList<String> values = new ArrayList<>(passportsAndNames.values()); возвращает набор значений.
        // System.out.println("Значения: " + values);


        // Объединение двух HashMap в одну

        // putAll() Мы вызываем его у первой HashMap, передаем вторую в качестве аргумента

        // HashMap<Integer, String> passportsAndNames = new HashMap<>();
        // HashMap<Integer, String> passportsAndNames2 = new HashMap<>();
        //
        // passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        // passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        // passportsAndNames.put(8082771, "Дональд Джон Трамп");
        //
        // passportsAndNames2.put(917352, "Алексей Андреевич Ермаков");
        // passportsAndNames2.put(925648, "Максим Олегович Архаров");
        //
        //
        // passportsAndNames.putAll(passportsAndNames2);
        // System.out.println(passportsAndNames);


        // entrySet() возвращает список всех пар в нашей HashMap
        // Map.Entry обозначает как раз пару “ключ-значение” внутри словаря.
        //
        // for (Map.Entry el: passportsAndNames.entrySet()) {
        //   System.out.println(el);
        //   System.out.printf("[%d: %s]\n", el.getKey(), el.getValue());
        // }


    // TreeMap







    }
}
