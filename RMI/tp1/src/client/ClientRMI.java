package client;

import java.rmi.Naming;
import java.util.Scanner;

import serveur.IEquationRemote;
public class ClientRMI {
    public static void main(String[] args) {
        try {
            boolean run = false;
        
            Scanner sc = new Scanner(System.in);
            IEquationRemote stub = (IEquationRemote)Naming.lookup("rmi://localhost:1099/EQS");
            System.out.println("Equation du second degre");
            System.out.println("Saisir le coefficient a ");
            float a = sc.nextFloat();
            System.out.println("Saisir le coefficient b ");
            float b = sc.nextFloat();
            System.out.println("Saisir le coefficient c ");
            float c = sc.nextFloat();

            System.out.println("L'ensemble solution est : "+stub.solution(a,b,c));
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}