package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter(); // x001
        InnerOuter.Inner inner = outer.new Inner(); // 내부에 x002가 만들어짐(개념상)
        inner.print();

        System.out.println("innerClass= " + inner.getClass());
    }
}
