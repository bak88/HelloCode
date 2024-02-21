package Java.lectures.lectures03;

public class Lec03_Object {
    public static void main(String[] args) {
        Object o = 1;
        GetType(0);
        o = 1.5;
        GetType(o);

    }

    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }
}
