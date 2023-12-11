package Serveur;

import java.io.*;
import java.net.*;
import java.util.List;

public class Serveur {
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

                // Désérialiser la liste des Pokémon du joueur
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                List<Pokemon> listePokemons = (List<Pokemon>) in.readObject();

                // Lancer un thread pour gérer les actions du joueur
                new JoueurThread(socket, listePokemons).start();
                nbJoueurs++;
            }
 
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
