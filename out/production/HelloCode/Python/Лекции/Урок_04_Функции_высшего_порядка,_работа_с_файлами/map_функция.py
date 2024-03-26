
''' Функция map() применяет указанную функцию к каждому элементу итерируемого объекта и
    возвращает итератор с новыми объектами.

'''
# list_1 = [x for x in range(1, 20)]
# print(list_1)
# # Функция map() принимает 2 обьекта сама функция (lambda x: x + 10) и объект (list_1)
# # и она возвращает этот объект (list_1)
# list_1 = list(map(lambda x: x + 10, list_1))
# print(list_1)




'''###########################################'''

''' Задача: 
    C клавиатуры вводится некий набор чисел, в качестве разделителя используется
    пробел. Этот набор чисел будет считан в качестве строки. Как превратить list строк в list чисел?
'''

data = '1 2 65 56 32 8 98 54'
print(data)

data = list(map(int, data.split())) # Преоброзование строки в список
print(data)




'''#################################'''

# def where(f, value):
#     return [x for x in value if f(x)]

# list_1 = [1, 2, 3, 5, 8, 15, 23, 38]
# new_list = map(int, list_1)

# new_list = where(lambda x: x % 2 == 0, new_list)
# print(new_list)

# new_list = list(map(lambda x: (x, x**2), new_list))
# print(new_list)
