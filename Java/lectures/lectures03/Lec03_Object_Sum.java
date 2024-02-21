package Java.lectures.lectures03;

public class Lec03_Object_Sum {
    public static void main(String[] args) {

        System.out.println(Sum(12, 3)); // 15
        System.out.println(Sum(1.0, 13)); // 14.0
        System.out.println(Sum(2, 3.0)); // 5.0
        System.out.println(Sum(1.2, 5.3)); // 6.5
    }

    static Object Sum(Object a, Object b){

        if (a instanceof Double && b instanceof Double){
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer){
            return (Object) ((Integer) a + (Integer) b);
        } else  if (a instanceof Integer && b instanceof Double){
            return (Object) ((Integer) a + (Double) b);
        } else {
            return (Object) ((Double) a + (Integer) b);
        }
    }
}
