package com.coderscampus.assignment4;

public class User implements Comparable<User> {

    private String email;
    private String password;
    private String name;
    private String role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int compareTo(User o) {
        int i = o.getRole().compareTo(this.getRole());
        if (i == 0) {
            i = this.getEmail().compareTo(o.getEmail());
        }
        return i;
    }

}