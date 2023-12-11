package Serveur;


import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Random;

 
public class Joueur extends Thread {
	private int nbPokemons = 6;
    private Socket socket;
    private static Random rand = new Random(); 
    
    private String nom;
    

    public Joueur(Socket socket) {
		this.socket = socket;
	}

	public void run() {
        try {
            InputStream input = socket.getInputStream();
            
            InputStream inputStream = socket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            List<Pokemon> listOfPokemons = (List<Pokemon>) objectInputStream.readObject();
            
            Pokemon randomElement = listOfPokemons.get(rand.nextInt(listOfPokemons.size()));
           
            
            nbPokemons--;
 
            socket.close();
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
