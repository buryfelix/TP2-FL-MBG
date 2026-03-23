import livres.Auteur;
import livres.Ouvrage;

import java.util.ArrayList;

public class Serie {

    public String nom;
    public ArrayList<Ouvrage> ouvrages;

    public Serie (String nom,  ArrayList<Ouvrage> ouvrages ) {
        this.nom = nom;
        this.ouvrages = ouvrages;

    }
}
