package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        // enum이 toString()을 오버라이딩해서 참조값을 보기 위해 메서드를 만듦
        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    // 참조값을 보기 위한 메서드
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
