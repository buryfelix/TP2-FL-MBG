package tests;

import java.time.LocalDate;
import java.util.List;

import livres.AbstractOuvrage;
import livres.Auteur;

import livres.OuvragePapier;
import serie.Serie;

import pays.Pays;


/**
 * CoursPOO 1
 *
 * @author Julien.Brunet màj Jocelyn
 * @since H25
 */
public class TestOuvrage {

    public static void main(String[] args) {
        TestOuvrage test = new TestOuvrage();
        test.testOuvrages();
        test.testTrouver();
        test.testPays();
        test.testSerie();
    }

    public void testOuvrages() {
        //Deux auteurs deja prets pour les tests...
        Pays canada = new Pays("Canada", "CAN");
        Pays usa = new Pays("Etats-Unis", "USA");
        Auteur albertine = new Auteur("Albertine", "Tremblay", canada);
        Auteur john = new Auteur("John", "Smith", usa);

        //Voici une partie des tests! Il faut en ajouter, pour les fonctionnalités non testées!
        System.out.println("-----Test des constructeurs d'ouvrage et des diverses validations-----------");
        OuvragePapier livreA = new OuvragePapier("Titre assez long", john, 500000000);
        System.out.println(livreA);
        //TODO REFAIRE OUVRAGES, livreB AUDIO ET livreC VIDEO
//        Ouvrage livreB = new Ouvrage("Ti", john);
//        System.out.println(livreB);
//        Ouvrage livreC = new Ouvrage(null, john);
//        System.out.println(livreC);

        //bibliotheque.Auteur null et valeur par défaut de l'bibliotheque.Auteur
        OuvragePapier livreA1 = new OuvragePapier("Titre assez long", null, 666);
        System.out.println(livreA1);
        //bibliotheque.Auteur fonctionnel
        OuvragePapier livre1 = new OuvragePapier("Tout va bien", albertine, 454);
        System.out.println(livre1);

        //Date null et valeur par défaut de la date
        //TODO REFAIRE OUVRAGES
        livre1.setDate(null);
        System.out.println(livre1);
        livre1.setDate(LocalDate.now().minusYears(5));
        System.out.println(livre1);

        //Test de la validation sur le nb d'exemplaires (valide et non valide)
        //TODO REFAIRE OUVRAGES, livre2 AUDIO
//        Ouvrage livre2 = new Ouvrage("Tout va bien", albertine, Ouvrage.Format.AUDIO, LocalDate.now(), -10);
//        System.out.println(livre2);

//        livre2 = new Ouvrage("Tout va bien", albertine, Ouvrage.Format.PAPIER, LocalDate.now(), 20);
//        System.out.println(livre2);

        System.out.println("\n-----Tests des méthodes acheter et vendre-----------");

        //TODO REFAIRE OUVRAGES, livre3 VIDEO
//        Ouvrage livre3 = new Ouvrage("Musique du hasard", new Auteur("Paul", "Auster", usa), Ouvrage.Format.PAPIER, LocalDate.now(), 5);
//        System.out.println(livre3);

//        livre3.acheter(5);
//        System.out.println(livre3);
//
//        System.out.println("On peut vendre 8 livres? " + livre3.vendre(8));
//        System.out.println(livre3);
//
//        System.out.println("On peut vendre 10 livres? " + livre3.vendre(10));
//        System.out.println(livre3);

        //TODO REFAIRE OUVRAGES
        OuvragePapier livre4 = new OuvragePapier("Test", new Auteur("A", "B", usa), LocalDate.now(), 5);

        System.out.println("\n-----Tests de la  méthode equals()-----------");
        //Deux ouvrages égaux
        OuvragePapier livre5 = new OuvragePapier("Test", new Auteur("A", "B", usa), null, 5);
        OuvragePapier livre6 = new OuvragePapier("Test", new Auteur("A", "B", usa), LocalDate.now(), 10);
        //Un qui ne l'est pas
        OuvragePapier livre7 = new OuvragePapier("Test", new Auteur("Z", "B", usa), LocalDate.now(), 5);

        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre5));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre6));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(livre7));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(john));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(null));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals("Test"));
    }


    private void testTrouver() {
        Librairie bibliotheque = new Librairie();
        Auteur john = bibliotheque.getAuteurs().get(1);

        Pays canada = new Pays("Canada", "CAN");
        Pays france = new Pays("France", "FRA");
        System.out.println("\n-----Test de votre méthode trouverOuvrage-----------");
        List<AbstractOuvrage> resultat = bibliotheque.trouverOuvrages(new Auteur("Albertine", "Tremblay", canada));
        System.out.println("Livres de albertine: " + resultat);

        resultat = bibliotheque.trouverOuvrages(john);
        System.out.println("Livres de john: " + resultat);

        resultat = bibliotheque.trouverOuvrages(new Auteur("Jacques", "Beaulieu", france));
        System.out.println("Livres de Jacques: " + resultat);
    }


    public void testSerie() {
        //Création d'un auteur valide
        Pays usa = new Pays("Etats-Unis", "USA");
        Auteur john = new Auteur("John", "Smith", usa);
        //Création d'un ouvrage valide
        OuvragePapier livreA = new OuvragePapier("Harry Potter et la Communauté de l'Anneau", john, 371);
        //Création d'une série
        Serie serieA = new Serie("Harry Potter");
        System.out.println(serieA);
        Serie serieB = new Serie(null);
        System.out.println(serieB);
        //Ajout d'un ouvrage
        serieA.ouvrages.add(livreA);
        System.out.println(serieA);

        //Retrait d'un ouvrage
        serieA.ouvrages.remove(livreA);
        System.out.println(serieA);
    }

    public void testPays() {

        //Tests de pays invalides
        System.out.println("-----Test des constructeurs de pays et des diverses validations-----------");
        Pays invalide1 = new Pays("Canada", "AAAA");

        Pays invalide2 = new Pays("France", "AA");

        Pays invalide3 = new Pays("France", "aaa");

        Pays invalide4 = new Pays("France", "111");


        //Création d'un pays valide
        Pays angleterre = new Pays("Angleterre", "ANG");
        Auteur auteur1 = new Auteur("William", "Shakespeare", angleterre);
        System.out.println(angleterre);
        System.out.println(auteur1);


    }

}

