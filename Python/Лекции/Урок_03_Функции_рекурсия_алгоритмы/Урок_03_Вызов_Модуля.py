
# Способ 1
import Урок_03_Модули
print(Урок_03_Модули.max_1(5, 9))

# Способ 2
import Урок_03_Модули as u8 # Задаем другое имя модулю если оно слишком длинное
print(u8.max_1(16, 19))

# Способ 3
from Урок_03_Модули import max_1
print(max_1(3, 10))

# Способ 4
from Урок_03_Модули import * # * обозначает что мы хотим ипортировать все функции
print(max_1(12, 22))

