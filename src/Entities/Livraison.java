package Entities;

import java.util.Date;

/**
 * Created by AMADOU on 20/07/2017.
 */
public class Livraison {
    private Date date;
    private int lot;
    private String details;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
