import java.rmi.Naming;
import java.util.Scanner;

public class CalculateurClientRMI {
    public static int confirmOperator(String [] operateurs, String op){
        int n = 0;
        for (String opr : operateurs) {
            if (op.equals(opr)) n++;
        }
        return n;
    }
	public static void main(String[] args) {
        try {
            ICalculateur calculateur = (ICalculateur) Naming.lookup("//localhost:1099/CalculateurService");
            Scanner sc = new Scanner(System.in);
            boolean run = true;
            while (run) { 
                System.out.println("Calcule arithmetique de a et b");
                System.out.println("Saisir a ");
                float a = sc.nextFloat();
                System.out.println("Saisir operateur [+-/*] ");
                String op = sc.next();
                System.out.println("Saisir b ");
                float b = sc.nextFloat();
                double resultat = 0;
                String [] operateurs = {"+","-","/","*"};
                if (confirmOperator(operateurs, op)==0) {
                    System.out.println("Operation impossible !\n\nReprendre avec un operateur valide !");
                    continue;
                }else{

                    switch (op) {
                        case "+":
                            resultat = calculateur.addition(a, b);
                            break;
                        case "-":
                            resultat =calculateur.soubstraction(a, b);
                            break;
                        case "/":
                            try {
                                resultat = calculateur.division(a, b);
                            } catch (ArithmeticException e) {
                                System.out.print("Division par 0 impossible");
                            }
                            break;
                        case "*":
                            resultat =calculateur.multiplication(a, b);
                            break;
                    }
                    System.out.println("le resultat de "+a+" "+op+" "+b+" = "+resultat);
                    System.out.println("Taper r pour continuer et q pour quitter ");
                    String r = sc.nextLine();
                     if (r.equalsIgnoreCase("q")) {
                        run = false;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
