import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

public class Serveur {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(9595);
        System.out.println("En attente de la connexion du Serveur !");
        while (true) {
            Socket socket =  ss.accept();
            Thread t = new Thread() {
                public void run() {
                    try {
                        DataInputStream in = new DataInputStream(socket.getInputStream());
                        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                        while (true) {
                            String str = in.readUTF();
                            
                            if (str.trim().equals("STOP".trim())){
                                out.writeUTF("STOP");
                                break;
                            }
                            out.writeUTF("Response : "+str.toUpperCase());
                        }
                        System.out.println("Fermeture du programme...");
                    } catch (IOException e) { 
                        System.out.println("Erreur");
                     }
                    finally {
                        try {
                            socket.close();
                        } catch(IOException e) {}
                    }
                }
            };
          
          t.start();
        }


     
    }
}
 