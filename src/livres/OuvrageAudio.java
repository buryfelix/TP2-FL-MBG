package livres;

import java.time.LocalDate;

public class OuvrageAudio extends AbstractOuvrage {

    public enum FormatAudio {
        NUMERIQUE, ANALOGIQUE
    }

    private static FormatAudio TYPE_AUDIO_DEFAULT = FormatAudio.NUMERIQUE;

    private int duree = 0;
    private FormatAudio typeAudio = TYPE_AUDIO_DEFAULT;

    public OuvrageAudio(String titre, Auteur auteur, FormatAudio type, int duree, LocalDate date, int nombreExemplaires){
        super(titre, auteur, Format.AUDIO, date, nombreExemplaires);
        setDuree(duree);
        this.typeAudio = type;
    }

    public OuvrageAudio(String titre, Auteur auteur, FormatAudio type, int duree){
        super(titre, auteur, TYPE_DEFAULT, null, NOMBRE_EXEMPLAIRE_DEFAUT);
        setDuree(duree);
        this.typeAudio = type;

    }


    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        if (dureeMinuteValide(duree)) {
            this.duree = duree;
        }else {
            System.out.println("durée invalide");
        }
    }

    private boolean dureeMinuteValide(int duree){
        return duree > 0;
    }

    @Override
    public String toString() {

        String affichageDAte = this.getDate() != null ? this.getDate().toString() : "Non Disponible";

        return "[" + identificateur() + "] " + this.getTitre() + " (" + this.getAuteur().getPrenom() + " "
                + this.getAuteur().getNom() + ") - " + this.getType() + " - disponible le " + affichageDAte + " (" + this.getNombreExemplaires() + " ex. - " + typeAudio + " - " + getDuree() + " .min" + ")";
    }

}
