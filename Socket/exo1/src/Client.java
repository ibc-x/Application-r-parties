import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket = new Socket("127.0.0.1", 9595);
        System.out.println("Message : ");
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        while (run) {
            try {
                String message=  sc.next();
    
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        
                out.writeUTF(message);
        
                DataInputStream in  = new DataInputStream(socket.getInputStream());
                
                String s1  = in.readUTF();
                if (s1.equals("STOP")) {
                    run = false;
                }
                System.out.println(s1);
                
            } catch (IOException e) {
                System.out.println("Le Serveur s'est arrete ");
                socket.close();
            }
        }

    }

}
