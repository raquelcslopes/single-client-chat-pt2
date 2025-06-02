import java.io.IOException;
import java.net.*;

public class UdpClient {
    public void sendAndReceiveMessage (String message) throws SocketException {
        //open the socket
        DatagramSocket clientSocket = new DatagramSocket();

        //writing the letter
        try {
            clientSocket = new DatagramSocket(6624);
            byte[] sendBuffer = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(
                    sendBuffer,
                    sendBuffer.length,
                    InetAddress.getByName("127.0.0.1"), 8769);

            //sending the letter
            clientSocket.send(sendPacket);

            //receiving the message
            byte[] recvBuffer = new byte[1024];
            DatagramPacket receivedPacket = new DatagramPacket(recvBuffer, recvBuffer.length);
            clientSocket.receive(receivedPacket);

            //reading the message (from bytes to String)
            String serverMessage = new String(recvBuffer, 0, receivedPacket.getLength());

            //printing the message
            System.out.println(serverMessage);

            //closing the socket
            clientSocket.close();

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
