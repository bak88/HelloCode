

''' filter''' 

my_list = [1,2,34,5,7,8,90,0,3,67,89,35,2]

res_list = list(filter(lambda x: x % 2 == 0, my_list))
print(res_list)


''' filter В развернутом виде '''
res_list=[]
f = lambda x: x % 2 == 0
for el in my_list:
    if f(el):
        res_list.append(el)
print(res_list)


''' filter через генератор списков '''
f = lambda x: x % 2 == 0
[el for el in my_list if f(el)]
print(res_list)

'''######################################################'''

my_list = [1,2,34,5,7,8,90,0,3,67,89,35,2]

res_list = list(map(lambda x: x % 2 == 0, my_list))
print(res_list)

''' map В развернутом виде '''
res_list=[]
f = lambda x: x % 2 == 0
for el in my_list:
    res_list.append(f(el))
print(res_list)

''' map через генератор списков '''
f = lambda x: x % 2 == 0
[f(el) for el in my_list]
print(res_list)