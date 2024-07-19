package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;
            // 캡처를 통해 지역 변수와 지역 클래스를 통해 생성한 인스턴의 생명주기가 다른 문제를 해결한다
//            int localVar = 1; // 캡처 변수
//            int paramVar = 2 // 캡처 변수

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("localValue = " + localVar); // 캡처 변수에 접근
                System.out.println("paramVar = " + paramVar); // 캡처 변수에 접근
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면?
        // 자바는 캡처한 지역 변수의 값을 변하지 못하게 막아서 복잡한 문제들을 근본적으로 막는다
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        // printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행한다.
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();// 모든 필드 정보를 얻을 수 있다
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

    }
}
