package exception.basic.checked;

// Exception을 상속받은 예외는 체크 예외가 된다
// 체크 예외는 잡거나 던지거나를 필수로 선택해야한다
public class MyCheckedException extends Exception {

    public MyCheckedException(String message) {
        super(message); // 오류 메세지를 부모가 보관한다
    }
}
