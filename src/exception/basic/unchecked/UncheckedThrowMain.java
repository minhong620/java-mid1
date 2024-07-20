package exception.basic.unchecked;

public class UncheckedThrowMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        // 정상 종료가 출력될 수가 없다(계속 던지기 때문에)
        System.out.println("정상 종료");
    }
}
