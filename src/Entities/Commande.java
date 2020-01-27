package Entities;

import java.util.Date;

/**
 * Created by AMADOU on 20/07/2017.
 */
public class Commande {
    private Date date;
    private int quantite;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
