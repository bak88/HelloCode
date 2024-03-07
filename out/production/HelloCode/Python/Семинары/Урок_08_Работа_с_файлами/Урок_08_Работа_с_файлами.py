''' Задача 1 
    Создать телефонный справочник с возможностью импорта и экспорта данных в формате .txt. 
    Фамилия, имя, отчество, номер телефона - данные, которые должны находиться в файле.
    Программа должна выводить данные
    Программа должна сохранять данные в текстовом файле
    Пользователь может ввести одну из характеристик для поиска определенной записи(Например имя или фамилию человека)
    Использование функций. Ваша программа не должна быть линейной
'''

# 1 Создание файла:
#     - открывает файл на дозапись (режим "а")
# 2 Добавление контакта:
#     - запросить у пользователя данные контакта
#     - открывает файл на дозапись (режим "а")
#     - добавить новый контакт 
# 3 Вывод данных:
#     - открывает файл на чтение (режим "r")
#     - считать файл
#     - вывести на экран
# 4 Поиск контакта
#     - выбор варианта поиска
#     - запросить данные для поиска
#     - открывает файл на чтение (режим "r")
#     - считываем контакты, сохраняем в переменную
#     - осуществляем поиск контакта
#     - Вывод на экран
# 5 Создание UI(User Interface):
#     - вывести меню на экран
#     - запросить у пользователя вариант действия
#     - запустить функцию
#     - осуществить выход из программы


def input_surname(): # Запрашиваем данные у пользователя
    return input('Введите фамилию контакта: ').title()

def input_name(): # Запрашиваем данные у пользователя
    return input('Введите имя контакта: ').title()

def input_patronymic(): # Запрашиваем данные у пользователя
    return input('Введите отчество контакта: ').title()

def input_phone(): # Запрашиваем данные у пользователя
    return input('Введите телефон контакта: ')

def input_address(): # Запрашиваем данные у пользователя
    return input('Введите адрес(город) контакта: ').title()

def create_contact(): # Создаем переменные в этой функции и вызываем эти функции, и получаем данные для создания контакта
    surname = input_surname()
    name = input_name()
    patronymic = input_patronymic()
    phone = input_phone()
    address = input_address()
    return f'{surname} {name} {patronymic} {phone}\n{address}\n\n'


def add_contact():
    contact_str = create_contact() # Создаем контакт в виде строки и сохр в переменную
    with open("F:\IT\git_edition\HelloCode\Python\Семинары\Урок_08_Работа_с_файлами\phonebook.txt", 'a', encoding='utf-8') as file:
        file.write(contact_str) # Дозаписываем контакт
    
def create_list_contact(): # Считывает файл, сохраняет текст в переменную
    with open("F:\IT\git_edition\HelloCode\Python\Семинары\Урок_08_Работа_с_файлами\phonebook.txt", 'r', encoding='utf-8') as file:
        all_contacts_str = file.read() # Считываем все контакты в виде одной строки
        return all_contacts_str.rstrip().split('\n\n') # Строку контактов переделываем в список контактов
              
def print_contacts(cont_list=create_list_contact()): # Выводим все контакты
    for n, contact in enumerate(cont_list, 1): # Нумерация контактов
        print(n, contact) # n - номер, contact - контакт
            

def search_contact():
    print(
            'Возможные варианты поиска:\n'
            '1. По фамилии\n'
            '2. По имени\n'
            '3. По отчество\n'
            '4. По телефону\n'
            '5. По адресу(город)'
            )
    var = input('выберите вариант поиска: ')
    while var not in ('1', '2', '3', '4', '5'):
        print('некорректный ввод!')
        var = input('выберите вариант поиска: ')
    i_var = int(var) - 1 # Преобразуем выбранный вариант в интове значение и получаем индекс

    search = input('Введите данные для поиска: ').title()
    with open("F:\IT\git_edition\HelloCode\Python\Семинары\Урок_08_Работа_с_файлами\phonebook.txt", 'r', encoding='utf-8') as file:
        all_contacts_str = file.read() # Считываем все контакты в виде одной строки
        contacts_list = all_contacts_str.rstrip().split('\n\n') # Строку контактов переделываем в список контактов
    
    for str_contact in contacts_list: # Перебираем контакты
        lst_contact = str_contact.replace(':', '').split() # Получаем список эл-ов контакта
        if search in lst_contact[i_var]: # если совпадение есть выводим контакт
            print(str_contact)
    
def copy_contact():
    contacts_list = create_list_contact()      

    print_contacts(contacts_list)

    one_copy_cont = int(input("Выберите контакт по номеру для копирования: "))
    print()
    
    # for n, contact in enumerate(contacts_list, 1): # Нумерация контактов
    #     if n == one_copy_cont:
    #         print(n, contact)

    with open("F:\IT\git_edition\HelloCode\Python\Семинары\Урок_08_Работа_с_файлами\copy_phonebook.txt", 'a', encoding='utf-8') as file:
        file.write(f'\n{contacts_list[one_copy_cont - 1]}\n')


        


def interface(): #  Создаем UserInterFace
    with open("F:\IT\git_edition\HelloCode\Python\Семинары\Урок_08_Работа_с_файлами\phonebook.txt", 'a', encoding='utf-8'):
        pass

    var = 0
    while var != '5':
        print(
            'Возможные варианты:\n'
            '1. Добавить контакт\n'
            '2. Вывести на экран\n'
            '3. Поиск контакта\n'
            '4. Копировать контакт\n'
            '5. Выход'
            )
        print()
        var = input('выберите вариант действия: ')
        while var not in ('1', '2', '3', '4', '5'):
            print('некорректный ввод!')
            var = input('выберите вариант действия: ')
        print()    

        match var: 
            case '1':
                add_contact()
            case '2':
                print_contacts()
            case '3': 
                search_contact()
            case '4':
                copy_contact()
            case '5':
                print('До свидания') 
        print()        


if __name__ == '__main__':
    interface()