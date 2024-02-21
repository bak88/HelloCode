package Java;

import java.util.Scanner;

public class HELP {
    public static void main(String[] args) {
        
        // int x = Integer.parseInt(строка); Где int x – это объявление целочисленной переменной x, а строка — это число заданное в виде строки (строка состоящая из цифр).
        // int number = Integer.parseInt("321" + 0); 3210

        // String.valueOf()  Для перевода экземпляра любого Java-класса или любого примитивного типа данных к строковому представлению,
        // String a = String.valueOf(1);

        // length() позволяет узнать длину строки – сколько в ней символов.
        // String name = "Rom";
        // int count = (name + 12).length(); 5 символов

        // toLowerCase() позволяет преобразовать все символы строки в маленькие (строчные)
        // String name = "ROM123";
        // String name2 = name.toLowerCase(); rom123

        // toUpperCase() позволяет преобразовать все символы строки в большие (заглавные)
        // String name = "Rom";
        // String name2 = name.toUpperCase();


// Округление вещественных чисел

    // Math.round() округляет число до ближайшего целого
    // long x = Math.round(вещественное_число) результат работы этого метода — целочисленный тип long (не int).
    // int x = (int) Math.round(вещественное_число)
    // int x = (int) Math.round(4.1); 4
    // int x = (int) Math.round(4.5); 5
    // int x = (int) Math.round(4.9); 5

    // Math.ceil() округляет число до целого вверх, примеры
    // int x = (int) Math.ceil(4.1); 5
    // int x = (int) Math.ceil(4.5); 5
    // int x = (int) Math.ceil(4.9); 5

    // Math.floor() округляет число до целого вниз, примеры:

    // int x = (int) Math.floor(4.1); 4
    // int x = (int) Math.floor(4.5); 4
    // int x = (int) Math.floor(4.9); 4

    // Хотя, для округления числа до целого вниз, будет проще использовать просто оператор приведения типа — (int):
    // int x = (int) 4.9; 4


// методы класса Scanner

    // Scanner console = new Scanner(System.in);
    // int a = console.nextInt();
    // int b = console.nextInt();
    // System.out.println(a + b);

    // nextByte() Считывает данные и преобразует их в тип byte
    // nextShort() Считывает данные и преобразует их в тип short
    // nextInt() Считывает данные и преобразует их в тип int
    // nextLong() Считывает данные и преобразует их в тип long
    // nextFloat() Считывает данные и преобразует их в тип float
    // nextDouble() Считывает данные и преобразует их в тип double
    // nextBoolean() Считывает данные и преобразует их в тип boolean
    // next() Считывает одно «слово». Слова разделяются пробелами или enter
    // nextLine() Считывает целую строку

    // методы, которые позволяют проверить тип еще не считанных данных (чтобы знать, каким методом их считывать)

    // hasNextByte() Там тип byte? Его можно будет преобразовать к byte?
    // hasNextShort() Там тип short? Его можно будет преобразовать к short?
    // hasNextInt() Там тип int? Его можно будет преобразовать к int?
    // hasNextLong() Там тип long? Его можно будет преобразовать к long?
    // hasNextFloat() Там тип float? Его можно будет преобразовать к float?
    // hasNextDouble() Там тип double? Его можно будет преобразовать к double?
    // hasNextBoolean() Там тип boolean? Его можно будет преобразовать к boolean?
    // hasNext() Там есть еще одно слово?
    // hasNextLine() Там есть еще одна строка?

// Коллекции

    // add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
    // get(pos) – возвращает элемент из списка по указанной позиции
    // indexOf(item) – первое вхождение или -1
    // lastIndexOf(item) – последнее вхождение или -1
    // remove(pos) – удаление элемента на указанной позиции и его возвращение
    // set(int pos, T item) – gjvtoftn значение item элементу, который находится на позиции pos
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


    }
}
