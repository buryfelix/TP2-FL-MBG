package tests;

import livres.Auteur;
import livres.AbstractOuvrage;
import livres.OuvragePapier;
import pays.Pays;

import java.util.ArrayList;
import java.util.List;

public class Librairie {
    private List<Auteur> auteurs  = new ArrayList<>();
    //TODO REFAIRE OUVRAGES
    private List<AbstractOuvrage> ouvrages = new ArrayList<>();

    public Librairie(){
        Auteur albertine = new Auteur("Albertine", "Tremblay", new Pays("Canada","CAN"));
        Auteur john = new Auteur("John", "Smith", new Pays("États-Unis", "USA"));
        Auteur jean = new Auteur("Jean", "Némarre",new Pays("Suisse", "SWI"));
        auteurs.add(albertine);
        auteurs.add(john);
        auteurs.add(jean);

        ouvrages.add(new OuvragePapier("Titre 1", john, 40));
        ouvrages.add(new OuvragePapier("Titre 2", albertine, 70));
        ouvrages.add(new OuvragePapier("Titre 3", john,1500));
        ouvrages.add(new OuvragePapier("Titre 4", john,3));
        //TODO CHANGER POUR 3 OUVRAGES DES 2 TYPES RESTANTS
//        ouvrages.add(new Ouvrage("Titre 5", albertine));
//        ouvrages.add(new Ouvrage("Titre 6", john));
//        ouvrages.add(new Ouvrage("Titre 7", john));
//        ouvrages.add(new Ouvrage("Titre 8", albertine,Ouvrage.Format.VIDEO));
//        ouvrages.add(new Ouvrage("Titre 9", john,Ouvrage.Format.AUDIO));
//        ouvrages.add(new Ouvrage("Titre 10", jean));
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public List<AbstractOuvrage> getOuvrages() {
        return ouvrages;
    }

    public List<AbstractOuvrage> trouverOuvrages(Auteur auteur) {
        //ATTENTION il faut implémenter equals dans auteur pour que ca marche!!!!!
        int count = 0;

        List<AbstractOuvrage> trouves = new ArrayList<>();
        for (AbstractOuvrage ouvrage : ouvrages) {
            if (ouvrage.getAuteur().equals(auteur)) {
                trouves.add(ouvrage);
            }
        }

        return trouves;
    }
}
