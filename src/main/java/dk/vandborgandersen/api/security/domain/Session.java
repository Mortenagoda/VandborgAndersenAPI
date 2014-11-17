package dk.vandborgandersen.api.security.domain;

import javax.persistence.Entity;

/**
 * @author Morten Andersen (mortena@gmail.com)
 */
public class Session {
    private String username;
    private String password;
    private boolean usernameNotFound;
    private boolean incorrectPassword;
    private boolean authenticated;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsernameNotFound(boolean usernameNotFound) {
        this.usernameNotFound = usernameNotFound;
    }

    public boolean isUsernameNotFound() {
        return usernameNotFound;
    }

    public void setIncorrectPassword(boolean incorrectPassword) {
        this.incorrectPassword = incorrectPassword;
    }

    public boolean isIncorrectPassword() {
        return incorrectPassword;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }
}
