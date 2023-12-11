package Serveur;

import java.io.*;
import java.net.*;

public class Arène {
	private static int nbMaxJoueurs = 2;
	private static int nbJoueurs = 0;
    public static void main(String[] args) {
        if (args.length < 1) return;
 
        int port = Integer.parseInt(args[0]);
 
        try (ServerSocket serverSocket = new ServerSocket(port)) {
 
            System.out.println("Server is listening on port " + port);
 
            while (nbJoueurs < nbMaxJoueurs) {
                Socket socket = serverSocket.accept();
                System.out.println("Nouveau joueur");
                new Joueur(socket).start();
                nbJoueurs++;
            }
 
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
