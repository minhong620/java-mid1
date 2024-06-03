package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer (다른 타입 간에는 오토 박싱 불가능)
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        // Integer -> int
        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        // int -> Integer
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
