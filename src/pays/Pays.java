package pays;

public class Pays {

    public static final String CODE_TEMP = "ASS";
    public String nom;
    private String code;

    public Pays(String nom, String code) {
        this.nom = nom;
        setCode(code);
    }

    public void setCode(String code) {
        if (valideCode(code)){
            this.code = code;
        } else {
            System.out.println("Code invalide. Attribution d'un code temporaire. Veuillez modifier.");
            this.code = CODE_TEMP;
        }
    }

    public boolean valideCode(String code){
        return code != null && code.matches("^[A-Z]{3}$");
    }
}
