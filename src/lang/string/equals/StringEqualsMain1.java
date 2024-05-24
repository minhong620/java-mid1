package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교:" + str1.equals(str2));

        String str3 = "hello"; // x003
        String str4 = "hello"; // x 003 // 문자열풀에서 가져와 사용해서 참조값이 같음 -> 성능 향상
        System.out.println("리터럴 == 비교: " + (str4 == str4));
        System.out.println("리터럴 equals 비교: " + str4.equals(str4));
    }
}
