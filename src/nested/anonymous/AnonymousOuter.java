package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer() { // Printer 인터페이스를 바로 구현
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
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
