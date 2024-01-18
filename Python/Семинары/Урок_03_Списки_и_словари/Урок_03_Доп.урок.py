
import copy

# num = 45
# text = 'hello'
my_list = [1,2,3,4,5, [11,22,33, [777,888,999]]]
print(my_list)

# my_list_2 = my_list
# print(my_list_2)
# print()
# my_list_2[2] = 999
# print(my_list)
# print(my_list_2)
# print()

# my_list_3 = my_list.copy()
# print(my_list_3)
# print()
# my_list_3[3] = 0
# print(my_list)
# print(my_list_3)
# print()

# my_list_4 = my_list[:]
# print(my_list_4)
# print()
# my_list_4[-1][1] = '~~~~'
# print(my_list)
# print(my_list_4)
# print()

my_list_5 = copy.deepcopy(my_list)
print(my_list_5)
print()
my_list_5[-1][-1][1] = 'XXX'
print(my_list)
print(my_list_5)