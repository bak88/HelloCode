package Исключения_в_программировании_и_их_обработка.dz.dz04;

class UserDataSizeException extends RuntimeException{
    public UserDataSizeException() {
        super("Вы ввели данных, больше чем нужно ");
    }

    public UserDataSizeException(int num) {
        super("Вы ввели данных, меньше чем нужно ");
    }
}