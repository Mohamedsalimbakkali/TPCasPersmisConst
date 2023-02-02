public class Adresse {
    public String numero;
    public String voie;
    public String ville;
    public String cp;


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Adresse(String numero , String voie , String ville , String cp){
        this.numero=this.validerChaine(numero,2);
        this.voie=this.validerChaine(voie,8);
        this.ville=this.validerChaine(ville,4);
        this.cp=this.validerChaine(cp,5);
    }

    @Override
    public String toString() {
        return   "numero='" + numero + '\'' + ", voie='" + voie + '\'' + ", ville='" + ville + '\'' + ", cp='" + cp ;
    }

    private String validerChaine(String chaine, int taille){
        if(chaine.length()<taille){
            return "";
        }
        else {
            return chaine.substring(0,taille);
        }
    }
}
