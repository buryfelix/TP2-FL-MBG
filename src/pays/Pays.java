package pays;

public class Pays {

    public static final String CODE_DEFAUT = "ASS";
    public String nom;
    private String code = CODE_DEFAUT;

    public Pays(String nom, String code) {
        this.nom = nom;
        setCode(code);
    }

    public void setCode(String code) {
        if (valideCode(code)){
            this.code = code;
        } else {
            System.out.println("Code invalide.");
        }
    }

    public boolean valideCode(String code){
        return code != null && code.matches("^[A-Z]{3}$");
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
