package com.Spring.Fundamentals.pathfinder.Service.session;

import org.springframework.stereotype.Component;

@Component
public class LoggedUser {
    private String userName;
    private String email;
    private String fullName;
    private boolean isLogged;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }

    public void reset() {
        setUserName(userName);
        setEmail(email);
        setFullName(fullName);
        setLogged(false);
    }
}
