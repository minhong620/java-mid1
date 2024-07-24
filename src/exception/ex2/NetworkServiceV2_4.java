package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data); // RuntimeException은 catch 대상이 아니다. 예외가 밖으로 던져진다
        } catch (NetworkClientExceptionV2 e) { // RuntimeException은 잡지 않는다
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
        client.disconnect(); // 이 코드는 호출되지 않는다
    }
}
