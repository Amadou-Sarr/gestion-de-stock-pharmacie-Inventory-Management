package Entities;

/**
 * Created by AMADOU on 20/07/2017.
 */
public class Fournisseur {

private int codeFournisseur;
    private String nomFournisseur;
    private int telephone;
    private String email;
    private String adresse;

    public int getCodeFournisseur() {
        return codeFournisseur;
    }

    public void setCodeFournisseur(int codeFournisseur) {
        this.codeFournisseur = codeFournisseur;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
