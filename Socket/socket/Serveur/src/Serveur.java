import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

public class Serveur {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(1026);

        System.out.println("En attente de connexion d'un client");

        Socket s = ss.accept();
        System.out.println("Connexion etablie ");

        DataInputStream in  = new DataInputStream(s.getInputStream());
        String nomClient = in.readUTF();

        String s1 = "Bienvenue "+nomClient+" bien connecté ";

        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeUTF(s1);
    }
}
 