import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, UnknownHostException {

        Socket client = new Socket("127.0.0.1",1026);

        System.out.println("Nom client");

        Scanner sc = new Scanner(System.in);
        String nomClient = sc.next();

        DataOutputStream out = new DataOutputStream(client.getOutputStream());
        out.writeUTF(nomClient);

        DataInputStream in  = new DataInputStream(client.getInputStream());
        
        String s1  = in.readUTF();
      
       System.out.println(s1);
    }
}
 