package com.nice.eem.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nice.eem.entity.WorkflexConcentricProgramData;
import com.nice.eem.entity.WorkflexConcentricSiteData;
import com.nice.eem.service.WorkflesxConcentricProgramService;
import com.nice.eem.service.WorkflesxConcentricSiteService;

/**
 * Created by aboullaite on 2017-02-23.
 */

@RestController
public class CustomerDataRestController {
  
    @Autowired
    WorkflesxConcentricProgramService workflesxConcentricProgramService;

    @Autowired
    WorkflesxConcentricSiteService workflesxConcentricSiteService;
    /**
     * Handle request to the default page
     */

    // Programwise Data 
    @RequestMapping(value = "/programwise", method = RequestMethod.GET)
    public List<WorkflexConcentricProgramData> viewHome() {
        return workflesxConcentricProgramService.findProgramWiseData();
    }
    
    // Sitewise Data
    @RequestMapping(value = "/sitewise", method = RequestMethod.GET)
    public List<WorkflexConcentricSiteData> viewHomeRest() {
        return workflesxConcentricSiteService.findSiteWiseData();
    }

}
