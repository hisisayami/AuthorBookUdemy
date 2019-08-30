package com.spring5webapp.spring5webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Pubname;
    private String Publaddress;

    //private Book book;


    public Publisher() {
    }

    public Publisher(String pubname, String publaddress) {
        Pubname = pubname;
        Publaddress = publaddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPubname() {
        return Pubname;
    }

    public void setPubname(String pubname) {
        Pubname = pubname;
    }

    public String getPubladdress() {
        return Publaddress;
    }

    public void setPubladdress(String publaddress) {
        Publaddress = publaddress;
    }
}
