package Java.JavaYouTube;
// Методы в Java
public class JavaYouTube08 {
    public static void main(String[] args) {

        byte[] nums1 = new byte[] {3, 5, 7, 8};
        System.out.println(summaArray(nums1));

        byte[] nums2 = new byte[] {3, 5, 7, 8, 9, 51, -100};
        System.out.println(summaArray(nums2));
    }

    public static int summaArray(byte[] arr){
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        return summa;
    }
}
