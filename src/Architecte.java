public class Architecte extends Personne{
    private String conseilRegional;
    private Adresse adresse;
    private String telephone;

    public Architecte(String nom , String prenom,String conseilRegional , Adresse adresse, String telephone){
        super(nom,prenom);
        this.nom=nom;
        this.conseilRegional=validerChaine(conseilRegional,50);
        this.adresse= adresse;
        if (validerTelephone(telephone)){
            this.telephone=telephone;
        }
        else{
            this.telephone="";
        }
    }
    private boolean validerTelephone(String telephone){
        //on teste sur la norme standard d'un numero de telephone
        return telephone.length()==10;
    }

    public String getConseilRegional() {
        return conseilRegional;
    }

    public void setConseilRegional(String conseilRegional) {
        this.conseilRegional = conseilRegional;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Architecte:  conseilRegional='" + conseilRegional + '\'' + ", adresse=" + adresse.toString() + ", telephone='" + telephone + '\'' + ", nom='" + nom + '\'' + ", prenom='" + prenom ;
    }
}
