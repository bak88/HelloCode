# None пустое значение

# n = 14.88
# print(type(n)) # Команада type показывает какой тип данных хранится в переменной
# x = 'asd\'sdf' #  Вывод кавычки через \
# print(x)
# y = 'ada"dhdgfh"dd' # можно использовать " " внутри
# print(y)




# a = 5
# b = 5.98
# c = 'hello'
# print(f"{a} - {b} - {c}")
# print("{} - {} - {}".format(a,b,c))




# print('Введите число: ')
# d = int(input())
# e = int(input('Введите второе число: '))
# print(d,'+',e,'=',d+e)




# d = 5.89
# print(d)
# print(type(d))
# d = str(d)
# print(d + '88')
# print(type(d))




# d = 1
# print(d)
# print(type(d))
# d = bool(d)
# print(d)
# print(type(d))




# a = 4.34534535
# b = 2.3453453535
# print(round(a*b, 4)) # Функция round() указывает сколько знаков после "," будет выведенно



# username = input('Введите имя: ')
# if username == 'Маша':
#     print('Ура это Маша')
# elif username == 'Марина':
#     print('Я так ждал вас Марина!')
# elif username == 'Вика':
#     print('Привет Вика!')
# else:
#     print("Привет, ", username)




# n = 123
# summa = 0
# while n > 0:
#     x = n % 10
#     summa = summa + x
#     n = n // 10
# print(summa)



# i = 0
# while i < 5:
#     if i == 3:
#         break
#     i = i + 1
# else:
#     print('Пожалуй')
#     print('хватит')
# print(i)




# line = ''
# for i in range(5):
#     line = ""
#     for j in range(5):
#         line += '*'
#     print(line)



text = 'СъеШЬ ещё этих МяГкиХ французских буллок'
print(len(text)) # Функция len() позваляет узнать размер нашей строки
print('ещё' in text) # Проверяет если сторка "ещё" в тесте
print(text.lower()) # Функция lower() переводит всю строку в нижний регистр
print(text.upper()) # Функция upper() переводит всю строку в верхний регистр
print(text.replace('ещё', 'ЕЩЁ')) # Функция replace() позваляет поменятиь сочетания символов в строке
print(text[:]) # Выводит весь текст
print(text[:2]) # Выводит элемент с 0 по 2 из теста
print(text[20:]) # Выводит элемент с 20 до конца
print(text[2:9]) # Выводит элемент со 2 по 9 из теста
print(text[6:-18]) # Выводит элемент со 6 по -18(-18 отсчет с конца теста)
print(text[len(text) - 2:]) # Берет длину текста и выводит 2 симворла с конца
print(text[0:len(text):6]) # Идем от 0 через весь текст с шагом 6
print(text[::6]) # по умолчанию от начала и до конца с шагом 6

text = text[2:9] + text[-5] + text[:2]
print(text)