''' Функция filter() применяет указанную функцию к каждому элементу итерируемого объекта и
    возвращает итератор с теми объектами, для которых функция вернула True.
'''

# data = [5, 23, 45, 23, 78, 105]
# res = list(filter(lambda x: x % 10 == 5, data))
# print(res)




'''################################'''


list_1 = [1, 2, 3, 5, 8, 15, 23, 38]
new_list = map(int, list_1)

new_list = filter(lambda x: x % 2 == 0, new_list)

new_list = list(map(lambda x: (x, x**2), new_list))
print(new_list)