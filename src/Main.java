import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) throws IOException {

        UdpClient client = new UdpClient();

        client.sendAndReceiveMessage("Hello");

    }
}