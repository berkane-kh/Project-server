package com.mkyong.common.controller;

import com.mkyong.common.controller.CV_Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kheireddine on 16/04/2015.
 */

@Controller
@RequestMapping("/resume")
public class XMLControler {

   static ListCV listCV= new ListCV();

    @RequestMapping( value="",method = RequestMethod.GET)
    public @ResponseBody
    ListCV getListCVInXML() {
        List<CV_Test> lstCV=listCV.getListecv();
        return listCV;

    }

    //get avec id
    @RequestMapping( value="{id}",method = RequestMethod.GET)
    public @ResponseBody
    CV_Test getIdCVInXML(@PathVariable String id) {
        List<CV_Test> lstCV=listCV.getListecv();
        int i=Integer.parseInt(id);
        return lstCV.get(i);

    }

    @RequestMapping( value="/add",method = RequestMethod.POST)
    public
    void postCVInXML(@RequestBody CV_Test cv ) {
        listCV.addCv(cv);

    }



}
