import java.io.IOException;
import java.net.UnknownHostException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress ;
public class Client {

    public static void main(String[] args) throws UnknownHostException, IOException {
      
       DatagramSocket socket = new DatagramSocket();
       String message = "Bonjour";
       DatagramPacket envoi = new DatagramPacket(message.getBytes(), message.length(),  InetAddress.getByName("127.0.0.1"), 9595);

       socket.send(envoi);

       DatagramPacket recu = new DatagramPacket(new byte[1024], 1024);

       socket.receive(recu);
       
       System.out.println("Message : " + new String(recu.getData(), 
        0, recu.getLength()));
       
        System.out.println("Source : " + recu.getAddress() + ":" + recu.getPort());

    }

}
