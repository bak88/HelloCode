package Java;
/* Дана строка sql-запроса:

select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. Если значение null,
то параметр не должен попадать в запрос.

Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами

Пример: Строка sql-запроса:

select * from students where
Параметры для фильтрации:

 {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Результат:

select * from students where name='Ivanov' and country='Russia' and city='Moscow'
* */


import java.util.Arrays;

public class Training {

    public static void main(String[] args) {

        String value = "In JavaRush, Diego the best, Diego is Java God".replace('I', 'O');
        System.out.println(value);
    }




}






