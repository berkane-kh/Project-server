package com.mkyong.common.controller;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kheireddine on 16/04/2015.
 */
@XmlRootElement
public class ListCV {

    List<CV_Test> listecv = new ArrayList<CV_Test>();

    public void setListecv(List<CV_Test> listecv) {
        this.listecv = listecv;
    }

    public void addCv(CV_Test cv) {
        this.listecv.add(cv);
    }

    public List<CV_Test> getListecv() {
        return listecv;
    }

    public ListCV(){

        listecv = new ArrayList<CV_Test>();
        listecv.add(new CV_Test("Ber1","Kheiro","01/01/1900","rouen France"));
        listecv.add(new CV_Test("Ber2","Kheiro","01/01/1900","rouen France"));
        listecv.add(new CV_Test("Ber3","Kheiro","01/01/1900","rouen France"));
        listecv.add(new CV_Test("Ber4","Kheiro","01/01/1900","rouen France"));


    }


}
