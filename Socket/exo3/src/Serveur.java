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
                            double resultat = 0;
                            String[] operands = str.split(" ");
                            double a =  Double.parseDouble(operands[0]);
                            double b =  Double.parseDouble(operands[2]);
                            switch (operands[1]) {
                                case "+":
                                    resultat = a+b;
                                    break;
                                case "-":
                                    resultat = a-b;
                                    break;
                                case "/":
                                    try {
                                        resultat = a/b;
                                    } catch (ArithmeticException e) {
                                        out.writeUTF("Division par 0 impossible");
                                    }
                                    break;
                                case "*":
                                    resultat = a*b;
                                    break;
                            }
                            if (str.trim().equals("STOP".trim())){
                                out.writeUTF("STOP");
                                break;
                            }
                            out.writeUTF(str+" = "+resultat);
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
 