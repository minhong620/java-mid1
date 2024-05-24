package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        String result2 = a + b; // 자바에서 특별히 편의상 +를 허용
        System.out.println(result1);
        System.out.println(result2);
    }
}
