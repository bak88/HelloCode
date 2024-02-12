
''' Напишите программу, которая находит сумму всех чисел от 1 до num. 
    Число всегда будет положительным целым числом, большим 0. Вашей функции нужно только вернуть результат. 
    В приведенном ниже примере в скобках показано, как вы достигаете этого результата, и оно не является его частью, см. примеры тестов.

    Например (Ввод -> Выход) :

    2 -> 3 (1 + 2)
    8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
'''

# def summation(num):
#     return sum(range(1,num+1))

# n = int(input("Enter the number: "))

# print(summation(n))




''' У меня есть кот и собака.
    Я получил их одновременно с котенком/щенком. Это было humanYearsмного лет назад.
    Верните их возраст сейчас как [ humanYears, catYears, dogYears]

    ПРИМЕЧАНИЯ:
    человеческиегоды >= 1
    HumanYears – это только целые числа.
    
    Кошачьи годы
    15кошачьи годы за первый год
    +9кошачьи годы на второй год
    +4кошачьи годы за каждый год после этого
    
    Собачьи годы
    15собачьи годы за первый год
    +9собачьи годы на второй год
    +5собачьи годы за каждый последующий год
'''

# def human_years_cat_years_dog_years(human_years):
#     catYears = 20
#     dogYears = 19
#     count = 1
#     if human_years == 1:
#         return [1, 15, 15 ]
#     elif human_years == 2:
#         return [2, 24, 24]
#     elif human_years == 3:
#         return [3, 28, 29]
#     else:
#         while human_years > 1:
#             catYears += 4
#             dogYears += 5
#             human_years -= 1
#             count += 1
#     return [count, catYears, dogYears]

# print(human_years_cat_years_dog_years(10))