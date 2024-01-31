# def f(x):
#     return x*x

# a = f
# print(a(14))
# print(f(88))

'''######################'''

# def calk1(a, b):
#     return a + b

# def calk2(a, b):
#     return a * b

# def math(op, x, y): # В аргемент передаем функцию op и значение x, y
#     print(op(x, y))

# math(calk1, 14, 88)
# math(calk2, 14, 88)

'''######################'''

# def calk1(a, b):
#     return a + b

# calk1 = lambda a, b: a + b # Сокращенный вариант функции

# def math(op, x, y): # В аргемент передаем функцию op и значение x, y
#     print(op(x, y))

# math(calk1, 14, 88)

# math(lambda a, b: a + b, 14, 88) # Условия можно писать при вызове функции. Условия передаем в def math(op, x, y)


'''######################'''

''' Задача 1
    В списке хранятся числа. Нужно выбрать только чётные числа и составить список пар
    (число; квадрат числа).
    Пример: 1 2 3 5 8 15 23 38
    Получить: [(2, 4), (8, 64), (38, 1444)]
'''

# list_1 = [1, 2, 3, 5, 8, 15, 23, 38]
# new_list = []

# for el in list_1:
#     if el % 2 == 0:
#         new_list.append((el, el * el))
# print(new_list)


def select(f, value): # f тип данных (int, str, float), value значение(list, set, tuple)
    return [f(x) for x in value]

def where(f, value):
    return [x for x in value if f(x)]

list_1 = [1, 2, 3, 5, 8, 15, 23, 38]
new_list = select(int, list_1)
print(new_list)
new_list = where(lambda x: x % 2 == 0, new_list)
print(new_list)
new_list = list(select(lambda x: (x, x**2), new_list))
print(new_list)
