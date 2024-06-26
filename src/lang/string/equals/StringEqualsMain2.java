package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello"; // x003
        String str4 = "hello"; // x 003
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        //return x == y;
        return x.equals(y); // 어떤게 들어올지 몰라서 문자열 비교는 항상 equals()로!(동등성 비교)
    }
}
