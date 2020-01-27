

package Entities;

/**
 * Created by AMADOU on 20/07/2017.
 */
public class Personnel {
    protected String login;
    protected String password;
    protected String recuperation;
    protected boolean access_right;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRecuperation() {
        return recuperation;
    }

    public void setRecuperation(String recuperation) {
        this.recuperation = recuperation;
    }

    public boolean isDroit_access() {
        return access_right;
    }

    public void setDroit_access(boolean droit_access) {
        this.access_right = droit_access;
    }
}
