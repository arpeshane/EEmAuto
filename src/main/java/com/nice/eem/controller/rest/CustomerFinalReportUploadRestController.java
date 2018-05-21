package com.nice.eem.controller.rest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nice.eem.dao.CustomerFinalReportUploadDao;
@RestController
public class CustomerFinalReportUploadRestController {
	@Autowired
	CustomerFinalReportUploadDao customerFinalReportUploadDao;

	private static String FINAL_REPORT_UPLOAD = "uploads";

	@SuppressWarnings("deprecation")
	@RequestMapping(
			value="/upload",
			method=RequestMethod.POST,
			consumes= {MimeTypeUtils.MULTIPART_FORM_DATA_VALUE}
			
			 )
	public String upload(@RequestParam(value = "file" ) MultipartFile file, HttpServletRequest request) {
		try {
			String fileName = file.getOriginalFilename();
			String path = request.getServletContext().getRealPath("")
					+ FINAL_REPORT_UPLOAD + File.separator 
					+ fileName;
			System.out.println(path);
			saveFinalReport(file.getInputStream(),path);
			return fileName;
		}catch(Exception e ) {
			return null;
		}
		
		
	}
	private void saveFinalReport(InputStream inputStream, String path) {
		try {
			OutputStream outputStream = new FileOutputStream(new File(path));
			int read = 0;
			byte[] bytes = new byte[1024];
			while ((read = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
			outputStream.flush();
			outputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
