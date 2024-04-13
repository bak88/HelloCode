package Исключения_в_программировании_и_их_обработка.seminars.seminars03;

//Задание №3
//1. Создайтекласс исключения, который будет выбрасываться при делениина
//0. Исключениедолжно отображать понятноедля пользователя сообщение
//об ошибке.
//2. Создайте класс исключений, котороебудет возникатьпри обращении к
//пустому элементув массиве ссылочного типа. Исключениедолжно
//отображать понятноедля пользователя сообщениеоб ошибке
//3. Создайте класс исключения, которое будет возникать при попытке открыть
//несуществующий файл. Исключение должно отображать понятное для
//пользователясообщение об ошибке.

import java.io.FileNotFoundException;

public class Ex_03 {
    public static void main(String[] args) {

    }
}

class MyDivByZero extends ArithmeticException{


    public MyDivByZero() {
        super("Делить на ноль нельзя");
    }
}

class AppLyArrayElementNull extends NullPointerException{

    public AppLyArrayElementNull() {
        super("Обращение к пустому элементу.");
    }

    public AppLyArrayElementNull(int index) {
        super("Пустой элемент находится на индексе " + index);
    }
}

class ErrorOpenFile extends FileNotFoundException{

    public ErrorOpenFile() {
        super("Файл не найден.");
    }

    public ErrorOpenFile(String s) {
        super("Файл не найден по данному пути" + s);
    }
}

