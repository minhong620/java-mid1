package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "hello Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed = " + reversed);
    }
}
