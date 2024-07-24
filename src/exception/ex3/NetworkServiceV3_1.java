package exception.ex3;


import exception.ex2.NetworkClientExceptionV2;
import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendDate() + ", 메시지: " + e.getMessage());
        } finally {
            // finally는 어떤 경우에도 무조건 호출된다
            // 따라서 자원을 해제할 때 주로 사용한다
            client.disconnect();
        }
    }
}
