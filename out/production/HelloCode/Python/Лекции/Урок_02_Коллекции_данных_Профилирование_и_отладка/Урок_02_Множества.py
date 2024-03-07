'''
    Множества содержат в себе уникальные элементы, не обязательно упорядоченные.
    Одно множество может содержать значения любых типов. Если у Вас есть два множества,
    Вы можете совершать над ними любые стандартные операции, например, объединение,
    пересечение и разность. Давайте разберем их.
'''
colors = {'red', 'green', 'blue'}
print(colors) # {'red', 'green', 'blue'}
colors.add('red')
print(colors) # {'red', 'green', 'blue'}
colors.add('gray') 
print(colors) # {'red', 'green', 'blue','gray'}
colors.remove('red')
print(colors) # {'green', 'blue','gray'}
colors.remove('red') # KeyError: 'red'
colors.discard('red') # ok
print(colors) # {'green', 'blue','gray'}
colors.clear() # { }
print(colors) # set()



# Операции со множествами в Python:

a = {1, 2, 3, 5, 8}
b = {2, 5, 8, 13, 21}
c = a.copy() # c = {1, 2, 3, 5, 8} Копируем множество а в перменную с
u = a.union(b) # u = {1, 2, 3, 5, 8, 13, 21} Объединение a и b будет содержать уникальные значения
i = a.intersection(b) # i = {8, 2, 5} Пересечение выводит одинаковые эл-ты множества
dl = a.difference(b) # dl = {1, 3} Разность a - b остаются эл-ты которые не пересикаются
dr = b.difference(a) # dr = {13, 21} Разность b - a остаются эл-ты которые не пересикаются
q = a.union(b).difference(a.intersection(b))# {1, 21, 3, 13}



# Неизменяемое или замороженное множество(frozenset) — множество, с которым не будут 
# работать методы удаления и добавления.

a = {1, 2, 3, 5, 8}
b = frozenset(a)
print(b) # frozenset({1, 2, 3, 5, 8})
