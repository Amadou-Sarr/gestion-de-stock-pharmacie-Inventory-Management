package Entities;

/**
 * Created by AMADOU on 20/07/2017.
 */
public class Inventaire {
    protected String categorie;
    protected String famille;
    protected int numero_etagere;


    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public int getNumero_etagere() {
        return numero_etagere;
    }

    public void setNumero_etagere(int numero_etagere) {
        this.numero_etagere = numero_etagere;
    }
}
