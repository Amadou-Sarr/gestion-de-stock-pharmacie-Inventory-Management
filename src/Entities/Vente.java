package Entities;

import java.util.Date;

/**
 * Created by AMADOU on 20/07/2017.
 */
public class Vente {
    private Date date;
    private double montant;
    private int nombreMedicaments;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getNombreMedicaments() {
        return nombreMedicaments;
    }

    public void setNombreMedicaments(int nombreMedicaments) {
        this.nombreMedicaments = nombreMedicaments;
    }
}
