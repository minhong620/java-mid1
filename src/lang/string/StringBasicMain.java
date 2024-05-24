package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        // 둘 다 가능한 방법
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
