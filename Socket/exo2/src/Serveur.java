
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Serveur {
    public static void main(String[] args) throws IOException {
        final int taille = 1024;

        DatagramSocket socket = new DatagramSocket(9595);

        System.out.println("Lancement du serveur");
        
        DatagramPacket paquet = new DatagramPacket(new byte[taille], taille);
        socket.receive(paquet);
        String in = new String(paquet.getData(), 0, paquet.getLength());
        System.out.println("Donnees reçues = "+in+", source : "+paquet.getAddress());
        String message = "Oui, "+in.toLowerCase();
        System.out.println("Donnees envoyees = "+message);
        socket.send(new DatagramPacket(message.getBytes(), message.length(), paquet.getAddress(), paquet.getPort()));
        
     
    }
}
 