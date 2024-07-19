package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter(); // 지워도 상관없음
        NestedOuter.Nested nested = new NestedOuter.Nested();// 바깥.안에꺼 꼴
        nested.print();

        // 안쪽 클래스는 $로 구분
        System.out.println("nestedClass = " + nested.getClass());
    }
}
