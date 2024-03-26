''' 
    Напишите функцию print_operation_table(operation, num_rows, num_columns), 
    которая принимает в качестве аргумента функцию, вычисляющую элемент по номеру строки и столбца. 
    По умолчанию номер столбца и строки = 9.
    Аргументы num_rows и num_columns указывают число строк и столбцов таблицы, которые должны быть распечатаны.
    Нумерация строк и столбцов идет с единицы (подумайте, почему не с нуля).
    Если строк меньше двух, выдайте текст
    ОШИБКА! Размерности таблицы должны быть больше 2!.
    Примечание: бинарной операцией называется любая операция, у которой ровно два аргумента, как, например, у операции умножения.
    Между элементами должен быть 1 пробел, в конце строки пробел не нужен.
    Пример

    На входе:
    print_operation_table(lambda x, y: x * y, 3, 3)

    На выходе:
    1 2 3
    2 4 6 
    3 6 9
'''

# def print_operation_table(operation, num_rows = 9, num_columns = 9):
#     if num_rows <= 2:
#         print("ОШИБКА! Размерности таблицы должны быть больше 2!")
#         exit()
#     for x in range(1, num_rows + 1):
#         nums = []
#         for y in range(1, num_columns + 1):
#             nums.append(operation(x, y))
#         print(*nums)

# print_operation_table(lambda x, y: x * y)



''' Винни-Пух попросил Вас посмотреть, есть ли в его стихах ритм. 
    Поскольку разобраться в его кричалках не настолько просто, 
    насколько легко он их придумывает, Вам стоит написать программу.
    Винни-Пух считает, что ритм есть, если число слогов (т.е. число гласных букв) 
    в каждой фразе стихотворения одинаковое.
    Фраза может состоять из одного слова, если во фразе несколько слов, то они разделяются дефисами.
    Фразы отделяются друг от друга пробелами.
    Стихотворение  Винни-Пух передаст вам автоматически в переменную stroka в виде строки. 
    В ответе напишите Парам пам-пам, если с ритмом все в порядке и Пам парам, если с ритмом все не в порядке.
    Если фраза только одна, то ритм определить не получится и необходимо вывести: 
    Количество фраз должно быть больше одной!.

    На входе:
    stroka = 'пара-ра-рам рам-пам-папам па-ра-па-дам'
    
    На выходе:
    Парам пам-пам
'''

stroka = 'пара-ра-рам рам-пам-папам па-ра-па-дам'

def win_and_pooh(song):
    
    volwes = ['а', 'о', 'э', 'е', 'и', 'ы', 'у', 'ё', 'ю', 'я']
    parts = song.split()
    if len(parts) <= 1:
        print('Количество фраз должно быть больше одной!')
    else:
        itog = list()
        for item in parts:
            k = 0
            for letter in item:
                if letter in volwes:
                    k += 1
            itog.append(k)
        if len(set(itog)) == 1:
            print('Парам пам-пам')
        else:
            print('Пам парам')
        
win_and_pooh(stroka)


# # 1
# def rifma(poem):
#     phrases_list = poem.lower().split()
#     sum_vowels = lambda phrase: sum(1 for symbol in phrase if symbol in 'аеёиоуыэюя')
#     tmp = sum_vowels(phrases_list[0]) #4
#     if all([sum_vowels(phrase) == tmp for phrase in phrases_list[1:]]):
#         return 'Парам пам-пам'
#     return 'Пам парам'
    
    
# print(rifma("пара-ра-рам рам-пам-папам па-ра-па-дам"))


# # 2
# def rifma(poem):
#     phrases_list = poem.lower().split() # 
#     sum_vowels = lambda phrase: len(list(filter(lambda symbol: symbol in 'аеёиоуыэюя', phrase)))
#     vowels_0 = sum_vowels(phrases_list[0]) # 4
#     if all(map(lambda phrase:sum_vowels(phrase) == vowels_0, phrases_list[1:])):
#         return 'Парам пам-пам'
#     return 'Пам парам'
# print(rifma("пара-ра-рам рам-пам-папам па-ра-па-дам"))


# # 3
# def cntVowLet(str):
#     cnt=0
#     for let in str:
#         if let in vowLet:
#             cnt += 1
#     return cnt

# vowLet = "а,е,ё,и,о,у,ы,э,ю,я".split(",")


# inStr=input("Введите стихотворение Винни-Пуха: ")
# res = set(map(cntVowLet, inStr.split()))

# if len(res) == 1:
#     print("Парам пам-пам")
# else:
#     print("Пам парам")


# # 4
# def sum_vowels(phrase):
#     vowLet = "аеёиоуыэюя"
#     cnt=0
#     for let in phrase:
#         if let in vowLet:
#             cnt += 1
#     return cnt


# def check_rifm(poem):
#     vowel_0 = sum_vowels(poem[0])
#     for phrase in poem[1:]:
#         if sum_vowels(phrase) != vowel_0:
#             return "Пам парам"
#     return "Парам пам-пам"


# check_rifm('пара-ра-рам рам-пам-папам па-ра-па-дам'.split())


# # text = input("Введите стихотворение Винни-Пуха: ").split()
# # print(check_rifm(text))
        