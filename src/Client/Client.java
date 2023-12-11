package Client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Client implements Runnable {
	private Joueur joueur;
	
	public Client(Joueur joueur) {
		this.joueur = joueur;
	}
	
//  @Override
    public void run() {
        DataOutputStream out;

        try {
            Socket socket = new Socket("127.0.0.1", 2000);
            out = new DataOutputStream(socket.getOutputStream());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);


            socket.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

	public static void main(String[] args) {
		Joueur j = new Joueur("John");
        Client c = new Client(j);
        c.run();
    }
}