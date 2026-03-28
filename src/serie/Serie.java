package serie;

import livres.Ouvrage;

import java.util.ArrayList;

public class Serie {

    public static final String INCONNU = "Inconnu";

    public String nom;
    public ArrayList<Ouvrage> ouvrages = new ArrayList<Ouvrage>();

    public Serie (String nom) {
        setNom(nom);
    }

    public void setNom(String nom){
        //Set le nom inconnu si null
        if (nom == null){
            this.nom = INCONNU;
        } else {
            this.nom = nom;
        }
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nom='" + nom + '\'' +
                ", ouvrages=" + ouvrages +
                '}';
    }
}
