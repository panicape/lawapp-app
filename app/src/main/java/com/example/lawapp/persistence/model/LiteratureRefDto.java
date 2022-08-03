package com.example.lawapp.persistence.model;


/**
 *
 * @author panicape
 * @version 1.01 July 2022
 */
public class LiteratureRefDto {

    private String docId;

    private String username;

    private String dateCreation;

    private String dateUpdate;


    // Getters & Setters

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

}
