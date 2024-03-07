
''' Задача 1
    Напишите программу, которая принимает на вход строку, и отслеживает, 
    сколько раз каждый символ уже встречался. 
    Количество повторов добавляется ксимволам с помощью постфикса формата _n.
    Input: a a a b c a a d c d d
    Output: a a_1 a_2 b c a_3 a_4 d c_1 d_1 d_2
    Для решения данной задачи используйте функцию.split()
'''

# stroka = input('Введите строку: ').split() # .split() переводит строку в массив.В скобках указываем разделитель(', ')
# print(stroka)
# res = {} # Создали пустой словарь

# for el in stroka:
#     if el in res:
#         print(f'{el}_{res[el]}', end=' ')
#     else:
#         print(el, end=' ')
    
#     # Метод get(ключ, дефолтное значение) передаем 2 значения возвращает значение по указанному ключу в параметрах.
#     res[el] = res.get(el, 0) + 1 
#     print(res)

''' Способ 2'''

# string = "a a a b c a a d c d d"
# my_list = string.split()
# result = {}
# for el in my_list:
#     if el not in result:
#         print(el, end=" ")
#         result[el] = 0
#     else:
#         result[el] += 1
#         print(f"{el}_{result[el]}", end=" ")


''' Задача 2
    Пользователь вводит текст(строка). Словом считается последовательность непробельных символов 
    идущих подряд, слова разделены одним или большим числом пробелов. 
    Определите, сколько различных слов содержится в этом тексте.
    Input:  She sells sea shells on the sea shore The shells
            that she sells are sea shells I'm sure.So if she sells sea
            shells on the sea shore I'm sure that the shells are sea
            shore shells
    Output: 13
'''

# stroka = input('Введите слова: ').split()

# set_1 = set()

# for el in stroka:
#     set_1.add(el.lower().replace()) # Функция lower() переводит в маленький регистр

# print(len(set_1))

''' Способ 2'''

# my_string = "She    sells sea shells on the sea shore The shells that she sells are sea shells "\
#     "I'm sure So if she sells sea shells on the sea shore. I'm sure that the shells are sea shore shells"
# my_string = my_string.upper().replace('.','')
# my_list = my_string.split()
# print(my_list)
# print(len(set(my_list)))

# print(len(set(my_string.replace('.','').upper().split())))


''' Задача 3
Ваня и Петя поспорили, кто быстрее решит следующую задачу: 
“Задана последовательностьнеотрицательных целых чисел. 
Требуется определить значение наибольшего элементапоследовательности, 
которая завершается первым встретившимся нулем (число 0 не входит впоследовательность)”. 
Однако 2 друга оказались не такими смышлеными. Никто из ребят не смог до конца сделать это задание. 
Они решили так: у кого будет меньше ошибок в коде, тот и выиграл спор. За 
помощью товарищи обратились к Вам, студентам.
'''

# Ваня:

# n = int(input())
# max_number = n # 1 max_number = 1000
# while n != 0:
#    n = int(input())
#    if max_number < n: # 2 if max_number > n
#        max_number = n
# print(max_number)




# # Петя:

n = int(input())
max_number = -1
while n != 0: # 2 while n < 0:
    if max_number < n:
       max_number = n # 3 n = max_number
    n = int(input()) # 1 Перенос строки
print(max_number) # 4 print(n)