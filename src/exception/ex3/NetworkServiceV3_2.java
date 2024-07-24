package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) { // 모든 예외를 잡아서 처리하려면 마지막에 Exception을 두면 된다
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        } finally {
            // finally는 어떤 경우에도 무조건 호출된다
            // 따라서 자원을 해제할 때 주로 사용한다
            client.disconnect();
        }
    }
}
