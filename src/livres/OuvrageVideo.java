package livres;

import java.time.LocalDate;

public class OuvrageVideo extends AbstractOuvrage {

    private int dureeMin = 0;
    private int tailleMb = 0;

    public OuvrageVideo(String titre, Auteur auteur, int dureeMin, LocalDate date, int nombreExemplaires, int tailleMb){
        super(titre, auteur, Format.VIDEO, date, nombreExemplaires);
        setDureeMin(dureeMin);
        setTailleMb(tailleMb);

    }

    public OuvrageVideo(String titre, Auteur auteur,int tailleMb , int dureeMin){
        super(titre, auteur, TYPE_DEFAULT, null, NOMBRE_EXEMPLAIRE_DEFAUT);
        setDureeMin(dureeMin);
        setTailleMb(tailleMb);

    }

    public int getDureeMin() {
        return dureeMin;
    }

    public void setDureeMin(int dureeMin) {
        if (dureeMinValide(dureeMin)){
            this.dureeMin = dureeMin;
        }else{
            System.out.println("durée invalide");
        }

    }

    public int getTailleMb() {
        return tailleMb;
    }

    public void setTailleMb(int tailleMb) {
        if (tailleMbValide(tailleMb)){
            this.tailleMb = tailleMb;
        }else{
            System.out.println("taille invalide");
        }

    }

    private boolean tailleMbValide(int tailleMb){
        return tailleMb > 0;
    }

    private boolean dureeMinValide(int dureeMin){
        return dureeMin > 0;
    }

    @Override
    public String toString() {

        String affichageDAte = this.getDate() != null ? this.getDate().toString() : "Non Disponible";

        return "[" + identificateur() + "] " + this.getTitre() + " (" + this.getAuteur().getPrenom() + " "
                + this.getAuteur().getNom() + ") - " + this.getType() + " - disponible le " + affichageDAte + " (" + this.getNombreExemplaires() + " ex. - " + getDureeMin() + " - " + getTailleMb() + ")";
    }

}
