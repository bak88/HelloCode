
'''
Файлы в текстовом формате используются для:
    ● Хранения данных
    ● Передачи данных в клиент-серверных проектах
    ● Хранения конфигов
    ● Логирования действий
Что нужно для работы с файлами:
    1. Завести переменную, которая будет связана с этим текстовым файлом.
    2. Указать путь к файлу.
    3. Указать, в каком режиме мы будем работать с файлом.


Варианты режима (мод):
    a – открытие для добавления данных.
        ○ Позволяет дописывать что-то в имеющийся файл.
        ○ Если вы попробуете дописать что-то в несуществующий файл, то файл будет создан
          и в него начнется запись.
    r – открытие для чтения данных.
        ○ Позволяет читать данные из файла.
        ○ Если вы попробуете считать данные из файла, которого не существует, программа
          выдаст ошибку.
    w – открытие для записи данных.
        ○ Позволяет записывать данные и создавать файл, если его не существует.


Миксованные режимы:
    1. w+
        ○ Позволяет открывать файл для записи и читать из него.
        ○ Если файла не существует, он будет создан.
    2. r+
        ○ Позволяет открывать файл для чтения и дописывать в него.
        ○ Если файла не существует, программа выдаст ошибку. 
'''

# data.close() — используется для закрытия файла, чтобы разорвать подключение файловой
# переменной с файлом на диске.
# ● exit() — позволяет не выполнять код, прописанный после этой команды в скрипте.
# ● В итоге создаётся текстовый файл с текстом внутри: redbluedreen.
# ● При повторном выполнении скрипта redbluedreenredbluedreen — добавление в
#   существующий файл, а не перезапись файлов.


# colors = ['red', '1488', 'blue']
# data = open('file.txt', 'a') # здесь указываем режим, в котором будем работать
# data.writelines(colors) # разделителей не будет
# data.close()


# # Ещё один способ записи данных в файл:
# with open('file.txt', 'w') as data:
#     data.write('line 1\n')
#     data.write('line 2\n')


# Чтение данных из файла:
path = 'file.txt'
data = open('file.txt', 'r')
for line in data:
    print(line)
data.close()