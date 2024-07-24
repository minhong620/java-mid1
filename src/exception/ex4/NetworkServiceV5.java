package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        // client 변수를 try에서 선언했기 때문에 try에서만 쓸 수 있다
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data); // try에서 나가면 자동으로 AutoCloseable.close()를 실행한다(catch로 가더라도)
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
