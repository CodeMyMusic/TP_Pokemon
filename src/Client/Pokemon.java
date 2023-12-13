package Client;

import Client.Pokedex.TypePokemon;

public class Pokemon {
	
    private int id;
    private String nom;
    private TypePokemon type;
    private int pv;
    private int pc;
    private boolean base;
    
    public String getNom() {
    	return nom;
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypePokemon getType() {
		return type;
	}

	public void setType(TypePokemon type) {
		this.type = type;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getPc() {
		return pc;
	}

	public void setPc(int pc) {
		this.pc = pc;
	}

	public boolean isBase() {
		return base;
	}

	public void setBase(boolean base) {
		this.base = base;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	// Constructeurs
    public Pokemon(String nom, TypePokemon type, int pv, int pc, boolean base) {
        this.nom = nom;
        this.type = type;
        this.pv = pv;
        this.pc = pc;
        this.base = base;
    }

    public Pokemon(String nom, TypePokemon type, int pv, int pc) {
        this(nom, type, pv, pc, false);
    }

    public Pokemon(String nom, TypePokemon type, int pv) {
        this(nom, type, pv, 0, false);
    }

    public Pokemon(String nom, TypePokemon type) {
        this(nom, type, 0, 0, false);
    }

    public Pokemon(String nom) {
        this(nom, TypePokemon.PLANTE, 0, 0, false); // Défaut à un type (par exemple, PLANTE) si aucun type n'est
                                                    // spécifié
    }

    public Pokemon(String nom, int pv, int pc) {
        this(nom, TypePokemon.PLANTE, pv, pc, false);
    }
    
    @Override
    public String toString() {
    	return String.format("Pokemon %s :\ntype : %s", nom, type);  
    }
}
