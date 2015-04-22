package com.mkyong.common.controller;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kheireddine on 16/04/2015.
 */
@XmlRootElement(name = "resume")
public class CV_Test {

    String name;
    String prenom;
    String dateNaiss;
    String adresse;

    public CV_Test() {}

    public CV_Test(String name,String prenom,String dateNaiss,String adresse) {
        this.name=name;
        this.prenom=prenom;
        this.dateNaiss=dateNaiss;
        this.adresse=adresse;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getDateNaiss() {
        return dateNaiss;
    }
    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


}
