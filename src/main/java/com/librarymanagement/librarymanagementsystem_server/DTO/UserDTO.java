package com.librarymanagement.librarymanagementsystem_server.DTO;

public class UserDTO {
    private String name;
    private String email;
    private int contact;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
}
