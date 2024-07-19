package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printData() {
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
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
