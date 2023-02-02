import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Adresse a =new Adresse("12" , "Boulevard des roi" , "marrakech" , "26000");
        System.out.println(a.toString());
        Adresse b =new Adresse("75" ,"Notre dame" , "Paris" ,"75000");
        System.out.println(b.toString());

        Architecte architecte=new Architecte("hamid" , "michelle" , "directeur de superette" , a,"0768983243");
        System.out.println(architecte.toString());
        Deposant deposant = new Deposant("james" , "gosling" , "male" , "jamesgosling@java.com" ,b);
        System.out.println(deposant.toString());
        ArrayList<Personne> liste=new ArrayList<Personne>();
        liste.add(deposant);
        liste.add(architecte);
        for(int i=0;i<liste.size();i++){
            System.out.println(liste.get(i).toString());
        }




    }
}