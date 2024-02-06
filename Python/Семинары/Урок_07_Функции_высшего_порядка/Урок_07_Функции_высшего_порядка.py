
''' Задача 1
    В переменную transformation нужно прописать такую функцию, 
    что бы в переменной transformed_values получилась копия списка values
'''

# transformation = lambda x: x
# values = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29] # или любой другой список
# transformed_values = list(map(transformation, values))
# if values == transformed_values:
#     print('ok')
# else:
#     print('fail')




''' Задача 2
    Дан список размеров(длина, ширина) эллипсов
    orbits = [(1, 3), (2.5, 10), (7, 2), (6, 6), (4, 3)]
    Напишите функцию find_farthest_orbit(list_of_orbits), 
    которая находит площадь самого большого эллипса и возвращает кортеж с его размерами.
    Площадь эллипса вычисляется по формуле S = pi*a*b, где a и b – длины и ширина осей эллипса
    - Площадь кругов учитывать не нужно, т.е если у эллипса a == b, то это круг.
    При решении задачи используйте списочные выражения.
    Гарантируется, что самый большой эллипс всего один.
'''
# from math import *

# def find_farthest_orbit(list_of_orbits):
#     s_max = 0
#     for a, b in list_of_orbits:
#         if a != b:
#             s = pi * a * b
#         if s > s_max:
#             s_max = s
#             a_b = a, b
#     return a_b


# orbits = [(1, 3), (2.5, 10), (7, 2), (6, 6), (4, 3)]
# print(find_farthest_orbit(orbits))

''' 2 способ List comprehension'''

# def find_farthest_orbit(list_of_orbits):
#     list_of_ellips = [a_b for a_b in list_of_orbits if a_b[0] != a_b[1]]
#     list_of_areas = [a * b * pi for a, b in list_of_ellips]
#     max_area = max(list_of_areas)
#     i_max_area = list_of_areas.index(max_area)
#     return list_of_ellips[i_max_area]


# orbits = [(1, 3), (2.5, 10), (7, 2), (6, 6), (4, 3)]
# print(find_farthest_orbit(orbits))

''' 3 способ '''

# def find_farthest_orbit(list_of_orbits):
#     list_of_ellips = list(filter(lambda a_b: a_b[0] != a_b[1], list_of_orbits))
#     list_of_areas = list(map(lambda a_b: pi * a_b[0]*a_b[1], list_of_ellips))
#     max_area = max(list_of_areas)
#     i_max_area = list_of_areas.index(max_area)
#     return list_of_ellips[i_max_area]

'''Задача 3 
Напишите функцию same_by(characteristic, objects), которая проверяет, 
все ли объекты имеют одинаковое значение некоторой характеристики, и возвращают True, если это так. 
Если значение характеристики для разных объектов отличается - то False. 
Для пустого набора объектов, функция должна возвращать True. 
Аргумент characteristic - это функция, которая принимает объект и вычисляет его характеристику.
Ввод: Вывод:
values = [1, 21, 101, 61] same
if same_by(lambda x: x % 2 == 0, values):
print(‘same’)
else:
print(‘different’)
'''

values = [1, 21, 101, 61] 
if same_by(lambda x: x % 2 == 0, values):
    print('same')
else:
    print('different')