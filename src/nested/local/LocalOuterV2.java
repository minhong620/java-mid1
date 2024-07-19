package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 인터페이스도 구현할 수 있다!
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                // 자신의 인스턴스 변수인 value에 접근할 수 있다.
                System.out.println("value = " + value);
                // 자신이 속한 코드 블럭의 지역 변수인 localVar에 접근할 수 있다.
                System.out.println("localValue = " + localVar);
                // 자신이 속한 코드 블럭의 매개변수인 paramVar에 접근할 수 있다. 매개변수도 지역 변수의 한 종류이다.
                System.out.println("paramVar = " + paramVar);
                // 바깥 클래스의 인스턴스 멤버인 outInstanceVar에 접근할 수 있다.
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
