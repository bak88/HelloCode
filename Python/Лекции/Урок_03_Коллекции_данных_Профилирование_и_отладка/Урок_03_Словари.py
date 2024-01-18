'''
    Словари — неупорядоченные коллекции произвольных объектов с доступом по ключу.
    В списках в качестве ключа используется индекс элемента. В словаре для определения 
    элемента используется значение ключа (строка, число).
'''
d = {}
d = dict()

d['q'] = 'qwerty'
print(d)

d['w'] = 'werty'
print(d['q'])

dictionary = {}
dictionary = {'up': '↑', 'left': '←', 'down': '↓', 'right': '→'}
print(dictionary) # {'up':'↑', 'left':'←', 'down':'↓', 'right':'→'}
print(dictionary['left']) # ← типы ключей могут отличаться
print(dictionary['up']) # ↑ типы ключей могут отличаться
dictionary['left'] = '⇐' 
print(dictionary['left']) # ⇐
# print(dictionary['type']) # KeyError: 'type' 
del dictionary['left'] # удаление элемента
for item in dictionary:
    print('{}: {}'.format(item, dictionary[item]))

print(dictionary.items())

for (k, v) in dictionary.items():
    print(k, v)