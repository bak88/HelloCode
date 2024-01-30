
''' В самом конце функции print пишем sep=" ". В " " пишем разделеите в место пробела
    Также можем писать end=' '(стоит по умолчанию end='\n' )'''

# print(7, 12, 'hi', sep='|', end='\n')


'''Чтобы указать специальный символ пишем "\" '''

# print('Hi\n \' H\ne\nl\nl\no')


'''Математические функции'''

# print("Resalt:", min(5, 6, -5, 0, 1)) # Поиск минимального элемента
# print("Resalt:", max(5, 6, -5, 0, 1)) # Поиск максимального элемента
# print("Resalt:", abs(-5)) # Вывод числа по модулю
# print("Resalt:", pow(5, 3)) # Вывод числа в степень
# print("Resalt:", round(5 / 3)) # Округление числа к ближайшему целому числу


'''Получение от пользователя данных'''

# input('Введите свой возраст: ')


''' Работа с  переменными'''

# number = 8 
# del number # Удаление переменной
# print(number) 


''' Работа со списками [list]'''

# list_1 = [2, 4, 5, 8]
# list_1.append(20) # Добавляет значение в конец списка
# list_1.insert(1, True) # Добавляет значение в список по индексу 1 значение True
# list_1.extend([5, 11, 14]) # Добавляет неограниченное кол-во значении в конец списка ([])
# list_1.sort() # Сортировка списка
# print(list_1)
# list_1.reverse() # Переворачивает местами список
# print(list_1) 
# list_1.pop() # Удаляет последний эл-нт из списка или в скобках пишем индекс эл-та
# list_1.remove(20) # Удаляет заданный эл-нт из списка
# print(list_1)
# print(list_1.count(5)) # Считает кол-во совпадений, в скобках значение которые ищем
# print(len(list_1)) # Считает длинну списка
# # list_1.clear() # Очищает весь список
# print(list_1)


''' Работа со строками, можно использовать команды со списка'''

# string = 'eLeMeNt, mint, game'
# print(string.upper()) # Выводит строку в ВЕРХНЕМ регистре
# print(string.isupper()) # Проверяет является вся строка в верхнем регистре выводит False либо True
# print(string.lower()) # Выводит строку в НИЖНЕМ регистре
# print(string.islower()) # Проверяет является вся строка в нижнем регистре выводит False либо True
# print(string.capitalize()) # Выводит каждый первый символ любого слова в верхний регист
# print(string.find('L')) # Выводит индекс эл-та в скобках

# words = string.split(', ') # Разбивает строку на список в скобках параметр по которому будем разбивать строку
# for i in range(len(words)):
#     words[i] = words[i].capitalize()
# print(words)

# result = ', '.join(words) # Возвращает список в строку
# print(result)


''' Индексы и срезы'''

# lis = [6, 4, 'Stroka', True, 6.5]
# print(lis[::2])
# print(lis[::-1]) # Шаг -1 переворачивает список


''' Словарь {dict}'''

# country = {'code': 'BY', 'name': 'Belarus', 'population': 1488} # 1ый способ создания словaря
# print(country['name'])
# print(country.get('name')) # Идентично квадратным скобкам
# print(country.keys()) # Вывод ключей
# print(country.values()) # Вывод значений
# print(country.items()) # Получаем ключи и значения

# country.pop('name') # Удаляет эл-нт по ключу
# print(country)
# country.popitem() # Удаляет последний эл-нт
# print(country)
# print()

# country_1 = dict(code='BY', name='Belarus') # 2ой способ создания словaря
# print(country_1['code'])

# print(country.items()) # Получаем список[] где каждый эл-нт это картедж() 

# for key in country: # Перебор ключей
#     print(f'{key}')
# print()

# for key, value in country.items(): # Перебор значений
#     print(f'{key} - {value}')


''' Множество set{}'''

# data = {3, 4, 5, 6, 7} # Не возможно обратится по индексу, ошибка
# print(data)
# data.add(14) # Добавить новый эл-нт
# print(data)
# data.update(['88', True, 1, 9]) # Добавить новые значения
# print(data)
# data.remove(True) # Удалить эл-нт
# print(data)
# data.pop() # Удалить первый эл-нт
# print(data)