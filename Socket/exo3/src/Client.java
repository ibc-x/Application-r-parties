import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {

    public static int confirmOperator(String [] operateurs, String op){
        int n = 0;
        for (String opr : operateurs) {
            if (op.equals(opr)) n++;
        }
        return n;
    }

    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket = new Socket("127.0.0.1", 9595);
        System.out.println("Calculatrice ");
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            try {
                System.out.println("Calculer deux valeurs a et b \n");
                String message="";
                System.out.println("Saisir a ");
                Double a = sc.nextDouble();
                System.out.println("Saisir l'un des operateurs suivants : [ + - / * ] ");
                String op = sc.next();
                System.out.println("Saisir b ");
                Double b = sc.nextDouble();
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                String [] operateurs = {"+","-","/","*"};
                if (confirmOperator(operateurs, op)==0) {
                    System.out.println("Operation impossible !\n\nReprendre avec un operateur valide !");
                    continue;
                }
                message=a+" "+op+" "+b;
                out.writeUTF(message);
        
                DataInputStream in  = new DataInputStream(socket.getInputStream());
                
                String s1  = in.readUTF();
              
                System.out.println(s1);
                
            }
            catch (IOException e) {
                System.out.println("Le Serveur s'est arrete ");
                socket.close();
            }
        }

    }

}
