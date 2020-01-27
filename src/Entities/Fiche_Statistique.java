package Entities;

/**
 * Created by AMADOU on 20/07/2017.
 */
public class Fiche_Statistique extends Medicament {
    private  int weeklystat;
    private int monthlystat;
    private int yearlystat;

    public int getWeeklystat() {
        return weeklystat;
    }

    public void setWeeklystat(int weeklystat) {
        this.weeklystat = weeklystat;
    }

    public int getMonthlystat() {
        return monthlystat;
    }

    public void setMonthlystat(int monthlystat) {
        this.monthlystat = monthlystat;
    }

    public int getYearlystat() {
        return yearlystat;
    }

    public void setYearlystat(int yearlystat) {
        this.yearlystat = yearlystat;
    }
}
