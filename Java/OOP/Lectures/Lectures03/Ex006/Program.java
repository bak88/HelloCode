package Java.OOP.Lectures.Lectures03.Ex006;

public class Program {
    public static void main(String[] args) {


//        Worker1 w1 = new Worker1("Имя", "Фамилия", 20, 20);
//        Worker1 w2 = new Worker1("Имя", "Фамилия", 20, 20);
//
//        System.out.println(w1 == w2); // false
//        System.out.println(w1.compareTo(w2)); // 0
//        System.out.println(w2.compareTo(w1)); // 0
//        System.out.println(w1.equals(w2)); // false
//        System.out.println(w1.hashCode()); // 1554547125
//        System.out.println(w2.hashCode()); // 1867083167


//         Worker2 w1 = new Worker2("Имя", "Фамилия", 20, 201);
//         Worker2 w2 = new Worker2("Имя", "Фамилия", 20, 201);
//
//         System.out.println(w1 == w2); // false
//         System.out.println(w1.compareTo(w2)); // 0
//         System.out.println(w2.compareTo(w1)); // 0
//         System.out.println(w1.equals(w2)); // false
//         System.out.println(w1.hashCode()); // 1531448569
//         System.out.println(w2.hashCode()); // 1867083167


        Worker3 w1 = new Worker3("Имя", "Фамилия", 20, 201);
        Worker3 w2 = w1;// new Worker3("Имя", "Фамилия", 20, 201);

        System.out.println(w1 == w2);
        System.out.println(w1.equals(w2));
        System.out.println(w1.hashCode());
        System.out.println(w2.hashCode());
        System.out.println(w1);
        System.out.println(w2);
        w1.age = 31;
        System.out.println(w1);
        System.out.println(w2);

    }
}
