public abstract class Personne { //on a declarer que Personne est une classe abstraite on pas le droit de l'instancie
    protected String nom;
    protected String prenom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public abstract String toString();



    public Personne(String nom , String prenom){
        this.nom=this.validerChaine(nom,4);
        this.prenom=this.validerChaine(prenom,4);

    }
    public String validerChaine(String chaine , int taille){
        //verification si la chaine est inferieur a la taille
        if(chaine.length()<taille){
            return "";
        }
        //on tronque la chaine du debut indice 0 Jusqu'a l'indice de la taille
        else{
            return chaine.substring(0,taille);
        }


    }
}
