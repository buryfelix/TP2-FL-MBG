package livres;

import java.time.LocalDate;

public class OuvragePapier extends AbstractOuvrage {

    public static final int NB_PAGES_DEFAUT = 0;

    public int pages = NB_PAGES_DEFAUT;

    public OuvragePapier(String titre, Auteur auteur, LocalDate date,
                         int nombreExemplaires, int pages) {
        super(titre, auteur, Format.PAPIER, date, nombreExemplaires);
        setPages(pages);
    }

    public OuvragePapier(String titre, Auteur auteur, LocalDate date, int pages){
        super(titre,auteur,Format.PAPIER,date,NOMBRE_EXEMPLAIRE_DEFAUT);
        setPages(pages);
    }

    public OuvragePapier(String titre, Auteur auteur, int pages) {
        super(titre, auteur, Format.PAPIER, null, NOMBRE_EXEMPLAIRE_DEFAUT);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    private void setPages(int pages) {
        if (nbPagesValides(pages)){
            this.pages = pages;
        } else {
            System.out.println("Nombre de pages invalides: " + pages);
        }
    }

    private static boolean nbPagesValides(int pages){
        return (pages >= 0);
    }

    @Override
    public String toString() {

        String affichageDAte = this.getDate() != null ? this.getDate().toString() : "Non Disponible";

        return "[" + identificateur() + "] " + this.getTitre() + " (" + this.getAuteur().getPrenom() + " "
                + this.getAuteur().getNom() + ") - " + this.getType() + " - disponible le " + affichageDAte +
                " (" + this.getNombreExemplaires() + " ex. - " + pages + " pages)";
    }
}
