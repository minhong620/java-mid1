package exception.basic.checked;

public class CheckedThrowMain {

    // 부모인 Exception을 던지는 것도 가능하다(자식까지 던져진다)
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}
