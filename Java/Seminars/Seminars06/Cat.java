package Java.Seminars.Seminars06;

//1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
//использовать не все придуманные поля и методы. Создайте несколько
//экземпляров этого класса, выведите их в консоль.
//2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
//его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
//3. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
//Поместите в него некоторое количество объектов.
//4. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
//Убедитесь, что все они сохранились во множество.
//5. Создайте метод public boolean equals(Object o)
//Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
//должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
//6. Создайте метод public int hashCode()
//который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
//Objects.hash(...))
//7. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.


import java.util.Objects;

public class Cat {

    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getColor(){
        return color;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "Кличка: " + name + ", " +
                "Возраст: " + age + ", " +
                "Окрас: " + color ;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) &&
                age == cat.age &&
                color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}
