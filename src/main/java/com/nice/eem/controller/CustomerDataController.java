package com.nice.eem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nice.eem.service.WorkflesxConcentricProgramService;
import com.nice.eem.service.WorkflesxConcentricSiteService;

/**
 * Created by aboullaite on 2017-02-23.
 */

@Controller
public class CustomerDataController {

    @Autowired
    WorkflesxConcentricProgramService workflesxConcentricProgramService;

    @Autowired
    WorkflesxConcentricSiteService workflesxConcentricSiteService;
    
    /**
     * Handle request to download an Excel document
     */

    // Working for site wise data
    @RequestMapping(value="/myexceldown", method = RequestMethod.GET)
    public String downloadExcel(Model model ){
    	model.addAttribute("programAgentsList", workflesxConcentricProgramService.findProgramWiseData());
    	model.addAttribute("siteAgentsList", workflesxConcentricSiteService.findSiteWiseData());
    	
    	return "";
    }
   
    
    
  
    
}



