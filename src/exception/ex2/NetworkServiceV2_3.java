package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        // 하나의 try 안에 정상 흐름을 모두 담는다        
        try {
            client.connect();
            client.send(data);
            client.disconnect();
            // 예외 부분은 catch 블럭에서 해결한다
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
        // 이렇게 하면 정상 흐름은 try 블럭에 들어가고, 예외 흐름은 catch 블럭으로 명확하게 분리할 수 있다

    }
}
