package Entities;

import java.util.Date;

/**
 * Created by AMADOU on 20/07/2017.
 */
public class Medicament extends Inventaire {

    protected int reference;
    protected String libelle;
    protected double prix;
    protected int qte_en_stock;
    protected int qte_min;
    protected Date dateexp;


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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
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

    public Date getDateexp() {
        return dateexp;
    }

    public void setDateexp(Date dateexp) {
        this.dateexp = dateexp;
    }
}
