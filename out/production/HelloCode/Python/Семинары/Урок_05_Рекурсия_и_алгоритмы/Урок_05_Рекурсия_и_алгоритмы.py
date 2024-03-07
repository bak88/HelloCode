
'''0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711

    Задача 1. 
    Последовательностью Фибоначчи называется последовательность чисел a0, a1, ..., an, ..., где
    a0 = 0, a1 = 1, ak = ak-1 + ak-2 (k > 1).
    Требуется найти N-е число Фибоначчи
    Input: 7
    Output: 13

'''
def fib(num):
    if num == 1 or num == 2:
        return 1
    return fib(num - 1) + fib(num - 2)


n = int(input('Введите число: '))

print(fib(n))



''' Задача 2.  Хакер Василий получил доступ к классному журналу и хочет заменить все свои минимальные оценки на максимальные. 
    Напишите программу, которая заменяет оценки Василия, но наоборот: все максимальные – на минимальные.
    Input: 5 -> 1 3 3 3 4

    Output: 1 3 3 3 1
'''

# import random

# def max_to_min(numbers):
#     max_num = max(numbers)
#     min_num = min(numbers)
#     while max_num in numbers:
#         i_max_num = numbers.index(max_num)
#         numbers[i_max_num] = min_num


# n = int(input("Введите количество оценок: "))
# marks = [random.randint(1, 5) for _ in range(n)]
# print(marks)

# max_to_min(marks)
# print(marks)


# 2 способ

# import random
# import time

# n = int(input("Введите количество оценок: "))
# first_num = random.randint(1, 5)
# min_num = first_num
# max_num = first_num
# i_max_nums = [0]

# start = time.time()
# marks = [first_num]

# for i in range(1, n):
#     num = random.randint(1, 5)
#     marks.append(num)
#     if min_num > num:
#         min_num = num
#     if max_num < num:
#         max_num = num
#         i_max_nums = [i]
#     elif max_num == num:
#         i_max_nums.append(i)
# print(marks)

# for i in i_max_nums:
#     marks[i] = min_num
    
# end = time.time()
# dif = end - start
# print(f'код работал {dif} секунд')

'''
Задача №35.  Напишите функцию, которая принимает одно число и проверяет, является ли оно простым

Напоминание: Простое число - это число, которое имеет 2 делителя: 1  и n(само число)


Input: 5

Output: yes

'''

def prime(n):
    for div in range(2, n //2 +1):
        if n % div == 0:
           return 'NO'
    return 'YES'      
         

num = int(input('введите число: '))
print(prime(num))

# способ 2 оптимизация

def prime(n):
    if n != 2 and n % 2 == 0:
        return 'NO'
    for div in range(3, int(n ** 0.5) +1, 2):
        if n % div == 0:
           return 'NO'
    return 'YES'      
         

num = int(input('введите число: '))
print(prime(num))




''' Задача №37.  Дано натуральное число N и последовательность из N элементов. 
    Требуется вывести эту последовательность в обратном порядке.
    Примечание. В программе запрещается объявлять массивы и использовать циклы (даже для ввода и вывода).

    5 -> 1 2 3 4 5
    5 4 3 2 1
'''

def reversed(num):
    el = input("Введите число: ")
    if num == 1:
        print(el, end=" ")
        return
    reversed(num - 1)
    print(el, end=" ")


n = int(input("Введите количество чисел последовательности: "))

reversed(n)

# Способ 2

def reversed(num):
    el = input("Введите число: ")
    if num == 1:        
        return el + ' '
    return reversed(num - 1) + el + ' '



n = int(input("Введите количество чисел последовательности: "))

print(reversed(n).strip())