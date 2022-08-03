package com.example.lawapp.persistence.model;


/**
 *
 * @author panicape
 * @version 1.01 July 2022
 */
public class UserDto {

//    private String docId;

    private String name;

    private String username;

    private String mail;



    // Constructores

    public UserDto() {
    }

    public UserDto(String name, String username, String mail) {
        this.name = name;
        this.username = username;
        this.mail = mail;
    }



    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
