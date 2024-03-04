

a = 'python'
b = 'Привет, меня зовут Вася!'
z = 'Hello world!'
age = 25

# print(a, b, z)
# print(a, b, z, sep=' ', end='\n')

# print(a, b, z, sep=f' опа! ')
# print(a, b, z, sep=f'{age}')
# print(a, b, z, sep=str(age))
# print(a, b, z, sep='\n')
# print(a, b, z, sep='\t')

# print(b, end=z)
# print(a, end='~~~!!!~~~')
# print(z)

s = 'Python !'
print(*s)
print()
print(*s, sep='\n')



name = "John"
age = 25
print('Привет, меня зовут %s.' % name)
# print('Привет, меня зовут {}, мне {} лет.'.format(name, age))
# print('Привет, меня зовут {b}, мне {a} лет.'.format(a=name, b=age))
# print(f'Привет, меня зовут {name}, мне {age} лет.')