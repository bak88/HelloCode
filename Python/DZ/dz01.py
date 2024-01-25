''' Задача 1
    Найдите сумму цифр трехзначного числа n.
'''
# n = int(input("Введите 3х значное число: "))
# res = 0

# while n < 100 or n > 999:
#     print("Error")
#     n = int(input("Введите 3х значное число: "))

# while n > 0:
#     res += n % 10
#     n = n // 10
# print(res)


''' Задача 2
    Петя, Катя и Сережа делают из бумаги журавликов. Вместе они сделали n журавликов.
    Сколько журавликов сделал каждый ребенок, если известно, 
    что Петя и Сережа сделали одинаковое количество журавликов, 
    а Катя сделала в два раза больше журавликов, чем Петя и Сережа вместе?
    Выведите через пробел количество журавликов, сделанных Петей, Катей и Сережей.
'''
# n = int(input())
# res = n // 3
# n1 = res // 2
# n2 = res * 2
# n3 = res // 2
# print(f"{n1} {n2} {n3}")


''' Задача 3
    Вы пользуетесь общественным транспортом? 
    Вероятно, вы расплачивались за проезд и получали билет с номером.
    Счастливым билетом называют такой билет с шестизначным номером, где сумма первых трех цифр равна сумме последних трех.
    Т.е. билет с номером 385916 – счастливый, т.к. 3+8+5=9+1+6.
    Вам требуется написать программу, которая проверяет счастливость билета с номером n и выводит на экран yes или no.
'''

# n = int(input("Введите 6-ти значное число: "))
# res = n // 1000
# res2 = n % 1000
# sum = 0
# sum2 = 0
# while res > 0:
#     sum += res % 10
#     res = res // 10

# while res2 > 0:
#     sum2 += res2 % 10
#     res2 = res2 // 10

# if sum == sum2:
#     print('yes')
# else:
#     print('no')


''' Задача 4
    Определите, можно ли от шоколадки размером a x b долек отломить c долек, 
    если разрешается сделать один разлом по прямой между дольками 
    (то есть разломить шоколадку на два прямоугольника).
    Выведите yes или no соответственно.
'''
a = int(input('Введите длину: '))
b = int(input('Введите ширину: '))
c = int(input('Введите кол-во долек: '))

res = a * b
if res < c:
    print('no')
elif c // b == 2:
    print('yes')
elif res % 2 == 0:
    print('yes')
else:
    print('no')