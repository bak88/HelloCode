
''' Задача 1. 
    Дан список чисел. Определите, сколько в нем 
    встречается различных чисел.
    Input: [1, 1, 2, 0, -1, 3, 4, 4]
    Output: 6
'''
# from random import randint

# list_1 = []

# for i in range(5):
#     i = randint(1, 10)
#     list_1.append(i) # Функция .append() позваляет добавить эл-нт в конец списка
# print(list_1)

# # Преобразуем СПИСОК в МНОЖЕСТВА с помощью функции set()
# # Функция len() Считает кол-во эл-ов
# print([len(set(list_1))])


''' Задача 2
    Дана последовательность из N целых чисел и число 
    K. Необходимо сдвинуть всю последовательность (сдвиг - циклический) 
    на K элементов вправо, K – положительное число.
    Input: [1, 2, 3, 4, 5] k = 3
    Output: [4, 5, 1, 2, 3]
'''

# from random import randint

# list_1 = []

# for _ in range(5):
#     list_1.append(randint(1, 50))
# print(list_1)

# k = randint(1, 50)
# print(f'Число k = {k} ')
# # Если k больше размера списка получится циклический сдвиг
# # преобразуем k
# k = k % len(list_1)
# print(f'Сдвиг на {k} числа')

# #  Создадим пустой список для результата
# list_res = []

# # Создаем цикл длинной k для сдвигнувшихся чисел
# for i in range(k):
#     list_res.append(list_1[len(list_1) - 1 - i])
# print(list_res)

# # Создаем цикл для - оставшихся эл-ов минус k
# for i in range(len(list_1) - k):
#     list_res.append(list_1[i])
# print(list_res)

# #2 надо подправить

# for _ in range(k):
#     last_num = numbers.pop()
#     numbers.insert(0, last_num)
# print(numbers)


''' Задача 3
    Напишите программу для печати всех уникальных 
    значений в словаре. 
    Input:  [{"V": "S001"}, {"V": "S002"}, {"VI": "S001"}, 
    {"VI": "S005"}, {"VII": "S005"}, {"V":"S009"}, {"VIII":"S007"}] 
    Output: {'S005', 'S002', 'S007', 'S001', 'S009'}
'''

list_1 = [{"V": "S001"}, {"V": "S002"}, {"VI": "S001"}, 
{"VI": "S005"}, {"VII": "S005"}, {"V":"S009"}, {"VIII":"S007"}]

# Создадим МНОЖЕСТВО set_1 с помощью функцию set()
set_1 = set()

# Создадим цикл что бы пройтись по всем значения списка
for i in list_1:
    # print(i) # Выводит СЛОВАРИ
    for j in i:
        # print(j) # Выводит КЛЮЧИ
        set_1.add(i[j])
print(set_1)

# unique = set()

# for cur_dict in list_dicts:
#     for value in cur_dict.values():
#         unique.add(value)
# print(unique)

# #2
# # unique = set()

# # for cur_dict in list_dicts:
# #     unique.add(*cur_dict.values()) работает с одним элементом в словаре
# # print(unique)

# #3
# unique = set()

# for cur_dict in list_dicts:
#     unique.update(cur_dict.values()) # работает со всеми элементами списка/словаря
# print(unique)


''' Задача 4
    Дан массив, состоящий из целых чисел. Напишите 
    программу, которая подсчитает количество 
    элементов массива, больших предыдущего (элемента 
    с предыдущим номером) 
    Input: [0, -1, 5, 2, 3]
    Output: 2 (-1 < 5, 2 < 3)
'''
# from random import randint

# list_1 = []
# count = 0

# for _ in range(6):
#     list_1.append(randint(-50, 50))
# print(list_1)

# for i in range(1, len(list_1)):
#     if list_1[i] > list_1[i-1]:
#         count += 1
# print(count)


# from random import randint

# size = int(input("Введите размер массива: "))
# numbers = [randint(-5, 5) for _ in range(size)]
# print(numbers)
# count = 0

# for i in range(size - 1):
#     if numbers[i] < numbers[i + 1]:
#         count += 1
# print(count)

# print(sum([1 for i in range(size - 1) if numbers[i] < numbers[i + 1]]) )





'''Доп. инфа'''
# numbers = []
#
# for i in range(size):
#     if i%2==0:
#         numbers.append(randint(-5, 5))
# numbers = [randint(-5, 5) for i in range(size) if i%2==0]

# for i in range(size):
#     if i%2==0:
#         numbers.append(randint(-5, 5))
#     else:
#         numbers.append("Hello")
# 
# numbers = [randint(-5, 5) if i%2==0 else "Hello" for i in range(size) ]