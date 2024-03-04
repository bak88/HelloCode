




# range(start=0, stop, step=1)#

# range(5) -> range(start=0, stop=5, step=1) -> 0,1,2,3,4
# range(2, 10) -> range(start=2, stop=10, step=1) -> 2,3,4,5,6,7,8,9
# range(3, 15, 2) -> range(start=3, stop=15, step=2) -> 3,5,7,9,11,13

# text_2 = '234571235365676758'
# print(text_2[3: 9: 2])
# print(text_2[7: 1: -2])
# print(text_2[::-1]) #-> 857676563532175432


# print(*range(len(text),-1 , -1))

# new_text = 'Hello, world!'

# for symbol in new_text:
#     print(symbol)
    
# print(*range(len(new_text)))  

# for i in range(len(new_text)):
#     print(new_text[i:])


# print(new_text[-2:])
# print(int('1212341кг'[:-2]))



# for num in range(50):
#     if num % 2 == 0:
#         continue
#     if num % 3 == 0:
#         print(num, end=' ')
#     if num == 32:
#         break
# else:
#     print('Я всё, закончил!')