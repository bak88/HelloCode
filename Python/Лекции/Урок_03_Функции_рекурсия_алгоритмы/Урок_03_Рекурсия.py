
''' Последовательность Фибоначчи через рекурсию'''

def fib(n):
    if n in [1, 2]: # В рекурсии обязательно указывать базис
        return 1
    return fib(n - 1) + fib(n - 2)

list_fib = []

for i in range(1, 11):
    list_fib.append(fib(i))
print(list_fib)