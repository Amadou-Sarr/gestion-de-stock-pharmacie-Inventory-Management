package Controller;

import java.sql.Date;

/**
 * Created by AMADOU on 27/07/2017.
 */
public class result {
    public int id;
    public int reference;
    public String libelle;
    public String categorie;
    public Double prix;
    public Date date_exp;
    public int qte_en_stock;
    public int qte_min;
    public int numero_etagere;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Date getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(Date date_exp) {
        this.date_exp = date_exp;
    }

    public int getQte_en_stock() {
        return qte_en_stock;
    }

    public void setQte_en_stock(int qte_en_stock) {
        this.qte_en_stock = qte_en_stock;
    }

    public int getQte_min() {
        return qte_min;
    }

    public void setQte_min(int qte_min) {
        this.qte_min = qte_min;
    }

    public int getNumero_etagere() {
        return numero_etagere;
    }

    public void setNumero_etagere(int numero_etagere) {
        this.numero_etagere = numero_etagere;
    }
}
