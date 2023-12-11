package Serveur;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class JoueurThread extends Thread {
    private Socket socket;
    private List<Pokemon> listePokemons;
    

    public JoueurThread(Socket socket, List<Pokemon> listePokemons) {
        this.socket = socket;
        this.listePokemons = listePokemons;
    }
    
    public void attaque() {
    	
    }

    @Override
    public void run() {
        try {
            // Récupérer les flux d'entrée/sortie pour la communication avec le client
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            // Boucle de traitement des actions du joueur
            while (true) {
                // Lire l'action du joueur depuis le flux d'entrée
                Attaque action = (Attaque) in.readObject();

                

                // Envoyer la mise à jour de la liste des Pokémon après l'action
                out.writeObject(listePokemons);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
