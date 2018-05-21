
package com.nice.eem.excelutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.nice.eem.entity.WorkflexConcentricProgramData;
import com.nice.eem.entity.WorkflexConcentricSiteData;

/**
 * Created by Ajit on 18-05-2018.
 */
public class ConcentrixFinalReport extends AbstractXlsView {

	
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		// get the file from location
		String excelFilePath = "./Telus Dashboard.xlsx";
		try {
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
		workbook = WorkbookFactory.create(inputStream);

	
		// response will be downloaded by url. 
		//response.setHeader("Content-Disposition", "attachment; filename=\"Telus Dashboard.xls\"");
		
		
		@SuppressWarnings("unchecked")
		List<WorkflexConcentricProgramData> programAgents = (List<WorkflexConcentricProgramData>) model
				.get("programAgentsList");

		@SuppressWarnings("unchecked")
		List<WorkflexConcentricSiteData> siteAgents = (List<WorkflexConcentricSiteData>) model.get("siteAgentsList");

		System.out.println(programAgents);
		System.out.println(siteAgents);

		// create excel xls sheet
		Sheet programSheet = workbook.getSheetAt(1);
		programSheet.setDefaultColumnWidth(30);

		// create excel xls sheet
		Sheet siteSheet = workbook.getSheetAt(2);
		siteSheet.setDefaultColumnWidth(30);

		/*
		 * // create excel xls sheet Sheet programSheet =
		 * workbook.createSheet("Program Wise Data");
		 * programSheet.setDefaultColumnWidth(30);
		 * 
		 * // create excel xls sheet Sheet siteSheet =
		 * workbook.createSheet("Site Wise Data"); siteSheet.setDefaultColumnWidth(30);
		 */

		/*// create style for header cells
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Arial");
		style.setFillForegroundColor(HSSFColor.BLUE.index);
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		font.setBold(true);
		font.setColor(HSSFColor.WHITE.index);
		style.setFont(font);*/

		/*// create header row
		Row programHeader = programSheet.createRow(0);
		programHeader.createCell(0).setCellValue("programname");
		//programHeader.getCell(0).setCellStyle(style);
		programHeader.createCell(1).setCellValue("ctzdatetime");
		//programHeader.getCell(1).setCellStyle(style);
		programHeader.createCell(2).setCellValue("SSactiveagents");
		//programHeader.getCell(2).setCellStyle(style);
		programHeader.createCell(3).setCellValue("totalagent");
		//programHeader.getCell(3).setCellStyle(style);
		programHeader.createCell(4).setCellValue("# of Agents Participating");
		//programHeader.getCell(4).setCellStyle(style);
		programHeader.createCell(5).setCellValue("RTC: # of Req Approved_Extra Hours_SS");
		//programHeader.getCell(5).setCellStyle(style);
		programHeader.createCell(6).setCellValue("RTC: # of Req Declined_Extra Hours_SS");
		//programHeader.getCell(6).setCellStyle(style);
		programHeader.createCell(7).setCellValue("# of Req Auto Approved_Extra Hours_SS");
		//programHeader.getCell(7).setCellStyle(style);
		programHeader.createCell(8).setCellValue("RTC: # of Hours Approved_Extra Hours_SS");
		//programHeader.getCell(8).setCellStyle(style);
		programHeader.createCell(9).setCellValue("RTC: # of Hours Declined_Extra Hours_SS");
		//programHeader.getCell(9).setCellStyle(style);
		programHeader.createCell(10).setCellValue("# of Hours Auto Approved_Extra Hours_SS");
		//programHeader.getCell(10).setCellStyle(style);
		programHeader.createCell(11).setCellValue("Recommended Agents_Extra Hours_Rule");
		//programHeader.getCell(11).setCellStyle(style);
		programHeader.createCell(12).setCellValue("# of RTC Approved_Extra Hours_Rule");
		//programHeader.getCell(12).setCellStyle(style);
		programHeader.createCell(13).setCellValue("Agent Accepted_Extra Hours_Rule");
		//programHeader.getCell(13).setCellStyle(style);
		programHeader.createCell(14).setCellValue("Agent Declined_Extra Hours_Rule");
		//programHeader.getCell(14).setCellStyle(style);
		programHeader.createCell(15).setCellValue("Agent No Response_Extra Hours_Rule");
		//programHeader.getCell(15).setCellStyle(style);
		programHeader.createCell(16).setCellValue("RTC: # of Req Approved_Time Off_SS");
		//programHeader.getCell(16).setCellStyle(style);
		programHeader.createCell(17).setCellValue("RTC: # of Req Declined_Time Off_SS");
		//programHeader.getCell(17).setCellStyle(style);
		programHeader.createCell(18).setCellValue("# of Req Auto Approved_Time Off_SS");
		//programHeader.getCell(18).setCellStyle(style);
		programHeader.createCell(19).setCellValue("RTC: # of Hours Approved_Time Off_SS");
		//programHeader.getCell(19).setCellStyle(style);
		programHeader.createCell(20).setCellValue("RTC: # of Hours Declined_Time Off_SS");
		//programHeader.getCell(20).setCellStyle(style);
		programHeader.createCell(21).setCellValue("# of Hours Auto Approved_Time Off_SS");
		//programHeader.getCell(21).setCellStyle(style);
		programHeader.createCell(22).setCellValue("Recommended Agents_Time Off_Rule");
		//programHeader.getCell(22).setCellStyle(style);
		programHeader.createCell(23).setCellValue("# of RTC Approved_Time Off_Rule");
		//programHeader.getCell(23).setCellStyle(style);
		programHeader.createCell(24).setCellValue("Agent Accepted_Time Off_Rule");
		//programHeader.getCell(24).setCellStyle(style);
		programHeader.createCell(25).setCellValue("Agent Declined_Time Off_Rule");
		//programHeader.getCell(25).setCellStyle(style);
		programHeader.createCell(26).setCellValue("Agent No Response_Time Off_Rule");
		//programHeader.getCell(26).setCellStyle(style);
		programHeader.createCell(27).setCellValue("Total Swaps");
		//programHeader.getCell(27).setCellStyle(style);
		programHeader.createCell(28).setCellValue("Total Swap Hours");
		//programHeader.getCell(28).setCellStyle(style);
		programHeader.createCell(29).setCellValue("Total Trades");
		//programHeader.getCell(29).setCellStyle(style);
		programHeader.createCell(30).setCellValue("# Trade Requests");
		//programHeader.getCell(30).setCellStyle(style);
		programHeader.createCell(31).setCellValue("Total Trade Hours");
		//programHeader.getCell(31).setCellStyle(style);
		programHeader.createCell(32).setCellValue("Scheduled Hours");
		//programHeader.getCell(32).setCellStyle(style);
		programHeader.createCell(33).setCellValue("CurrDayActiveLogins");
		//programHeader.getCell(33).setCellStyle(style);
		programHeader.createCell(34).setCellValue("RTC: # of Req Waiting_Extra Hours_SS");
		//programHeader.getCell(34).setCellStyle(style);
		programHeader.createCell(35).setCellValue("RTC: # of 201Hours Waiting_Extra Hours_SS");
		//programHeader.getCell(35).setCellStyle(style);
		programHeader.createCell(36).setCellValue("RTC: # of Req Waiting_Time Off_SS");
		//programHeader.getCell(36).setCellStyle(style);
		programHeader.createCell(37).setCellValue("RTC: # of Hours Waiting_Time Off_SS");
		//programHeader.getCell(37).setCellStyle(style);
*/
		/**
		 * @SuppressWarnings("unchecked") List<User> users = (List<User>)
		 * model.get("usersList");
		 */

		/*
		 * List<Object> result = (List<Object>) LoadSource.list(); Iterator itr =
		 * result.iterator(); while(itr.hasNext()){ Object[] obj = (Object[])
		 * itr.next(); //now you have one array of Object for each row String client =
		 * String.valueOf(obj[0]); // don't know the type of column CLIENT assuming
		 * String Integer service = Integer.parseInt(String.valueOf(obj[1])); //SERVICE
		 * assumed as int //same way for all obj[2], obj[3], obj[4] }
		 */

		Iterator it = programAgents.iterator();
		int rowCount = 1;
		while (it.hasNext()) {
			Object[] agent = (Object[]) it.next();
			 
			Row userRow = programSheet.createRow(rowCount++);
			userRow.createCell(0).setCellValue(agent[0].toString());
			userRow.createCell(1).setCellValue(agent[1].toString());
			userRow.createCell(2).setCellValue(Integer.valueOf(agent[2].toString()));
			userRow.createCell(3).setCellValue(Integer.valueOf(agent[3].toString()));
			userRow.createCell(4).setCellValue(Integer.valueOf(agent[4].toString()));
			userRow.createCell(5).setCellValue(Integer.valueOf(agent[5].toString()));
			userRow.createCell(6).setCellValue(Integer.valueOf(agent[6].toString()));
			userRow.createCell(7).setCellValue(agent[7].toString());
			userRow.createCell(8).setCellValue(agent[8].toString());
			userRow.createCell(9).setCellValue(agent[9].toString());
			userRow.createCell(10).setCellValue(agent[10].toString());
			userRow.createCell(11).setCellValue(agent[11].toString());
			userRow.createCell(12).setCellValue(agent[12].toString());
			userRow.createCell(13).setCellValue(agent[13].toString());
			userRow.createCell(14).setCellValue(agent[14].toString());
			userRow.createCell(15).setCellValue(agent[15].toString());

			userRow.createCell(16).setCellValue(agent[16].toString());
			userRow.createCell(17).setCellValue(agent[17].toString());
			userRow.createCell(18).setCellValue(agent[18].toString());
			userRow.createCell(19).setCellValue(agent[19].toString());
			userRow.createCell(20).setCellValue(agent[20].toString());
			userRow.createCell(21).setCellValue(agent[21].toString());
			userRow.createCell(22).setCellValue(agent[22].toString());
			userRow.createCell(23).setCellValue(agent[23].toString());
			userRow.createCell(24).setCellValue(agent[24].toString());
			userRow.createCell(25).setCellValue(agent[25].toString());
			userRow.createCell(26).setCellValue(agent[26].toString());
			userRow.createCell(27).setCellValue(agent[27].toString());
			userRow.createCell(28).setCellValue(agent[28].toString());

			userRow.createCell(29).setCellValue(agent[29].toString());
			userRow.createCell(30).setCellValue(agent[30].toString());
			userRow.createCell(31).setCellValue(agent[31].toString());
			userRow.createCell(32).setCellValue(agent[32].toString());
			userRow.createCell(33).setCellValue(agent[33].toString());
			userRow.createCell(34).setCellValue(agent[34].toString());
			userRow.createCell(35).setCellValue(agent[35].toString());
			userRow.createCell(36).setCellValue(agent[36].toString());
			userRow.createCell(37).setCellValue(agent[37].toString());
			

		}

		/*// create header row
		Row siteHeader = siteSheet.createRow(0);
		siteHeader.createCell(0).setCellValue("programname");
		//siteHeader.getCell(0).setCellStyle(style);
		siteHeader.createCell(1).setCellValue("ctzdatetime");
		//siteHeader.getCell(1).setCellStyle(style);
		siteHeader.createCell(2).setCellValue("SSactiveagents");
		//siteHeader.getCell(2).setCellStyle(style);
		siteHeader.createCell(3).setCellValue("totalagent");
		//siteHeader.getCell(3).setCellStyle(style);
		siteHeader.createCell(4).setCellValue("# of Agents Participating");
		//siteHeader.getCell(4).setCellStyle(style);
		siteHeader.createCell(5).setCellValue("RTC: # of Req Approved_Extra Hours_SS");
		//siteHeader.getCell(5).setCellStyle(style);
		siteHeader.createCell(6).setCellValue("RTC: # of Req Declined_Extra Hours_SS");
		//siteHeader.getCell(6).setCellStyle(style);
		siteHeader.createCell(7).setCellValue("# of Req Auto Approved_Extra Hours_SS");
		//siteHeader.getCell(7).setCellStyle(style);
		siteHeader.createCell(8).setCellValue("RTC: # of Hours Approved_Extra Hours_SS");
		//siteHeader.getCell(8).setCellStyle(style);
		siteHeader.createCell(9).setCellValue("RTC: # of Hours Declined_Extra Hours_SS");
		//siteHeader.getCell(9).setCellStyle(style);
		siteHeader.createCell(10).setCellValue("# of Hours Auto Approved_Extra Hours_SS");
		//siteHeader.getCell(10).setCellStyle(style);
		siteHeader.createCell(11).setCellValue("Recommended Agents_Extra Hours_Rule");
		//siteHeader.getCell(11).setCellStyle(style);
		siteHeader.createCell(12).setCellValue("# of RTC Approved_Extra Hours_Rule");
		//siteHeader.getCell(12).setCellStyle(style);
		siteHeader.createCell(13).setCellValue("Agent Accepted_Extra Hours_Rule");
		//siteHeader.getCell(13).setCellStyle(style);
		siteHeader.createCell(14).setCellValue("Agent Declined_Extra Hours_Rule");
		//siteHeader.getCell(14).setCellStyle(style);
		siteHeader.createCell(15).setCellValue("Agent No Response_Extra Hours_Rule");
		//siteHeader.getCell(15).setCellStyle(style);
		siteHeader.createCell(16).setCellValue("RTC: # of Req Approved_Time Off_SS");
		//siteHeader.getCell(16).setCellStyle(style);
		siteHeader.createCell(17).setCellValue("RTC: # of Req Declined_Time Off_SS");
		//siteHeader.getCell(17).setCellStyle(style);
		siteHeader.createCell(18).setCellValue("# of Req Auto Approved_Time Off_SS");
		//siteHeader.getCell(18).setCellStyle(style);
		siteHeader.createCell(19).setCellValue("RTC: # of Hours Approved_Time Off_SS");
		//siteHeader.getCell(19).setCellStyle(style);
		siteHeader.createCell(20).setCellValue("RTC: # of Hours Declined_Time Off_SS");
		//siteHeader.getCell(20).setCellStyle(style);
		siteHeader.createCell(21).setCellValue("# of Hours Auto Approved_Time Off_SS");
		//siteHeader.getCell(21).setCellStyle(style);
		siteHeader.createCell(22).setCellValue("Recommended Agents_Time Off_Rule");
		//siteHeader.getCell(22).setCellStyle(style);
		siteHeader.createCell(23).setCellValue("# of RTC Approved_Time Off_Rule");
		//siteHeader.getCell(23).setCellStyle(style);
		siteHeader.createCell(24).setCellValue("Agent Accepted_Time Off_Rule");
		//siteHeader.getCell(24).setCellStyle(style);
		siteHeader.createCell(25).setCellValue("Agent Declined_Time Off_Rule");
		//siteHeader.getCell(25).setCellStyle(style);
		siteHeader.createCell(26).setCellValue("Agent No Response_Time Off_Rule");
		//siteHeader.getCell(26).setCellStyle(style);
		siteHeader.createCell(27).setCellValue("Total Swaps");
		//siteHeader.getCell(27).setCellStyle(style);
		siteHeader.createCell(28).setCellValue("Total Swap Hours");
		//siteHeader.getCell(28).setCellStyle(style);
		siteHeader.createCell(29).setCellValue("Total Trades");
		//siteHeader.getCell(29).setCellStyle(style);
		siteHeader.createCell(30).setCellValue("# Trade Requests");
		//siteHeader.getCell(30).setCellStyle(style);
		siteHeader.createCell(31).setCellValue("Total Trade Hours");
		//siteHeader.getCell(31).setCellStyle(style);
		siteHeader.createCell(32).setCellValue("Scheduled Hours");
		//siteHeader.getCell(32).setCellStyle(style);
		siteHeader.createCell(33).setCellValue("CurrDayActiveLogins");
		//siteHeader.getCell(33).setCellStyle(style);
		siteHeader.createCell(34).setCellValue("RTC: # of Req Waiting_Extra Hours_SS");
		//siteHeader.getCell(34).setCellStyle(style);
		siteHeader.createCell(35).setCellValue("RTC: # of 201Hours Waiting_Extra Hours_SS");
		//siteHeader.getCell(35).setCellStyle(style);
		siteHeader.createCell(36).setCellValue("RTC: # of Req Waiting_Time Off_SS");
		//siteHeader.getCell(36).setCellStyle(style);
		siteHeader.createCell(37).setCellValue("RTC: # of Hours Waiting_Time Off_SS");
		//siteHeader.getCell(37).setCellStyle(style);
		siteHeader.createCell(38).setCellValue("siteid");
		//siteHeader.getCell(38).setCellStyle(style);
		siteHeader.createCell(39).setCellValue("sitename");
		//siteHeader.getCell(39).setCellStyle(style);
*/
		/**
		 * @SuppressWarnings("unchecked") List<User> users = (List<User>)
		 * model.get("usersList");
		 */

		/*
		 * List<Object> result = (List<Object>) LoadSource.list(); Iterator itr =
		 * result.iterator(); while(itr.hasNext()){ Object[] obj = (Object[])
		 * itr.next(); //now you have one array of Object for each row String client =
		 * String.valueOf(obj[0]); // don't know the type of column CLIENT assuming
		 * String Integer service = Integer.parseInt(String.valueOf(obj[1])); //SERVICE
		 * assumed as int //same way for all obj[2], obj[3], obj[4] }
		 */

		Iterator siteIt = siteAgents.iterator();
		int siteRowCount = 1;
		while (siteIt.hasNext()) {
			Object[] agent = (Object[]) siteIt.next();

			/*
			 * for (WorkflexConcentricProgram agent : agents) { Row userRow =
			 * sheet.createRow(rowCount++);
			 * userRow.createCell(0).setCellValue(agent.getProgramname());
			 */

			Row userRow = siteSheet.createRow(siteRowCount++);
			userRow.createCell(0).setCellValue(agent[0].toString());
			userRow.createCell(1).setCellValue(agent[1].toString());
			userRow.createCell(2).setCellValue(Integer.valueOf(agent[2].toString()));
			userRow.createCell(3).setCellValue(Integer.valueOf(agent[3].toString()));
			userRow.createCell(4).setCellValue(Integer.valueOf(agent[4].toString()));
			userRow.createCell(5).setCellValue(Integer.valueOf(agent[5].toString()));
			userRow.createCell(6).setCellValue(agent[6].toString());
			userRow.createCell(7).setCellValue(agent[7].toString());
			userRow.createCell(8).setCellValue(agent[8].toString());
			userRow.createCell(9).setCellValue(agent[9].toString());
			userRow.createCell(10).setCellValue(agent[10].toString());
			userRow.createCell(11).setCellValue(agent[11].toString());
			userRow.createCell(12).setCellValue(agent[12].toString());
			userRow.createCell(13).setCellValue(agent[13].toString());
			userRow.createCell(14).setCellValue(agent[14].toString());
			userRow.createCell(15).setCellValue(agent[15].toString());
			userRow.createCell(16).setCellValue(agent[16].toString());
			userRow.createCell(17).setCellValue(agent[17].toString());
			userRow.createCell(18).setCellValue(agent[18].toString());
			userRow.createCell(19).setCellValue(agent[19].toString());
			userRow.createCell(20).setCellValue(agent[20].toString());
			userRow.createCell(21).setCellValue(agent[21].toString());
			userRow.createCell(22).setCellValue(agent[22].toString());
			userRow.createCell(23).setCellValue(agent[23].toString());
			userRow.createCell(24).setCellValue(agent[24].toString());
			userRow.createCell(25).setCellValue(agent[25].toString());
			userRow.createCell(26).setCellValue(agent[26].toString());
			userRow.createCell(27).setCellValue(agent[27].toString());
			userRow.createCell(28).setCellValue(agent[28].toString());
			userRow.createCell(29).setCellValue(agent[29].toString());
			userRow.createCell(30).setCellValue(agent[30].toString());
			userRow.createCell(31).setCellValue(agent[31].toString());
			userRow.createCell(32).setCellValue(agent[32].toString());
			userRow.createCell(33).setCellValue(agent[33].toString());
			userRow.createCell(34).setCellValue(agent[34].toString());
			userRow.createCell(35).setCellValue(agent[35].toString());
			userRow.createCell(36).setCellValue(agent[36].toString());
			userRow.createCell(37).setCellValue(agent[37].toString());
			userRow.createCell(38).setCellValue(agent[38].toString());
			userRow.createCell(39).setCellValue(agent[39].toString());

		}

		 
		inputStream.close();
		
		 /*ServletOutputStream outputStream = response.getOutputStream();
		    IOUtils.copy(inputStream, outputStream);

		    outputStream.close();
		    inputStream.close();*/
		 
		 FileOutputStream outputStream = new FileOutputStream("Telus Dashboard.xlsx");
         workbook.write(outputStream);
         workbook.close();
         outputStream.close();
		    
	} catch (IOException | EncryptedDocumentException
            | InvalidFormatException ex) {
        ex.printStackTrace();
    }
	}
}

