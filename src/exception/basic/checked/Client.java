package exception.basic.checked;

public class Client {
    // 예외를 해결 못해서 메서드 밖으로 던진다는 뜻이다
    public void call() throws MyCheckedException {

        // 문제 상황
        throw new MyCheckedException("ex"); // 예외를 터트린다
        // 결론 적으로 예외를 터트리고나서 예외를 해결 못해 메서드 밖으로 던지는 꼴이 된다
    }
}
