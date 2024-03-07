
my_dict = {'Иванов':1, 'Петров': 2, 'Сидоров':3, 'Николаев':4}

# print(f'{my_dict=}')
# print(f'{my_dict["Петров"]=}')
# print()

# print(my_dict) # Вывод словоря полностью
# print(my_dict["Петров"]) # Вывод значения по ключу
# print()

# print(my_dict.keys()) # Вывод ключей в формате множество([списки])
# print(my_dict.values()) # Вывод значений в формате множество([списки])
# print(my_dict.items()) # Вывод ключей и значений в формате множество (списки[(множество)])
# print()

# print(len(my_dict.keys())) # Вывод общего количества ключей
# print(sum(my_dict.values())) # Вывод общей суммы значений
# print()

# print(list(my_dict.keys())[0]) # Приведение типов в список и вывод ключа по индексу
# print(list(my_dict.values())) # Приведение типов в список и вывод значений и можно по индексу
# print(list(my_dict.items())) # Вывод ключей и значений в формате списки[(множество)]
# print()

'''Операции со списками с помощью цикла'''

# for key in my_dict: # Вывод ключей через цикл
#     print(key, end='\t')
# print('\n')

# for key in my_dict.keys(): # Вывод ключей через цикл с помощью keys()
#     print(key, end='\t')
# print('\n')

# for value in my_dict.values(): # Вывод значений через цикл с помощью values()
#     print(value, end='\t')
# print('\n')

# for item in my_dict.items(): # Вывод ключей и значений через цикл с помощью items()
#     print(item, end='\t')
# print('\n')

# for key, value in my_dict.items():    
#     print(key,value, sep=': ', end='\t')
# print('\n')

# q,w,*e = (111,222,333)
# print(q)
# print(w)
# print(e)

# my_list = [(1,2), (11,22,33, 44), (111,222,333)]
# for q,w,*e in my_list:
    # print(q, w, e, sep='-')
    

# text = 'hello world!'
# text = text[6:] + ' ' + text[: 5]
# print(text)

my_dict = {'Иванов':1, 'Петров': 2, 'Сидоров':3, 'Николаев':4}

my_dict['Алексеев'] = my_dict['Петров']
# del my_dict['Петров']
print(my_dict['Алексеев'])

my_dict['Алексеев'] = my_dict.pop('Петров')



# from random import randint

# nums_list = [randint(1,5) for _ in range(5)]

# nums_set = {randint(1,5) for _ in range(5)}

# nums_dict = {i: randint(1,5)  for i in range(5)}

# nums_gen = (randint(1,5) for _ in range(5))