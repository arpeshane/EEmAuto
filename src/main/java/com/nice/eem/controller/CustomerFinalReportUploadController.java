package com.nice.eem.controller;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nice.eem.dao.CustomerFinalReportUploadDao;
import com.nice.eem.entity.CustomerFinalReportUpload;
@Controller
public class CustomerFinalReportUploadController {
	@Autowired
	CustomerFinalReportUploadDao  customerFinalReportUploadDao;
	// read and store image to MySQL via SpringJPA
	@RequestMapping("/readExcelFile")
	public void readFinalExcelReport() throws Exception {
		ClassPathResource originalReportFile = new ClassPathResource("/original-report/Telus Dashboard.xlsx");
		System.out.println(originalReportFile);
		byte[] arrayPic = new byte[(int) originalReportFile.contentLength()];
		originalReportFile.getInputStream().read(arrayPic);
		CustomerFinalReportUpload customerFinalReportUpload = new CustomerFinalReportUpload(2, "Telus Dashboard.xlsx", arrayPic);
		customerFinalReportUploadDao.save(customerFinalReportUpload);
	}
	
	// retrieve image from MySQL via SpringJPA
	public void retriveImageFromDatabase() throws Exception {
		
		for (CustomerFinalReportUpload customerFinalReportUpload : customerFinalReportUploadDao.findAll()) {
			Files.write(Paths.get("generated-reports/" + customerFinalReportUpload.getFileName()), customerFinalReportUpload.getData());
		}
	}
	
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String index() {
	       
	        return "index";
	    }
	
}
